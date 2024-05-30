//{ Driver Code Starts
// Initial Template for Java

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

public class Driverclass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }

    public static void printList(Node head, PrintWriter out) {
        if (head == null) return;

        Node temp = head;
        while (temp != null) {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        if (head == null || head.next == null) {
        return head;
    }

    // Create dummy heads for three lists
    Node zeroHead = new Node(0);
    Node oneHead = new Node(0);
    Node twoHead = new Node(0);

    // Pointers to the current last node of each list
    Node zero = zeroHead;
    Node one = oneHead;
    Node two = twoHead;

    Node current = head;

    // Traverse the list and distribute the nodes into three lists
    while (current != null) {
        if (current.data == 0) {
            zero.next = current;
            zero = zero.next;
        } else if (current.data == 1) {
            one.next = current;
            one = one.next;
        } else if (current.data == 2) {
            two.next = current;
            two = two.next;
        }
        current = current.next;
    }

    // Connect the three lists
    zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
    one.next = twoHead.next;
    two.next = null; // End of the list

    // The head of the sorted list is the first node of the zero list
    return zeroHead.next;
    }
}
