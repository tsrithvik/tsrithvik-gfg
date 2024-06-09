//{ Driver Code Starts
// #include <bits/stdc++.h>
// using namespace std;

// // int CountPS(char s[], int n);

// int main() {
//     int t;
//     cin >> t;
//     while (t--) {
// int N;
// cin >> N;
// char S[N + 1];
// cin >> S;
// Solution ob;
//         cout << ob.CountPS(S, N) << endl;
//     }
//     return 0;
// }

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends


// User function Template for C++

class Solution {
  public:
    int CountPS(char s[], int n) {
        // code here
        int c=0;
        for(int i=0;i<n;i++){
            c+= palin(s, i, i+1, n);
            c+= palin(s, i, i+2, n);
        }
        return c;
    }
    int palin(char s[], int left, int right, int n){
        int count=0;
        while(left>=0 && right<n && s[left]==s[right]){
            count++;
            left--;
            right++;
        }
        return count;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;
        char S[N + 1];
        cin >> S;
        Solution ob;
        cout << ob.CountPS(S, N) << endl;
    }
    return 0;
}
// } Driver Code Ends