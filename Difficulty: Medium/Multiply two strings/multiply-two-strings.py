#User function Template for python3

class Solution:
    def multiplyStrings(self,s1,s2):
        # code here
        # return the product string
        c=0
        num1=0
        num2=0
        for i in range(len(s1)):
            curr= s1[i]
            if curr=='-':
                c+=1
                continue
            num1= num1*10 + ord(curr) - ord('0')
            
        if c>0:
            num1= -num1
        c=0
        for i in range(len(s2)):
            curr= s2[i]
            if curr=='-':
                c+=1
                continue
            num2= num2*10 + ord(curr) - ord('0')
            
        if c>0:
            num2= -num2
        ans= num1*num2;
        return str(ans)

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == "__main__":
    t=int(input())
    for i in range(t):
        a,b=input().split()
        print(Solution().multiplyStrings( a.strip() , b.strip() ))

# } Driver Code Ends