

from typing import List


class Solution:
    def maxEqualSum(self, N1:int,N2:int,N3:int, S1 : List[int], S2 : List[int], S3 : List[int]) -> int:
        # code here
        sum1=sum(S1)
        sum2=sum(S2)
        sum3=sum(S3)
        
        i, j, k=0,0,0
        while(1):
            if i==N1 or j==N2 or k==N3:
                return 0
            if sum1 == sum2 and sum2 == sum3:
                return sum1
            elif sum1>=sum2 and sum1>=sum3:
                sum1-= S1[i]
                i+=1
            elif sum2>=sum1 and sum2>=sum3:
                sum2-= S2[j]
                j+=1
            elif sum3>=sum2 and sum3>=sum1:
                sum3-= S3[k]
                k+=1
            
            
        
        


#{ 
 # Driver Code Starts


class IntArray:
    def __init__(self) -> None:
        pass
    def Input(self,n):
        arr=[int(i) for i in input().strip().split()]#array input
        return arr
    def Print(self,arr):
        for i in arr:
            print(i,end=" ")
        print()


if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        a=IntArray().Input(3)
        
        
        S1=IntArray().Input(a[0])
        
        
        S2=IntArray().Input(a[1])
        
        
        S3=IntArray().Input(a[2])
        
        obj = Solution()
        res = obj.maxEqualSum(a[0],a[1],a[2], S1, S2, S3)
        
        print(res)
        

# } Driver Code Ends