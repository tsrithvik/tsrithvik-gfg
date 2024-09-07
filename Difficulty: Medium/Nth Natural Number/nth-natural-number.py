#User function Template for python3

class Solution:
    def findNth(self,n):
        #code here
        '''
        let n be 10
        10%9=1, 10/9=1 
        1%9=1, 1/9=0
        
        let n is 84
        84%9= 3, 84/9= 9
        9%9= 0, 9/9= 1
        1%9=1, 1/9= 0
        ans= 103
        '''
        ans=0
        p=1
        
        while n>0:
            ans+= p*(n%9)
            p*=10
            n//=9

        return ans
#{ 
 # Driver Code Starts
#Initial Template for Python 3

t = int(input())
for i in range(0, t):
    n = int(input())
    obj = Solution()
    s = obj.findNth(n)
    print(s)

# } Driver Code Ends