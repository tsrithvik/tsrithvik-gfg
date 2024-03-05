//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim()); // size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    Solution ob = new Solution();
		    
		    System.out.println(ob.maxIndexDiff(arr, n)); // print the result
		}
	}
}
// } Driver Code Ends


class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        
        // Your code here
      int MAX=0;
        int i=0,j=n-1;
        while(i<n){
            if(a[i]<=a[j]){
                MAX=Math.max(MAX,j-i);
                j=n-1;
                i++;
            }
            else{
                j--;
            }
        }
        return MAX;
      
    }
       
    }

 /* int c=0;
      //int[] arr= new int[n];
      ArrayList<Integer> arr= new ArrayList<Integer>();
      int j=n-1;
        while(j>=0){
        for(int i=0;i<n;i++){
            if(a[i]<=a[j] && i<=j) arr.add(j-i);
        }
        j--;
        }
        //System.out.print(arr);
        Object[] ar = arr.toArray();
        Arrays.sort(ar);
        int k= ar.length;
        //System.out.print(ar[k-1]);
        return (int)ar[k-1];
        
        */
