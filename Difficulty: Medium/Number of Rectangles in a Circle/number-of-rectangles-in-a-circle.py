#User function template for Python

class Solution:
    def rectanglesInCircle(self,r):
        #code here
        c=0
        for i in range(1, 2*r+1):
            for j in range(1, 2*r+1):
                h= math.sqrt(i*i + j*j)
                if h<=2*r:
                    c+=1
        return c

#{ 
 # Driver Code Starts
#Initial Template for Python

import math

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N = int(input())
        ob = Solution()
        ans = ob.rectanglesInCircle(N)
        print(ans)

# } Driver Code Ends