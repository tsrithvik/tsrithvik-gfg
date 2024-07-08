#User function Template for python3

class Solution:
    #Function to count number of ways to reach the nth stair.
    def countWays(self,n):
        
        # code here
        if n==1 or n==0:
            return 1
        #//else if() return 0;
        
        f1=0
        f2=1
        f=0
        mod = pow(10, 9)+7
        for i in range(n):
            f= (f1+f2)%mod
            f1= f2%mod
            f2= f%mod
        
        return f%mod

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