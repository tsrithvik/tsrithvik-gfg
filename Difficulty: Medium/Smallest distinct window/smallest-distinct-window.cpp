//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution{
    public:
    int findSubString(string str)
    {
        // Your code goes here
        set<char> s;
        for(int i=0; i<str.size(); i++)
        {
            s.insert(str[i]);
        }
        
        int j=0;
        int minlen = INT_MAX;
        unordered_map<char, int> mp;
        for(int i=0; i<str.size(); i++)
        {
            mp[str[i]]++;
            while(j<=i && mp.size() == s.size())
            {
                minlen = min(minlen, i-j+1);
                mp[str[j]]--;
                if(mp[str[j]] == 0)
                {
                    mp.erase(str[j]);
                }
                j++;
            }
        }
        
        return minlen;
    }
};

//{ Driver Code Starts.
// Driver code
int main() {
    int t;
    cin >> t;
    while (t--) {

        string str;
        cin >> str;
        Solution ob;
        cout << ob.findSubString(str) << endl;
    }
    return 0;
}
// } Driver Code Ends