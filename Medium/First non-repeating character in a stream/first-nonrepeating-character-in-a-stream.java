//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        StringBuilder ans= new StringBuilder();
        HashMap<Character, Integer> hm= new HashMap<>();
        Queue<Character> q= new LinkedList<>();
        
        for(int i=0;i<A.length();i++){
            hm.putIfAbsent(A.charAt(i), 0);
            hm.put(A.charAt(i), hm.get(A.charAt(i))+1);
            if(hm.get(A.charAt(i))!=0) q.add(A.charAt(i));
            while(!q.isEmpty() && hm.get(q.peek())>1) q.remove();
            if(q.size()==0) ans.append('#');
            else ans.append(q.peek());
        }
        return ans.toString();
    }
}