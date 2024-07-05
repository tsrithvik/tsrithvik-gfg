//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    int maxIndexDiff(int arr[], int n) {
        // code here
        
        //int maxi=0;
        int[] lmin= new int[n];
        int[] rmax= new int[n];
        int min= arr[0];
        lmin[0]= arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                lmin[i]= arr[i];
                min= arr[i];
            }
            else{
                lmin[i]= min;
            }
        }
        
        int max= arr[n-1];
        rmax[n-1]= arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                rmax[i]= arr[i];
                max= arr[i];
            }
            else{
                rmax[i]= max;
            }
        }
        
        int maxi=0;
        int i=0, j=0;
        while(i<n && j<n){
            if(lmin[i]<=rmax[j]){
                maxi= (int) Math.max(maxi, j-i);
                j++;
            }
            else
                i++;
            
        }
        return maxi;
    }
}