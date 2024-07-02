//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class GfG
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Sol obj = new Sol();
            
            printList(obj.findUnion(head1, head2));
            System.out.println();
        }
    }
}
// } Driver Code Ends


/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Sol
{
	public static Node findUnion(Node node1,Node node2)
	{
	    //Add your code here.
	    ArrayList<Integer> al= new ArrayList<>();
	    while(node1!=null){
	        if(!al.contains(node1.data)) al.add(node1.data);
	        node1= node1.next;
	    }
	    while(node2!=null){
	        if(!al.contains(node2.data)) al.add(node2.data);
	        node2= node2.next;
	    }
	    Collections.sort(al);
	    Node ans= new Node(0);
	    Node dummy= ans;
	    for(int i=0;i<al.size();i++){
	        ans.next= new Node(al.get(i));
	        ans= ans.next;
	    }
	    return dummy.next;
	}
}