//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while (testcases-- > 0) {
            int sizeOfArray = Integer.parseInt(br.readLine());
            int arr[] = new int[sizeOfArray];

            String line = br.readLine();
            String[] elements = line.trim().split("\\s+");
            for (int i = 0; i < sizeOfArray; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            Complete obj = new Complete();
            arr = obj.Smallestonleft(arr, sizeOfArray);
            for (int i = 0; i < sizeOfArray; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            // System.out.println(re);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Complete {

    // Function for finding maximum and value pair
    public static int[] Smallestonleft(int arr[], int n) {
        // Complete the function
        
        Stack<Integer> st= new Stack<>();
        //ArrayList<Integer> al= new ArrayList<>();
        int[] ans= new int[n];
        TreeSet<Integer> set = new TreeSet<>();  // TreeSet to maintain the elements on the left side in sorted order
    
        // Traverse through the array
        for (int i = 0; i < n; i++) {
            // Find the greatest element in the set that is strictly less than the current element
            Integer greatestLess = set.lower(arr[i]);
            
            // If no such element is found, assign -1
            ans[i] = (greatestLess == null) ? -1 : greatestLess;
            
            // Add the current element to the set
            set.add(arr[i]);
        }
        
        return ans;
        
    }
    
    /*
    10
3 5 4 2 2 5 5 4 2 5
Your Code's output is: 
-1 3 3 -1 -1 2 2 2 -1 2
It's Correct output is: 
-1 3 3 -1 -1 4 4 3 -1 4
*/
}
