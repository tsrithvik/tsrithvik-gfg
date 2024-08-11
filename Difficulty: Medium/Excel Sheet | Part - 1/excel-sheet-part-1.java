//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine());
    
	    while(t > 0){
	        int n = Integer.parseInt(br.readLine());
	        Solution T = new Solution();
	        
	        System.out.println(T.excelColumn(n));
	        
            t--;
	    }
	}
    
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public String excelColumn(int N){
        
        //  Your code here
        String ans= "";
        StringBuilder sol= new StringBuilder();
        ArrayList<Integer> a= new ArrayList<>();
        while(N>0){
            if(N%26==0){
                a.add(26);
                N=(N/26)-1;
            }
            else{
               a.add(N%26);
                N/=26; 
            }
            
        }
        //System.out.print(a);
        while(a.size()>0){
            int v= a.get(a.size()-1)-1;
            char c= (char)(v+'A');
            ans+= c;
            a.remove(a.size()-1);
        }
        
        return ans;
    }
}