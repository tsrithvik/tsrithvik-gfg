//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
    
            String S[] = read.readLine().split(" ");
            
            Stack<Integer> st = new Stack<Integer>();
            ArrayList<Integer> copy = new ArrayList<>();
            
            for(int i=0; i<N; i++)
            {
                st.push(Integer.parseInt(S[i]));
                copy.add(Integer.parseInt(S[i]));
            }
            
            Collections.reverse(copy);
            
            Stack<Integer> cloned = new Stack<Integer>();
            
            Solution ob = new Solution();
            
            ob.clonestack(st,cloned);
            
            ArrayList<Integer> check = new ArrayList<>();
            while(cloned.size() != 0)
                check.add(cloned.pop());
            
            int flag = 0;
            
            if(copy.equals(check))
                flag = 0;
            else
                flag = 1;
            
            System.out.println(1-flag);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    void clonestack(Stack<Integer> st, Stack<Integer> cloned) {
        // code here
        Stack<Integer> stack= new Stack<Integer>();
      //}
      while(!st.isEmpty()){
        stack.push(st.peek());
        st.pop();
      }
      
        while(!stack.isEmpty()){
            int c=stack.peek();
            cloned.push(c);
            stack.pop();
        }
    }
}
/*
while(!st.isEmpty()){
            int c=st.peek();
            cloned.push(c);
            st.pop();
        }
        reverse(cloned);
    }
    static void reverse(Stack<Integer> st)
    {
        if (st.size() > 0) {
 
            // Hold all items in Function
            // Call Stack until we
            // reach end of the stack
            char x = st.peek();
            st.pop();
            reverse();
 
            // Insert all the items held
            // in Function Call Stack
            // one by one from the bottom
            // to top. Every item is
            // inserted at the bottom
            insert_at_bottom(x);
        }
    }
    static void insert_at_bottom(char x)
    {
 
        if (st.isEmpty())
            st.push(x);
 
        else {
 
            // All items are held in Function
            // Call Stack until we reach end
            // of the stack. When the stack becomes
            // empty, the st.size() becomes 0, the
            // above if part is executed and
            // the item is inserted at the bottom
            char a = st.peek();
            st.pop();
            insert_at_bottom(x);
 
            // push allthe items held
            // in Function Call Stack
            // once the item is inserted
            // at the bottom
            st.push(a);
        }*/