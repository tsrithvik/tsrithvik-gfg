#User function Template for python3


class Solution:
    def waysToBreakNumber(self, n):
        #code here
        mod = 1000000007
        k = n + 1
        # Calculate the sum of the first k natural numbers modulo 1000000007
        res = ((k%mod)* ((k + 1)%mod) // 2) % mod
        return res

        


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n = int(input())
        
        ob = Solution()
        print(ob.waysToBreakNumber(n))
        
# } Driver Code Ends