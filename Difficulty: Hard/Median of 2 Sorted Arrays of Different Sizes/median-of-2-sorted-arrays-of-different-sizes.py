#User function Template for python3

class Solution:
    def MedianOfArrays(self, array1, array2):
            #code here
            ind=0
            i,j=0,0
            arr= [0]*(len(array1)+len(array2))
            while i<len(array1) and j<len(array2):
                if array1[i]<array2[j]:
                    arr[ind]= array1[i]
                    i+=1
                else:
                    arr[ind]= array2[j]
                    j+=1
                ind+=1
                
            while i<len(array1):
                arr[ind]= array1[i]
                i+=1
                ind+=1
            while j<len(array2):
                arr[ind]= array2[j]
                j+=1
                ind+=1    
        
            n= len(arr)
            if n % 2 == 0:
                ans= (arr[n//2] + arr[n//2-1])/2
                if ans.is_integer():
                    return int(ans)
                return ans
            return arr[n//2]

#{ 
 # Driver Code Starts
if __name__ == '__main__':
    tcs=int(input())

    for _ in range(tcs):
        m = input()
        arr1=[int(x) for x in input().split()]
        n = input()
        arr2=[int(x) for x in input().split()]
        
        
        ob = Solution()
        print(ob.MedianOfArrays(arr1,arr2))

# } Driver Code Ends