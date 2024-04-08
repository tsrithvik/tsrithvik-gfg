//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        String ans="";
        ArrayList<Character> al= new ArrayList<>();
        for(int i=0;i<A.length();i++){
            if(!al.contains(A.charAt(i))) al.add(A.charAt(i));
        }
        ArrayList<Character> ala= new ArrayList<>();
        for(int i=0;i<B.length();i++){
            if(!ala.contains(B.charAt(i))) ala.add(B.charAt(i));
        }
        ArrayList<Character> temp= new ArrayList<>(al);
        al.removeAll(ala);
        ala.removeAll(temp);
        //System.out.print(al);
        //System.out.print(ala);
        
        al.addAll(ala);
        Collections.sort(al);
        //System.out.print(al);
        for(int i=0;i<al.size();i++){
            ans+=al.get(i);
        }
        if(ans.length()<1) return "-1";
        return ans;
    }
}