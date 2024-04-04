//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        // Write your code here
        ArrayList<String> al = new ArrayList<>();
String val = "";
for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) != '.') {
        val += s.charAt(i);
        // Check if the current segment exceeds 3 characters
        if (val.length() > 3) return false;
        // Check if the current character is not a digit
        if (!Character.isDigit(s.charAt(i))) return false;
        // Check if the current segment starts with a zero (except when it's exactly "0")
        if (val.length() > 1 && val.charAt(0) == '0' && !val.equals("0")) return false;
    } else {
        // Add the valid segment to the list
        al.add(val);
        val = "";
    }
}

// Add the last segment to the list
al.add(val);

// Check if the number of segments is exactly four
if (al.size() != 4) return false;

for (int i = 0; i < al.size(); i++) {
    // Parse the segment into an integer
    int j;
    try {
        j = Integer.parseInt(al.get(i));
    } catch (NumberFormatException e) {
        // Handle the case where the segment is not a valid integer
        return false;
    }
    // Check if the integer falls within the valid range
    if (j < 0 || j > 255) return false;
}

return true;

    }
}