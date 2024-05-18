//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        //ArrayList<Integer> al= new ArrayList<>();
        //int[] ans= new int[n];
        int sum=0,large=0;
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++){
            sum+= arr[i];
            //c++;
            if (sum == 0) {
                large = i + 1;
            }
    
            if (hm.containsKey(sum)) {
                large = Math.max(large, i - hm.get(sum));
            } else {
                hm.put(sum, i);
            }
        }
        //if(hm.size()==1) return n;
        return large;
    }
}