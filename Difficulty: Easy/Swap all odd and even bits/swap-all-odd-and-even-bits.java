//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to swap odd and even bits.
    public static int swapBits(int n) 
    {
	    // Your code
	    
	    StringBuilder bit= new StringBuilder();
	    
	    while(n>0){
	        bit.append(n%2);
	        n/=2;
	    }
	    if(bit.length()%2!=0){
	        bit.append(0);
	    }
	    
	    //bit.toString();
	    
	    StringBuilder sol= new StringBuilder();
	    int ans=0;
	    for(int i=0;i<bit.length();i+=2){
	        sol.append(bit.charAt(i+1));
	        sol.append(bit.charAt(i));
	    }
	    
	    for(int i=0;i<bit.length();i++){
	        ans+= Math.pow(2,i)*(sol.charAt(i)-'0');
	    }
	    return ans;
	}
    
}

//{ Driver Code Starts.

class BitWise{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//taking n
		    
		    Solution obj = new Solution();
		    
		    //calling swapBits() method of class
		    //Swap
		    System.out.println(obj.swapBits(n));
		}
	}
}
// } Driver Code Ends