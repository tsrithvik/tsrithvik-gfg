//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
        
        // Your code here
        String bit="";
        while(N>0){
            bit+= Integer.toString(N%2);
            N/=2;
        }
        int c=0,max=0;
        for(int i=0;i<bit.length();i++){
            if(bit.charAt(i)=='1') c++;
            else{
                max= Math.max(c, max);
                c=0;
            }
            max= Math.max(c, max);
        }
        return max;
    }
}



//{ Driver Code Starts.

class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//input n
		    
		    Solution obj = new Solution();
		    
		    //calling maxConsecutiveOnes() function
		    System.out.println(obj.maxConsecutiveOnes(n));
		}
	}
}



// } Driver Code Ends