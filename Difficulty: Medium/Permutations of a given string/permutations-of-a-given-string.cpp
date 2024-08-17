//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
	public:
		vector<string>find_permutation(string S)
		{
		    // Code here there
		    //vector<string> ans;
		    set<string> se;
		    int i=0;
		    solve(S, se, i);
		    
		    vector<string> ans(se.begin(), se.end());

		    return ans;
		}
	public:
	    void solve(string s, set<string>& se, int i){
	        
	        if(i>=s.size()){
	            se.insert(s);
	            return ;
	        }
	        
	        for(int j=i;j<s.size();j++){
	            swap(s[i], s[j]);
	            solve(s, se, i+1);
	            swap(s[i], s[j]);
	        }
	    }
};



//{ Driver Code Starts.
int main(){
    int t;
    cin >> t;
    while(t--)
    {
	    string S;
	    cin >> S;
	    Solution ob;
	    vector<string> ans = ob.find_permutation(S);
	    sort(ans.begin(),ans.end());
	    for(auto i: ans)
	    {
	    	cout<<i<<" ";
	    }
	    cout<<"\n";
    }
	return 0;
}

// } Driver Code Ends