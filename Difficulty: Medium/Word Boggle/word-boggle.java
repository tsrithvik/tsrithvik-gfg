//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            String[] dictionary = new String[N];
            for(int i=0;i<N;i++)
            {
                dictionary[i] = sc.next();
            }
            
            int R = Integer.parseInt(sc.next());
            int C = Integer.parseInt(sc.next());
            
            char board[][] = new char[R][C];
            for(int i=0;i<R;i++)
            {
                for(int j=0;j<C;j++)
                {
                    board[i][j] = sc.next().charAt(0);
                }
            }
            
            Solution obj = new Solution();
            String[] ans = obj.wordBoggle(board, dictionary);
            
            if(ans.length == 0) System.out.println("-1");
            else
            {
                Arrays.sort(ans);
                for(int i=0;i<ans.length;i++)
                {
                    System.out.print(ans[i] + " ");
                }
                System.out.println();
            }
            
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String[] wordBoggle(char board[][], String[] dic) {
        List<String> foundWords = new ArrayList<>();
        
        for (String word : dic) {
            if (find(word, board)) {
                foundWords.add(word);
            }
        }
        
        if (foundWords.isEmpty()) {
            return new String[] { "-1" };
        }
        
        return foundWords.toArray(new String[0]);
    }
    
    static boolean find(String word, char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] visited = new boolean[rows][cols];
                    if (found(i, j, board, word, 0, visited)) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    static boolean found(int i, int j, char[][] board, String word, int index, boolean[][] visited) {
        if (index == word.length()) {
            return true;
        }
        
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || 
            visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }
        
        visited[i][j] = true;
        
        // Explore all 8 directions: up, down, left, right, and the 4 diagonals
        int[] rowOffsets = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] colOffsets = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        for (int direction = 0; direction < 8; direction++) {
            if (found(i + rowOffsets[direction], j + colOffsets[direction], board, word, index + 1, visited)) {
                return true;
            }
        }
        
        visited[i][j] = false; // Backtrack
        
        return false;
    }

}
