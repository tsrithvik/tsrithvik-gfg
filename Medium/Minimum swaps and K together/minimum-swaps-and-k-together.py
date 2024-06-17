#User function Template for python3

class Solution:
        
    def minSwap (self,arr, n, k) : 
        #Complete the function
        c=0
        for i in arr:
            if i<=k:
                c+=1
        
        bad=0
        for i in range(c):
            if arr[i]>k:
                bad+=1
        
        ans= bad
        for i in range(c,n):
            if arr[i]>k:
                bad+=1
            if arr[i-c]>k:
                bad-=1
            ans=min(ans, bad)
        return ans
            




#{ 
 # Driver Code Starts
#Initial Template for Python 3

for _ in range(0,int(input())):
    n = int(input())
    arr = list(map(int, input().strip().split()))
    k = int(input())
    ob=Solution()
    ans = ob.minSwap(arr, n, k)
    print(ans)
    





# } Driver Code Ends