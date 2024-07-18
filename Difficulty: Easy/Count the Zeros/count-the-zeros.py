#User function Template for python3

class Solution:
    def countZeroes(self, arr):
        # code here
        ln = len(arr)
        
        l = 0
        
        r = ln-1
        
        ind = -1
        
        while l <=r:
            
            m = (l+r)//2
            
            num = arr[m]
            
            if num == 0:
                
                ind = m
                
                r = m-1
                
            else:
                
                l = m+1
                
        return ln - ind if ind != -1 else 0

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.countZeroes(arr)
        print(ans)
        tc -= 1

# } Driver Code Ends