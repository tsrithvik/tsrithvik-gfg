#User function Template for python3
class Solution:
	def minDifference(self, nums, n):
		# code here
		#similar to 0/1 knapsack problem
		total=sum(nums)
        dp=[[False for _ in range(total+1)] for _ in range(n+1)]
        for i in range(n+1):
            dp[i][0]=True
        for i in range(1,n+1):
            for j in range(1,total+1):
                if nums[i-1]<=j:
                    dp[i][j]=dp[i-1][j-nums[i-1]] or dp[i-1][j]
                else:
                    dp[i][j]=dp[i-1][j]
        diff=float('inf')
        for i in range(0,total//2+1):
            f=i
            s=total-f
            if dp[n][i]==True and diff>abs(f-s):
                diff=abs(f-s)
        return(diff)
		
		


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		N = int(input())
		arr = [int(x) for x in input().split()]
		ob = Solution()
		ans = ob.minDifference(arr, N)
		print(ans)

# } Driver Code Ends