#User function Template for python3

class Solution:
    def isdivisible7(self, num):
        # code here
        n= int(num)
        return 1 if n%7==0 else 0

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        s = input().strip()
        ob=Solution()
        print(ob.isdivisible7(s))
# } Driver Code Ends