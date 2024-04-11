//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
        //int[] bool= new int[32];
        if(n==0) return 0;
        ArrayList<Integer> bool= new ArrayList<>();
        
        while(n>=1){
            bool.add(n%2);
            n/=2;
        }
        ///System.out.print(bool);
        ArrayList<Integer> bin= new ArrayList<>();
        int msb= bool.get(bool.size()-1);
        bin.add(msb);
        for(int i=bool.size()-2;i>=0;i--){
            
            msb^=bool.get(i);
            bin.add(msb);
            
        }    
        //System.out.print(bin);
        int ans=0,k=bin.size()-1;
        for(int i=0;i<bin.size() && k>=0;i++){
          ans+= Math.pow(2,i)*bin.get(k--);
        }
        //System.out.print(ans);
        return ans;
    }
       
}



//{ Driver Code Starts.

class GFG {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//initializing n
		    
		    Solution obj = new Solution();
		    
		    //calling grayToBinary() function
		    System.out.println(obj.grayToBinary(n));
		}
	}
}

// } Driver Code Ends