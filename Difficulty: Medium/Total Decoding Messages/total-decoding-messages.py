#User function Template for python3

class Solution:
	def CountWays(self, s: str):
		# Code here
		'''ans will be in the form of fibonacci series  1, 2, 3, 5, 8, 13..
        can be solved by bottom up procedure
        if a character starts with 1 then there might be a chance of 
        occuring a 2 digit number as the second digit is bw 0-9
        if that character starts with 2 then there is a possibility of 
        occurance of 2 digit number if the next charcter is bw 0-6
        
        approach:
        -assign the dp[len] to 1
        -if value is 0 just asssign dp[i]=0 as there is no possibility 
        to decode it until the next value satisfies the condition
        -i+1<len is used for case at the last character
        
        '''
        
        n = len(s)
        dp = [0] * (n + 1)
        dp[n] = 1  # Base case: an empty string has one way to be decoded
        mod= 10**9 + 7
        for i in range(n - 1, -1, -1):
            if s[i] == "0":
                dp[i] = 0
            else:
                dp[i] = dp[i + 1]
                if (i + 1 < n and (s[i] == "1" or s[i] == "2" and s[i + 1] in "0123456")):
                    dp[i] += dp[i + 2]%mod
    
        return dp[0]%mod


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import sys
sys.setrecursionlimit(10**6)
if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		str = input()
		ob = Solution()
		ans = ob.CountWays(str)
		print(ans)

# } Driver Code Ends