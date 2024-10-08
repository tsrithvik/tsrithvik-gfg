//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int k = Integer.parseInt(sc.next());
		    
		    String[] words = new String[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        words[i] = sc.next();
		    }
		    
		    Solution ob = new Solution();
		  //  System.out.println(T.findOrder(words,k));
		    String order = ob.findOrder(words,n,k);
		    if(order.length() == 0){
		        System.out.println(0);
		        continue;
		    }
		    if(order.length() != k){
		        System.out.println("INCOMPLETE");
		        return;
		    }
		    String temp[] = new String[n];
		    for(int i=0;i<n;i++)
		        temp[i] = words[i];
		    
		    Arrays.sort(temp, new Comparator<String>(){
		    
		      @Override
                public int compare(String a, String b) {
                    int index1 = 0;
                    int index2 = 0;
                    for(int i = 0; i < Math.min(a.length(), b.length()) 
                                        && index1 == index2; i++) {
                        index1 = order.indexOf(a.charAt(i));
                        index2 = order.indexOf(b.charAt(i));
                    }
                
                    if(index1 == index2 && a.length() != b.length()) 
                    {
                        if(a.length() < b.length())
                            return -1;
                        else
                            return 1;
                    }
                
                    if(index1 < index2)
                        return -1;
                    else
                        return 1;
                        
                }
		    });
		    
		    int flag = 1;
		    for(int i=0;i<n;i++)
		    {
		        if(!words[i].equals(temp[i]))
	            {
	                flag = 0;
	                break;
	            }
		    }
		    
		    System.out.println(flag);
		}
	}
	
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String ans = "";
    public String findOrder(String [] dict, int N, int K) {
        // Write your code here
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < K; i++) graph.add(new ArrayList<Integer>());

        for(int i = 0; i < N - 1; i++) {
            String wd1 = dict[i];
            String wd2 = dict[i + 1];
            for(int j = 0; j < Math.min(wd1.length(), wd2.length()); j++) {
                if(wd1.charAt(j) != wd2.charAt(j)) {
                    graph.get(wd1.charAt(j) - 'a').add(wd2.charAt(j) - 'a');
                    break;
                }
            }
        }

        boolean[] vis = new boolean[K];
        
        for(int i = 0; i < K; i++) {
            if(!vis[i]) dfs(i, graph, vis);
        }
        return ans;
    }
    public void dfs(int i, ArrayList<ArrayList<Integer>> graph, boolean[] vis) {
        vis[i] = true;
        ArrayList<Integer> list = graph.get(i);
        for(int x : graph.get(i)) {
            if(!vis[x]) dfs(x, graph, vis);
        }
        char ch = (char)(i + 'a');
        ans = ch + ans;
    }
}