#User function Template for python3

#User function Template for python3
class Solution:
    def nCr(self, n, r):
        res = 1
        mod= pow(10, 9)+7
        # calculating nCr:
        for i in range(r):
            res = res * (n - i)
            res = res // (i + 1)
        return res%mod
        
        
	def nthRowOfPascalTriangle(self,n):
	    # code here
	    mod= 10**9+7
	    ans= []
	    for c in range(1, n+1):
            ans.append(self.nCr(n-1, c-1))
        #print()
        return ans
    

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 

	tc=int(input())
	while tc > 0:
	    n=int(input())
	    ob = Solution()
	    ans=ob.nthRowOfPascalTriangle(n)
	    for x in ans:
	        print(x, end=" ")
	    print()
	    tc=tc-1
# } Driver Code Ends