class Solution {
    public void reverseArray(int arr[]) {
        // code here
        Stack<Integer> st= new Stack<>();
        for(int i: arr){
            st.push(i);
        }
        
        Arrays.fill(arr, 0);
        int size= arr.length-1;
        for(int i=0;i<=size;i++){
            arr[i]= st.peek();
            st.pop();
        }
    }
}