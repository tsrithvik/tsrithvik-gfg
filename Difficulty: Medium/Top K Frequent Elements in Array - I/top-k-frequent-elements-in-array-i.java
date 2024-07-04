//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.util.function.Function;
import java.util.stream.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
        HashMap<Integer, Integer> map= new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        ArrayList<Integer> list= new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer a1, Integer a2){
                int f1= map.get(a1);
                int f2= map.get(a2);
                
                if(f1!=f2){
                    return Integer.compare(f2, f1);
                }
                
                else return Integer.compare(a2, a1);
            }
        });
        
       
        int[] ans= new int[k];
        for(int i=0;i<k;i++){
            ans[i]= list.get(i);
        }
        
        return ans;
    }
}