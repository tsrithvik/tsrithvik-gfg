//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {

    /* Function to print linked list */
    public static void print(Node root) {
        Node temp = root;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    /* Driver program to test above functions */
    public static void main(String args[]) throws IOException {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t > 0) {

            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node copy = head;
            for (int i = 1; i < s.length; i++) {
                Node temp = new Node(Integer.parseInt(s[i]));
                copy.next = temp;
                copy = copy.next;
            }
            Solution ob = new Solution();
            Node result = ob.compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
// import java.util.*;
class Solution {
    Node compute(Node head) {
        // your code here
        
        //Queue<Integer> q = new LinkedList<Integer>();
        Stack<Integer> q= new Stack<>();
        Stack<Integer> tempQ= new Stack<>();
        while(head!=null){
            if(!tempQ.isEmpty() && tempQ.peek()>=head.data){
                tempQ.push(head.data);
            }
            else{
                while(!tempQ.isEmpty() && tempQ.peek()<head.data){
                    tempQ.pop();
                }
                tempQ.add(head.data);
                
            }
            head= head.next;
        }
        //System.out.print(tempQ);
        while(!tempQ.isEmpty()) q.push(tempQ.pop());
        
        Node temp= new Node(q.pop());
        Node ans= temp;
        while(!q.isEmpty()){
            temp.next= new Node(q.pop());
            temp= temp.next;
        }
        
        return ans;
    }
}
