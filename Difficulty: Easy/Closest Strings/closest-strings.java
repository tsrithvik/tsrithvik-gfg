//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            ArrayList<String> arr = new ArrayList<String>();
            String input[] = read.readLine().split(" ");
            
            for(int i = 0; i < n; i++){
                arr.add(input[i]);
            }
            String word1 = read.readLine();
            String word2 = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(arr,word1,word2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        
        if(s.size()<=1 || word1.equals(word2)) return 0;
        
        int st=-1, e=-1;
        int diff= Integer.MAX_VALUE;
        for(int i=0;i<s.size();i++){
            String word= s.get(i);
            if(word.equals(word1)) st=i;
            if(word.equals(word2)){
                e=i;
            }
            if(e!=-1 && st!=-1) diff= Math.min(diff, Math.abs(st-e));
        }
        return diff;
    }
};