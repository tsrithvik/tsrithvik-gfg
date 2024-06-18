//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int n, int arr[]){
        // code here
        int index= -1;
        
        //to find the smaller element at the last
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index= i;
                break;
            }
        }
        List<Integer> ls= new ArrayList<>();
        
        //to handle spl case
        if(index==-1){
            //reverse the whole array
            swap(arr, 0, n-1);
        }
        else{
            //find the largest element after the last smallest number index
            for(int i=n-1;i>=0;i--){
                if(arr[i]>arr[index]){
                    int temp= arr[i];
                    arr[i]= arr[index];
                    arr[index]= temp;
                    break;
                }
                
            }
            swap(arr, index+1, n-1);
            
        }
            for(int i=0;i<n;i++){
                ls.add(arr[i]);
                
            }
            return ls;
    }
    static void swap(int[] arr, int i, int j){
        while(i<j){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }
}