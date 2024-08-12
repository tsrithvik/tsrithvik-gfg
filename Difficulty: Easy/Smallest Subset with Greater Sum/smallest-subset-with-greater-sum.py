#User function Template for python3

class Solution:
    def minSubset(self, A,N):
        s= sum(A)
        A= sorted(A)
        su, df= 0, 0
        for i in range(N-1,-1, -1):
            su+=A[i]
            df= s-su
            if df<su:
                return N-i

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int(input())
    for _ in range(t):
        N = int(input())
        A = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.minSubset(A,N)
        print(ans)
# } Driver Code Ends