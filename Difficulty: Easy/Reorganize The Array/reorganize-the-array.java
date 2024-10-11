//{ Driver Code Starts
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// } Driver Code Ends

import java.util.HashSet;
class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        // Code here
        
        int n= arr.size();
        ArrayList<Integer> ans= new ArrayList<>();
        
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr)set.add(i);
        
        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                ans.add(-1);
            }
            else ans.add(i);
        }
        
        return ans;
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Solution solution = new Solution();

        while (t-- > 0) {
            String input = scanner.nextLine();
            String[] inputArr = input.split("\\s+");
            List<Integer> arr = new ArrayList<>();
            for (String s : inputArr) {
                arr.add(Integer.parseInt(s));
            }

            List<Integer> ans = solution.rearrange(arr);

            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
// } Driver Code Ends