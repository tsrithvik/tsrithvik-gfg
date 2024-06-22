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
            
            
            int[] S = IntArray.input(br, N);
            
            
            int[] F = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.maxMeetings(N, S, F);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends




class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        ArrayList<pair> al= new ArrayList<>();
        for(int i=0;i<N;i++){
            al.add(new pair(S[i], F[i], i+1));
        }
        Collections.sort(al, (a1, a2)-> a1.end- a2.end);
        int scheduledtime= -1;
        for(int i=0;i<N;i++){
            pair cm= al.get(i);
            if(cm.start>scheduledtime){
                ans.add(cm.index);
                scheduledtime= cm.end;
                
            }
            Collections.sort(ans);
        }
        return ans;
    }
    static class pair{
        int start;
        int end;
        int index;
        pair(int start, int end, int index){
            this.start= start;
            this.end= end;
            this.index= index;
        }
    }
}
        
