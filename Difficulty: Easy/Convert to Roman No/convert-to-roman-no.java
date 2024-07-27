//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int N = sc.nextInt();
			
			Solution ob = new Solution();
			System.out.println(ob.convertToRoman(N));
			t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
	String convertToRoman(int n) {
		//code here
		
		//HashMap<String, Integer> map= new HashMap<>();
		ArrayList<pair> map= new ArrayList<>();
		map.add(new pair("I", 1));
		map.add(new pair("IV", 4));
		map.add(new pair("V", 5));
		map.add(new pair("IX", 9));
		map.add(new pair("X", 10));
		map.add(new pair("XL", 40));
		map.add(new pair("L", 50));
		map.add(new pair("XC", 90));
		map.add(new pair("C", 100));
		map.add(new pair("CD", 400));
		map.add(new pair("D", 500));
		map.add(new pair("CM", 900));
		map.add(new pair("M", 1000));
		
		
		String ans= "";
		int cnt=0;
		for(int i=map.size()-1;i>=0;i--){
		    if(n/map.get(i).val>0){
		        cnt= n/map.get(i).val;
		        while(cnt>0){
		            ans+= map.get(i).sym;
		            cnt--;
		        }
		        n= n%map.get(i).val;
		    }
		}
		return ans;
	}
	static class pair{
	    int val;
	    String sym;
	    pair(String sym, int val){
	        this.sym= sym;
	        this.val= val;
	        
	    }
	}
	
}
