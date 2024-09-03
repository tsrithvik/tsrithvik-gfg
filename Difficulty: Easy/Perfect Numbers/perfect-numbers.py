#User function Template for python3
from math import ceil
class Solution:
    def isPerfectNumber(self, N):
        # code here 
        
        if N<=1:
            return 0
        
        ans=1
        n= int(N**0.5)+1
        
        #n= -((-N**0.5) // 1 )
        #n = -(int(-N ** 0.5) // 1)
        #print(n)
        for i in range(2, n):
            if N%i==0:
                ans+= (i+(N//i))
                
        return int(ans==N)

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N=int(input())
        
        ob = Solution()
        print(ob.isPerfectNumber(N))
# } Driver Code Ends