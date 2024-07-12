#User function Template for python3

class Solution:
    def countOfElements(self, x, arr):
        # Code Here
        arr.sort()
        for i in range(len(arr)):
            if arr[i]> x:
                ans= i
                break
        return ans




#{ 
 # Driver Code Starts
#Initial Template for Python 3

#Position this line where user code will be pasted.

if __name__ == "__main__":
    import sys
    input = sys.stdin.read
    data = input().strip().split('\n')
    t = int(data[0])
    index = 1
    for _ in range(t):
        x = int(data[index])
        index += 1
        arr = list(map(int, data[index].split()))
        index += 1
        obj = Solution()
        ans = obj.countOfElements(x, arr)
        print(ans)

# } Driver Code Ends