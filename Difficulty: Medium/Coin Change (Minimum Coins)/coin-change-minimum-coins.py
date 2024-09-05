#User function Template for python3
class Solution:
	def minCoins(self, coins, M, sum):
		# code here
    	'''
    	dp bottom up approach
    	check from 0 to sum
    	for 0 how many coins are required then for 1 and finally to sum
    	dp[0->n]
    	
    	ex: sum= 7 arr=[1,3,4,5]
    	dp[0]= 0 as 0 coins are required to make sum 0
    	dp[1]= 1 as 1 coin is enough from coins[] to make the sum 1
    	dp[2]= 2 as 2 1's are needed.. (dp[2]= 1+dp[1])
    	dp[req]= dp[req- coins[i] less than req]+1
    	'''
    	dp= [sum+1]*(sum+1)  #fill complete array with some max value greater than sum
    	#so that at soln if ans is still max then ans is -1
    	dp[0]= 0
    	
    	for i in range(1, sum+1):
    	    for c in coins:
    	        if i-c>=0:
    	            dp[i]= min(1+dp[i-c], dp[i])
    	 
    	return dp[sum] if dp[sum]!=sum+1 else -1

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    T = int(input())
    for i in range(T):
        v, m = input().split()
        v, m = int(v), int(m)
        coins = [int(x) for x in input().split()]
        ob = Solution()
        ans = ob.minCoins(coins, m, v)
        print(ans)

# } Driver Code Ends