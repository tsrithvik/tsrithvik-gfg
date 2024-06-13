
class Solution:
    def findCatalan(self, n : int) -> int:
        # code here
        c= []
        c.append(1)
        c.append(1)
        mod= 10**9+7
        for i in range(2, n+1):
            #c[i]=0
            sum1=0
            for j in range(i):
                sum1+= c[j]*c[i-j-1]%mod
            c.append(sum1%mod)
        return c[n]%mod;



#{ 
 # Driver Code Starts
if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        n = int(input())
        
        obj = Solution()
        res = obj.findCatalan(n)
        
        print(res)
        

# } Driver Code Ends