//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int numerator = Integer.parseInt(S[0]);
            int denominator = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            String ans = ob.fractionToDecimal(numerator, denominator);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String  fractionToDecimal(int num, int den)
    {
        // code here
        
        StringBuilder ans= new StringBuilder(Integer.toString(num/den));
        
        int rem= num%den;
        if(rem==0) return ans.toString();
        ans.append(".");
        Map<Integer, Integer> map= new HashMap<>();
       // String frac="";
        while(rem!=0){
            if(map.containsKey(rem)){
                ans.insert(map.get(rem), "(");
                
                ans.append(")");
                break;
            }
            else{
                
                map.put(rem, ans.length());
                
                num= (rem*10)/den;
                ans.append(num);
                rem= (rem*10)%den;
            }
            
        }
        return ans.toString();
        
    }
}