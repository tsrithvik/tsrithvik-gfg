//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        
        Queue<Integer> pt= new LinkedList<>();
        Queue<Integer> ng= new LinkedList<>();
        
        for(Integer i: arr){
            if(i<0) ng.add(i);
            else pt.add(i);
        }
        int i=0;
        arr.clear();
        while(!pt.isEmpty() && !ng.isEmpty()){
            if(i%2==0) arr.add(pt.poll());
            else arr.add(ng.poll());
            i++;
        }
        
        while(!pt.isEmpty()) arr.add(pt.poll());
        while(!ng.isEmpty()) arr.add(ng.poll());
        
        
    }
}