//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Integer arr[] = new Integer[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            obj.sortBySetBitCount(arr, n);
            StringBuilder output = new StringBuilder();
            for(int i = 0; i < n; i++)
            output.append(arr[i] + " ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute  
{ 
    static void sortBySetBitCount(Integer arr[], int n)
    { 
        // Your code goes here
      //HashMap<Integer, Integer> map = new LinkedHashMap<>();
       int[] setBit= new int[n];
       
        for (int i = 0; i < n; i++) {
            int k = arr[i];
            int c = 0;
            
            // Count the number of set bits in the binary representation of k
            while (k > 0) {
                if (k % 2 == 1) {
                    c++;
                }
                k /= 2;
            }
            setBit[i]= c;
            //map.put(arr[i], c);
        }
        List<Pair> list= new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Pair(arr[i], setBit[i]));
        }
        Collections.sort(list, new Comparator<Pair>(){
            @Override
            public int compare(Pair p1, Pair p2){
                return (p2.setBits- p1.setBits);
            }
        });
        
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i).value;
        }
    } 
    static class Pair {
        Integer value;
        int setBits;

        // Correct constructor
        Pair(Integer value, int setBits) {
            this.value = value;
            this.setBits = setBits;
        }
    }
}
