//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
	// Your code here
	int intValue=0;
	try {
            intValue = Integer.parseInt(s);
            //System.out.println("Integer value: " + intValue);
        
        } catch (NumberFormatException e) {
            //System.out.println("Cannot parse string as an integer.");
            return -1;
        }
        return intValue;
    }
}
