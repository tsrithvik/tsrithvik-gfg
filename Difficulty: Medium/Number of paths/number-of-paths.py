#User function Template for python3

class Solution:
    def numberOfPaths (self, rows, columns):
        # print(a)
        pass
        # code here
        # Initialize the number of paths to 1
        num_paths = 1
        
        # Define a constant for modulo operation
        MOD = 10**9 + 7
        
        # Calculate the number of paths using Combinatorics
        for i in range(rows - 1):
            # Use Combinatorics to calculate C(i + n, i)
            num_paths = (num_paths * (i + columns)) % MOD 
            
            # Use the modular inverse to calculate C(i + 1, i)
            temp = pow(i + 1, MOD - 2, MOD)
            num_paths = (num_paths * temp) % MOD
        
        return num_paths




#{ 
 # Driver Code Starts
#Initial Template for Python 3

        

if __name__ == '__main__': 
    ob = Solution()
    t = int (input ())
    for _ in range (t):
        M, N = map(int, input().split())
        ans = ob.numberOfPaths(M, N)
        print(ans)




# } Driver Code Ends