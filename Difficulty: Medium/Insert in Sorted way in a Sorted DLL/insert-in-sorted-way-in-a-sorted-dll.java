//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Ignore the newline character after t

        while (t-- > 0) {
            String input = sc.nextLine(); // Read the entire line for the array elements
            String[] values = input.split(" ");

            Node head = null, tail = null;
            for (String value : values) {
                int x = Integer.parseInt(value);
                if (head == null) {
                    head = new Node(x);
                    tail = head;
                } else {
                    tail.next = new Node(x);
                    tail.next.prev = tail;
                    tail = tail.next;
                }
            }

            int valueToInsert = sc.nextInt();
            if (sc.hasNextLine()) {
                sc.nextLine(); // Ignore the newline character after the value
            }

            Solution obj = new Solution();
            head = obj.sortedInsert(head, valueToInsert);
            printList(head);
        
System.out.println("~");
}

        sc.close();
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/*class of the node of the DLL is as
/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        
        // ArrayList<Integer> al= new ArrayList<>();
       Node ans = head;
        Node prev = null;
        
        while (head != null) {
            if (x > head.data) {
                prev = head;
                head = head.next;
            } else {
                Node add = new Node(x);
                add.next = head;
                add.prev = prev;
        
                if (prev != null) {
                    prev.next = add;
                } else {
                    // If x is the new head, we should update ans
                    ans = add;
                }
                
                if (head != null) {
                    head.prev = add;
                }
                
                break;
            }
        }
        
        if (head == null && prev != null) {
            // If we've reached the end of the list, insert at the end
            Node add = new Node(x);
            prev.next = add;
            add.prev = prev;
        }
        
        return ans;

        //Node tem= new Node(a)
        
    }
}