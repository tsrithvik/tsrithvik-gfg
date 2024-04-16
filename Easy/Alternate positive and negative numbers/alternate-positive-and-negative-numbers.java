//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        Queue<Integer> q1 = new LinkedList<>();
Queue<Integer> q2 = new LinkedList<>();

for (int i = 0; i < n; i++) {
    if (arr[i] >= 0)
        q1.add(arr[i]);
    else
        q2.add(arr[i]);
}

int idx = 0;
while (!q1.isEmpty() || !q2.isEmpty()) {
    if (idx % 2 == 0 && !q1.isEmpty())
        arr[idx++] = q1.poll();
    else if (!q2.isEmpty())
        arr[idx++] = q2.poll();
    else
        arr[idx++] = q1.poll(); // if q2 is empty, take from q1
}

    }
}