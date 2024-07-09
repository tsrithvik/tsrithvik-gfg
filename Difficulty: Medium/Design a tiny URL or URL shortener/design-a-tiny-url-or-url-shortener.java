//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            long n = Long.parseLong(br.readLine().trim());

            String url = new Solution().idToShortURL(n);
            System.out.println(url);
            System.out.println(shortURLtoID(url));
        }
    }

    // Function to get integer ID back from a short url
    static long shortURLtoID(String shortURL) {
        long id = 0; // initialize result

        // A simple base conversion logic
        for (int i = 0; i < shortURL.length(); i++) {
            if ('a' <= shortURL.charAt(i) && shortURL.charAt(i) <= 'z')
                id = id * 62 + shortURL.charAt(i) - 'a';
            if ('A' <= shortURL.charAt(i) && shortURL.charAt(i) <= 'Z')
                id = id * 62 + shortURL.charAt(i) - 'A' + 26;
            if ('0' <= shortURL.charAt(i) && shortURL.charAt(i) <= '9')
                id = id * 62 + shortURL.charAt(i) - '0' + 52;
        }
        return id;
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    String idToShortURL(long n) {
        // code here
        ArrayList<Character> al= new ArrayList<>();
        StringBuilder ans= new StringBuilder();
        
        for(int i=0;i<26;i++){
            char k= (char)('a'+i);
            al.add(k);
        }
        for(int i=0;i<26;i++){
            char k= (char)('A'+i);
            al.add(k);
        }
        for(int i=0;i<10;i++){
            
            char k= (char)('0'+i);
            al.add(k);
        }
        while(n>=1){
            int c= (int)(n%62);
            char r= al.get(c);
            ans.append(r);
            n/=62;
        }
        return ans.reverse().toString();
    }
}