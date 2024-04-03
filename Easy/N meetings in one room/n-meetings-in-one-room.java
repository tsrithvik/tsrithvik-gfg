//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(end[i]) || start[i]>start[hm.get(end[i])]){
                hm.put(end[i],i);
            }
        }
        int c=0, bookedupto=0;
        Arrays.sort(end);
        for(int i=0;i<n;i++){
            if(start[hm.get(end[i])]>bookedupto){
                bookedupto= end[i];
                c++;
            }
        }
        return c;
    }
}
