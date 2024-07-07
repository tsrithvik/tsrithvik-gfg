//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int key = Integer.parseInt(in.readLine().trim());

            out.println(new Solution().threeSumClosest(arr, key));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int threeSumClosest(int[] array, int target) {
        // code here
        
        int maxsum = Integer.MAX_VALUE;
           Arrays.sort(array);
        for(int i = 0; i < array.length-2; i++)
        {
            int l =i+1,r = array.length-1;
            while(l<r){
            int sum = array[i]+array[l]+array[r];
            
            if(sum == target)
            {
                return sum;
            }
            
            if(Math.abs(target-sum)<Math.abs(target-maxsum))
            {
                maxsum = sum;
            }
            if(Math.abs(target-sum)==Math.abs(target-maxsum))
            {
                maxsum = Math.max(maxsum,sum);
            }
            if(sum>target)
            {
                r--;
            }
            else{
                l++;
            }
            }
        }
        return maxsum;
    }
}
