//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        // Your code here
        int ans=0,rev=0;
        if(num==0) return 5;
        while(num>0){
            int a= num%10;
            if(a==0) {
                a=5;
            }
            rev= rev*10+a;
            num/=10;
        }
        while(rev>0){
            int m= rev%10;
            ans= ans*10+m;
            rev/=10;
            
        }
        return ans;
    }
}