//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int dataTypeSize(String str) {
        // code here
        if(str.charAt(0) == 'I' || str.charAt(0) == 'F') return 4;
        else if(str.charAt(0) == 'C') return 1;
        /*else if(str== "Long") return 8;
        else if(str== "Double") return 8;*/
        else if(str.charAt(0) == 'S') return 2;
        return 8;
    }
}