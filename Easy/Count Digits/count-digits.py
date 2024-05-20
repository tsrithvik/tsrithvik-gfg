#User function Template for python3


class Solution:
    def evenlyDivides (self, N):
        # code here
        a=0
        ans= []
        #i=0
        dup = N
        while dup>0:
            ans.append(dup%10)
            #i= i+1
            dup= dup//10   #for integer division i.e., to avoid float values
            
        for i in ans:
            if i!=0 and N%i==0:
                a= a+1
        return a


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N = int(input())
       

        ob = Solution()
        print(ob.evenlyDivides(N))
# } Driver Code Ends