// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int[] ans= new int[2];
        
        int ceil= Integer.MAX_VALUE;
        int floor= -1;
        
        for(int i=0;i<arr.length;i++){
            if(x>=arr[i] && arr[i]>floor){
                floor= arr[i];
            }
            if(x<=arr[i] && ceil>arr[i]){
                ceil= arr[i];
            }
        }
        
        ans[0]= floor;
        if(ceil!= Integer.MAX_VALUE) ans[1]= ceil;
        else ans[1]= -1;
        
        return ans;
        
    }
}
