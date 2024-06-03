//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.rotate (n, d);
            System.out.println(res.get(0));
            System.out.println(res.get(1));
            
           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        // your code here
        ArrayList<Integer> results= new ArrayList<>();
        int[] bits= new int[16];
        Arrays.fill(bits, 0);
        int i=0;
        while(N>0){
            bits[i]= N%2;
            N/=2;
            i++;
        }
        int[] leftBits = Arrays.copyOf(bits, bits.length);
        int[] rightBits = Arrays.copyOf(bits, bits.length);

        // Rotate bits D times to the left
        for (int j = 0; j < D; j++) {
            int first = leftBits[0];  // Get the first bit for left rotation
            for (i = 0; i < 15; i++) {
                leftBits[i] = leftBits[i + 1];
            }
            leftBits[15] = first;  // Place the first bit in the last position
        }

        // Rotate bits D times to the right
        for (int j = 0; j < D; j++) {
            int last = rightBits[15];  // Get the last bit for right rotation
            for (i = 15; i > 0; i--) {
                rightBits[i] = rightBits[i - 1];
            }
            rightBits[0] = last;  // Place the last bit in the first position
        }
        int rightSum = 0;
        for (i = 0; i < 16; i++) {
            rightSum += Math.pow(2, i) * rightBits[i];
        }
        results.add(rightSum);
        // Convert left rotated bits back to an integer
        int leftSum = 0;
        for (i = 0; i < 16; i++) {
            leftSum += Math.pow(2, i) * leftBits[i];
        }
        results.add(leftSum);

        // Convert right rotated bits back to an integer
        

        return results;
    }
}