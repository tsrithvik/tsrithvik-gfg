//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.getSubstringWithEqual012(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long getSubstringWithEqual012(String str) 
    { 
        // code here
        int n= str.length();
        int c0=0, c1=0, c2=0;
        String key= (c2-c1) + "|" + (c1-c0);
        HashMap<String, Integer> map= new HashMap<>();
        int ans=0;
        map.put(key, 1);
        for(char i: str.toCharArray()){
            if(i=='0') c0++;
            else if(i=='1') c1++;
            else c2++;
            
            key= (c2-c1)+ "|" + (c1-c0);
            if(map.containsKey(key)){
                ans+= map.get(key);
                map.put(key, map.get(key)+1);
                
            }
            else{
                map.put(key, 1);
                
            }
        }
        
        return ans;
    }
} 