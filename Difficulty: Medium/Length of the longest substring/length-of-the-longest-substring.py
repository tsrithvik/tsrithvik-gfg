#User function Template for python3

class Solution:
    def longestUniqueSubsttr(self, S):
        # code here
        cnt=0
        sets= set()
        j=0
        for i in range(len(S)):
            while S[i] in sets:
                sets.remove(S[j])
                j=j+1
                
            sets.add(S[i])    
            cnt= max(i-j+1, cnt)
            
        return cnt
            


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        s = input().strip()
        
        
        ob=Solution()
        print(ob.longestUniqueSubsttr(s))
# } Driver Code Ends