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
            
            
            int[] color = IntArray.input(br, N);
            
            
            int[] radius = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.finLength(N, color, radius);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int finLength(int N, int[] color, int[] radius) {
        // code here
        Stack<Integer> clr= new Stack<>();
        Stack<Integer> rad= new Stack<>();
        
         for(int i=0;i<N;i++){
            int cur_clr= color[i];
            int cur_rad= radius[i];
            
            if(clr.isEmpty() && rad.isEmpty()){
                clr.push(color[i]);
                rad.push(radius[i]);
            }
            else if(clr.peek()== cur_clr && rad.peek()==cur_rad){
                clr.pop();
                rad.pop();
            }
            else{
               clr.push(color[i]);
                rad.push(radius[i]);
            }
        }
        return clr.size();
    }
}
        
