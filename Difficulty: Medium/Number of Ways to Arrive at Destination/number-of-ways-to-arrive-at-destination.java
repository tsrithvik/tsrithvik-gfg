//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
// Position this line where user code will be pasted.

class GFG {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                List<Integer> temp = new ArrayList<>();
                for (int j = 0; j < 3; j++) {
                    int x = sc.nextInt();
                    temp.add(x);
                }
                adj.add(temp);
            }

            Solution obj = new Solution();
            System.out.println(obj.countPaths(n, adj));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Node {
    int val;
    long dist;
    public Node(int val,long dist) {
        this.val = val;
        this.dist = dist;
    }
}

class Solution {
    
    static int dijkstra(List<List<Node>> adj,int size) {
        PriorityQueue<Node> minHeap = new PriorityQueue<>((a,b) -> Long.compare(a.dist,b.dist));
        long[] dist = new long[size];
        int[] ways = new int[size];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0] = 0;
        ways[0] = 1;
        
        minHeap.add(new Node(0,0));
        int mod = (int)(1e9 + 7);
        
        while(!minHeap.isEmpty()) {
            Node node = minHeap.poll();
            
            for(Node n : adj.get(node.val)) {
                if(dist[n.val] > node.dist + n.dist) {
                    dist[n.val] = node.dist + n.dist;
                    ways[n.val] = ways[node.val];
                    //fist time visiting the node
                    //with that short path
                    minHeap.add(new Node(n.val,dist[n.val]));
                }
                else if(node.dist + n.dist == dist[n.val])
                    ways[n.val] = (ways[n.val] + ways[node.val]) % mod;
            }
        }
        return ways[size - 1];
    }

    static int countPaths(int n, List<List<Integer>> roads) {
        List<List<Node>> adj = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
            adj.add(new ArrayList<>());
            
        //creating graph
        //get(0) makes the connections from one node to other 
        //in one direction to make the bi directional connections
        // we again connect via get(1)
        for(List<Integer> road : roads) {
            adj.get(road.get(0)).add(new Node(road.get(1),road.get(2)));
            adj.get(road.get(1)).add(new Node(road.get(0),road.get(2)));
        }
        
        return dijkstra(adj,n);
    }
}
