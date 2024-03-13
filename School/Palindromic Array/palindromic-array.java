//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  int rev=0,pal=0;
                  for(int i=0;i<n;i++){
                    rev=0;
                      pal= a[i];
                      while(pal!=0){
                          rev=rev*10+ pal%10;
                          pal/=10;
                      }
                      if(rev!=a[i]) return 0;
                  }
                  return 1;
           }
}