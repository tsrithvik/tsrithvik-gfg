//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main{
    
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		
		//input number of testcases
		int t=sc.nextInt();
		int m,n;
		while(t-->0) {
		    
		    
            Solution obj = new Solution();
            //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    System.out.println(obj.posOfRightMostDiffBit(m, n));
		}
	}
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here      
        if(m==n) return -1;
        int[] bits1= new int[32];
        int[] bits2= new int[32];
        Arrays.fill(bits1, 0);
        Arrays.fill(bits2, 0);
        int i=0,j=0;
        while(m>0){
            bits1[i]= m%2;
            m/=2;
            i++;
        }
        while(n>0){
            bits2[j]= n%2;
            n/=2;
            j++;
        }
        i=0;
        while(i<32){
            if(bits1[i]!=bits2[i]) return i+1;
            i++;
        }
        return -1;
    }
}


