//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)throws IOException
    {
        
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int[] arr = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0; i < n; ++i)
                arr[i] = Integer.parseInt(s[i]);

    		out.println (new Solution().closestToZero (arr, n));
        }
        out.close();
        
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int closestToZero (int arr[], int n)
    {
        // your code here
        
            Arrays.sort(arr);
            int ans = Integer.MAX_VALUE;
           
            
            int low = 0;
            int high = n-1;
            
            while(low<high)
            {
                int sum = arr[low] + arr[high];
                if(sum == 0)
                    return 0;
                if((Math.abs(sum) <= Math.abs(ans)) ){
                    if(Math.abs(sum) == Math.abs(ans))
                    {
                        ans = Math.max(ans,sum);
                    }
                    else{
                        ans = sum;
                    }
                    
                    if(sum < 0)
                    {
                        low++;
                    }
                    else{
                        high--;
                    }
                }
                else{
                    if(sum < 0)
                    {
                        low++;
                    }
                    else{
                        high--;
                    }
                }
            }
           
            return ans;
        
    }
}