//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;

    Item(int x, int y) {
        this.value = x;
        this.weight = y;
    }
}

class GfG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0, k = 0; i < n; i++) {
                arr[i] = new Item(Integer.parseInt(inputLine[k++]),
                                  Integer.parseInt(inputLine[k++]));
            }
            System.out.println(
                String.format("%.6f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}
// } Driver Code Ends


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item arr[], int n) {
        // Your code here
        
        
        //sorting according to value to weight ratio
        Arrays.sort(arr, new Comparator<Item>(){
            public int compare(Item item1, Item item2){
                double rat1= (double) item1.value/ item1.weight;
                double rat2= (double) item2.value/ item2.weight;
                return Double.compare(rat2, rat1);
            }
        });
        
        int cpos=0;
        double val=0;
        
        while(cpos<n){
            if(arr[cpos].weight <=w){
                val+= arr[cpos].value;
                w-= arr[cpos].weight;
            }
            else{
                val+= w*((double) arr[cpos].value/arr[cpos].weight);
                break;
            }
            cpos++;
        }
        
        return val;
        
        
    }
}