//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.oddEven(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static String oddEven(String s) {
        // code here
        int x=0, y=0;
        int[] str= new int[26];
        for(Character c: s.toCharArray()){
            str[c-'a']++; 
        }
        for(int i=0;i<26;i++){
            if(str[i]>0){
                if((i+1)%2==0 && str[i]%2==0){
                    x++;
                }
                if((i+1)%2!=0 && str[i]%2!=0){
                    y++;
                }
            }
        }
        return (x+y)%2==0 ? "EVEN" :"ODD";
    }
}
