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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        // code here
         int max=0;

         ArrayList<Character> a=new ArrayList<>();

        for(int i=0;i<S.length();i++){

            for(int j=i;j<S.length();j++){

                if(!a.contains(S.charAt(j))){

                    a.add(S.charAt(j));

                }else{

                    break;

                }

            }

         if(max<a.size()){

             max=a.size();

         }

         a.clear();
         
        }

        return max;

        
    }
}