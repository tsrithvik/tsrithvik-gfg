//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            String s = input[0];
            int k = Integer.parseInt(input[1]);
            Solution ob = new Solution();
            System.out.println(ob.countOfSubstringWithKOnes(s, k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    long countOfSubstringWithKOnes(String str, int k){
        //  code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        long ans=0;
        for(int i=0;i<str.length();i++){ 
            sum+= (str.charAt(i)-'0'); 
            if(sum==k){
                ans++;
            }
            if(map.containsKey(sum-k)){
                ans+= map.get(sum-k);
            }
            if(!map.containsKey(sum)) map.put(sum,1);
            else{
                int j= map.get(sum);
                j++;
                map.put(sum,j);
                
            }
        }
        
        return ans; 
        
    }
}