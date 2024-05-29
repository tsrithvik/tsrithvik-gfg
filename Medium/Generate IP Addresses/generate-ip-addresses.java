//{ Driver Code Starts
import java.util.*;
class GenIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution sln = new Solution();
            ArrayList<String> str = sln.genIp(s);
            Collections.sort(str);
            if(str.size() == 0)
                System.out.println(-1);
            else{
                for (String u : str) {
                    System.out.println(u);
                }
            }
        }
    }
}
// } Driver Code Ends


/*complete the Function*/

class Solution {
    boolean check(String a){
        int n= a.length();
        if(n<=0 || n>3) return false;
        int b= Integer.parseInt(a);
        if(b>255 ) return false;
        if(a.charAt(0)== '0' && n>1) return false;
        return true;
        
    }
    String generate(String s, int i, int j, int k){
        String a = s.substring(0, i + 1);
        String b = s.substring(i + 1, j + 1);
        String c = s.substring(j + 1, k + 1);
        String d = s.substring(k + 1);
        String ans= "";
        if(check(a) && check(b) && check(c) && check(d)){
            ans= a+ "."+ b+ "."+ c+ "."+ d;
            return ans;
        }
        return "";
    }
    
    public ArrayList<String> genIp(String s) {
        // code here
        int n= s.length();
        ArrayList<String> al= new ArrayList<>();
        if (n < 4 || n > 12) return al;
        for(int i=0;i<n-3;i++)
        {
            for(int j=i+1;j<n-2;j++)
            {
                for(int k=j+1;k<n-1;k++)
                {
                    String ans= generate(s, i, j, k);
                    if(ans.length()>0) al.add(ans);
                }
            }
        }
        return al;
    }
}