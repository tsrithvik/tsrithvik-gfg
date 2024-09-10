//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String A[] = in.readLine().trim().split(" ");
            int N = Integer.parseInt(A[0]);
            A = in.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.isCircle(A));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int isCircle(String arr[]) {
        // code here
        
        HashMap<Character, ArrayList<Character>> map= new HashMap<>();
        int[] in = new int[26];
        int[] out = new int[26];
        int n= arr.length;
        
        for(int i=0;i<n;i++){
            String s= arr[i];
            char fst= s.charAt(0);
            char lst= s.charAt(s.length()-1);
            if(!map.containsKey(fst)){
                ArrayList<Character> al= new ArrayList<>();
                map.put(fst, al);
            }
            map.get(fst).add(lst);
            in[fst- 'a']++;
            out[lst- 'a']++;
        }
        
        //number of characters must be same at the start and end
        for(int i=0;i<26;i++){
            if(in[i]!=out[i])  return 0;
        }
        
        HashSet<Character> vis= new HashSet<>();
        return (dfs(vis, map, arr[0].charAt(0))) ? 1 : 0;
        
    }
    //dfs checks whether all the nodes are strongly connected or not
    //strongly connected nodes - node can return to itself from any
    //node connected to it.
    public static boolean dfs(Set<Character> vis, HashMap<Character, ArrayList<Character>> map, char c){
        
        //if it reaches the node itself and the count of connected nodes are equal
        if(vis.contains(c)){
            return vis.size()==map.size();
        }
        
        vis.add(c);
        
        for(char ch: map.get(c)){
            if(dfs(vis, map, ch))
                return true;
                
        }
        
        return false;
    }
}