//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        String k = Integer.toBinaryString(a);
        String p = Integer.toBinaryString(b);
        int c= 0;
        int n=Math.min(k.length(), p.length());
        int m= Math.max(k.length(), p.length());
        String str="";
        for(int i=0;i<m-n;i++){
         str+='0'; 
        }
        if(k.length()<p.length()) k= str+k;
        else p= str+p;
        for(int i=0;i<m;i++){
            //boolean l= k.charAt(i);
            //int p= m.charAt(i);
            int i1 = Character.getNumericValue( k.charAt(i));
            int i2 = Character.getNumericValue( p.charAt(i));
            int res= i1^i2;
            if(res==1) c++;
        }
        return c;
    }
    
    
}


//{ Driver Code Starts.

// Driver class
class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int m, n;
		long ans = 0; // initialise ans to 0
		while(t-->0) {
		    
		    //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    Solution obj = new Solution();
		    System.out.println(obj.countBitsFlip(m, n));
		}
	}
}


// } Driver Code Ends