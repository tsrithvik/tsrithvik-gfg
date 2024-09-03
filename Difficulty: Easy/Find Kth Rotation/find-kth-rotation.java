//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int c=0;
        int n= arr.size();
        
        for(int i=0;i<n-1;i++){
              c++;
             if(arr.get(i)>arr.get(i+1))
             {
               c=i+1;
               //break;
               return c;
             }
        }
     
        if(c==n-1) return 0;
        return c;
    }
}