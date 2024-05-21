#User function Template for python3
class Solution:
    def isPrime(self, N):
        for i in range(2, int(N**0.5) + 1):
            if N % i == 0:
                return 'No'
        return 'Yes'
        
    def isSumOfTwo (self, N):
        # 5 7 11 13 17 19 23 29
        if N < 3: return 'No'
        
        elif N % 2 == 0: return 'Yes'
        
        return self.isPrime(N - 2)
    

#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N = int(input())
        
        ob = Solution()
        print(ob.isSumOfTwo(N))
# } Driver Code Ends