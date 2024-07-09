//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String args[]) {
        // taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking total number of elements
            int n = sc.nextInt();

            // taking size of subArrays
            int k = sc.nextInt();

            // Declaring and Intializing an array of size n
            int arr[] = new int[n];

            // adding all the elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Calling the method max_of_subarrays of class solve
            // and storing the result in an ArrayList
            ArrayList<Integer> res = new Solution().max_of_subarrays(arr, n, k);

            // printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    static class pair implements Comparable<pair>{
        int val;
        int index;
        pair(int val, int index){
            this.val= val;
            this.index= index;
        }
        @Override
        public int compareTo(pair other) {
            return Integer.compare(other.val, this.val); // for descending order
        }
    }
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        
        ArrayList<Integer> al= new ArrayList<>();
        
        Queue<pair> q= new PriorityQueue<>();
        
        for(int i=0;i<k;i++){
            q.add(new pair(arr[i], i));
        }
        al.add(q.peek().val);
        for(int i=k;i<n;i++){
            
            while(!q.isEmpty() && q.peek().index<=i-k){
                q.poll();
            }
            q.add(new pair(arr[i], i));
            al.add(q.peek().val);
        }
        
        return al;
    }
    
}