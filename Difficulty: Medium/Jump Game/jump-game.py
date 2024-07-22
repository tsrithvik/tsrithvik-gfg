#User function Template for python3

class Solution:
    def canReach(self, A, N):
        # code here 
        maxdis=0
        dis=0
        for i in range(N-1):
            dis= i+A[i]
            maxdis= max(maxdis, dis)
            if maxdis<=i:
                return 0
            
        return 1

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N=int(input())
        A=list(map(int,input().split()))
        
        ob = Solution()
        print(ob.canReach(A,N))
# } Driver Code Ends