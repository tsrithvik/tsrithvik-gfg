//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
    static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    
		    Node head = new Node(sc.nextInt());
		    Node tail = head;
		    
		    for(int i=1; i<n; i++){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		    Solution obj = new Solution();
		    head = obj.sort(head);
		    printList(head);
		}
	}
}

// } Driver Code Ends



/*
class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        ArrayList<Integer> odd= new ArrayList<>();
        ArrayList<Integer> even= new ArrayList<>();
        Node temp= head;
        int j=0;
        while(temp!=null){
            
            if(j%2==0){
                even.add(temp.data);
            }
            else{
                odd.add(temp.data);
            }
            temp= temp.next;
            j++;
        }
        
        Node ans= new Node(0);
        Node rans= ans;
        for(int i=0;i<even.size();i++){
            ans.next= new Node(even.get(i));
            ans= ans.next;
        }
        for(int i=odd.size()-1;i>=0;i--){
            ans.next= new Node(odd.get(i));
            ans= ans.next;
        }
        
        return rans.next;
   }


}