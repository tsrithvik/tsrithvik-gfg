//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases

        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            long[] a = new long[input.length];

            for (int i = 0; i < input.length; i++) {
                a[i] = Long.parseLong(input[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.minCost(a));
        }
    }
}

// } Driver Code Ends


//Back-end complete function Template for Java
class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        // code here
        
        Arrays.sort(arr);
        Queue<Long> q= new PriorityQueue<>();
        long sum=0, ans=0;
        for(long i: arr) q.add(i);
        
        while(q.size()>1){
            long fst= q.poll();
            long scnd= q.poll();
            sum= fst+scnd;
            //if(q.size()==1) return sum;
            ans+=sum;
            //System.out.println(ans);
            q.add(sum);
            
        }
        
        return ans;
        
    }
}