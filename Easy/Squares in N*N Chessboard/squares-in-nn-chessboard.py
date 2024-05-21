#User function Template for python3

class Solution:
    def squaresInChessBoard(self, N):
         # code here
         sum=0
         for i in range(1,N+1):
             sum+= pow(i,2)
         return sum

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N=int(input())
        
        ob = Solution()
        print(ob.squaresInChessBoard(N))
# } Driver Code Ends