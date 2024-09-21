//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class ReverseInSize {
    static Node head;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());

        while (t-- > 0) {

            String s[] = in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < s.length; i++) {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res, out);
            out.println();
        }
        out.close();
    }

    public static void printList(Node node, PrintWriter out) {
        while (node != null) {
            out.print(node.data + " ");
            node = node.next;
        }
    }
}

// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverse(Node node, int k) {
        // Your code here
        
        Stack<Integer> st= new Stack<>();
        Node temp= new Node(0);
        Node ans= temp;
        
        if(k==1){
            /* while(node!=null){
                st.push(node.data);
                node= node.next;
            }
            while(!st.isEmpty()){
                temp.next= new Node(st.pop());
                temp= temp.next;
            }
            */
            return node;
        }
        
        else{
            
            st.push(node.data);
            while(node!=null){
                if(node.next!=null){
                    node= node.next;
                    st.push(node.data);
                }
                else break;
                
                
                if(st.size()==k){
                    while(!st.isEmpty()){
                        //temp.data= st.pop();
                        temp.next= new Node(st.pop());
                        temp= temp.next;
                    }
                }
            }
            while(!st.isEmpty()){
                //temp.data= st.pop();
                temp.next= new Node(st.pop());
                temp= temp.next;
            }
            
        }
        return ans.next;
        
    }
}
