//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String ans= "";
        int n= S.length();
        int c=0;
        //String[] word= new String[n];
        Stack<String> word = new Stack<>();
        for(int i=0;i<n;i++){
            if(S.charAt(i)=='.') {
                word.push(ans);
                ans= "";
                c++;
                continue;
            }
            else{
                ans+= S.charAt(i);
            }
        }
        word.push(ans);
        ans= "";
        for(int i=0;i<word.size()+c;i++){
         ans+= word.peek();
         if(i!=word.size()+c-1) ans+= ".";
         word.pop();
        }
        return ans;
    }
}