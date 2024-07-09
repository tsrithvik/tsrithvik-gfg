//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] a = IntArray.input(br, N);
            Queue<Integer> q=new LinkedList<>();
            for(int i:a)q.add(i);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.rearrangeQueue(N, q);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        
        Queue<Integer> fst= new LinkedList<>();
        Queue<Integer> scnd= new LinkedList<>();
        
        int i=0;
        while(i<N/2){
            fst.add(q.poll());
            i++;
        }
        while(!q.isEmpty()){
            scnd.add(q.poll());
        }
        int j=0;
        while(!fst.isEmpty() || !scnd.isEmpty()){
            if(j%2==0) ans.add(fst.poll());
            else ans.add(scnd.poll());
            j++;
        }
        return ans;
    }
}
        
