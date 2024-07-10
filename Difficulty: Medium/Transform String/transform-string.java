//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transform (A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transform (String A, String B)
    {
        // code here
        
        
        if(A.length()!=B.length()) return -1;
        HashMap<Character, Integer> map= new HashMap<>();
        
        for(int i=0;i<A.length();i++){
            map.put(A.charAt(i), map.getOrDefault(A.charAt(i), 0)+1);
        }
        //System.out.print(map);
        for(int i=0;i<B.length();i++){
            if(!map.containsKey(B.charAt(i))){
                map.put(B.charAt(i), 1);
            }
            else{
                map.put(B.charAt(i), map.get(B.charAt(i))-1);
            }
        }
        //System.out.print(map);
        for(int i=0;i<B.length();i++){
            if(map.get(B.charAt(i))!=0){
                return -1;
                //int k=1;
            }
            
        }
        for(int i=0;i<A.length();i++){
            if(map.get(A.charAt(i))!=0){
                return -1;
                //int k=1;
            }
            
        }
        //System.out.print(map);
        int ans=0, i=A.length()-1, j= B.length()-1;
        
        while(i>=0 && j>=0){
            if(A.charAt(i)==B.charAt(j)){
                i--;
                j--;
            }
            else{
                i--;
                ans++;
            }
        }
        return ans;
    }
}