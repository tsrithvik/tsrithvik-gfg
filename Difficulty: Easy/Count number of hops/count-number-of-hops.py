#User function Template for python3

class Solution:
    #Function to count the number of ways in which frog can reach the top.
    def countWays(self,n):
        
        # code here
        mod= (10**9)+7
        dp= [0]*(n+3)
        dp[0], dp[1], dp[2] = 1, 2, 4
        if n<=3:
            dp[n+1]
        
        for i in range(3, n):
            dp[i]= (dp[i-1]+dp[i-2]+ dp[i-3])%mod
            
        return dp[n-1]%mod

#{ 
 # Driver Code Starts
#Initial Template for Python 3
import atexit
import io
import sys
sys.setrecursionlimit(10**6)
# Contributed by : Nagendra Jha

if __name__ == '__main__':
    test_cases = int(input())
    for cases in range(test_cases):
        m = int(input())
        ob=Solution()
        print(ob.countWays(m))
# } Driver Code Ends