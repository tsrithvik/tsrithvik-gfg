//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends


class Solution 
{
    public:
    //Function to find the minimum number of swaps required to sort the array. 
	int minSwaps(vector<int> a) {
    int n = a.size(); // Get the size of the input vector
    vector<pair<int, int>> v; // Create a vector of pairs to store elements along with their original indices

    // Populate the vector of pairs with elements and their corresponding indices
    for (int i = 0; i < n; i++) {
        v.push_back({a[i], i});
    }

    // Sort the vector of pairs based on the first element of each pair (the values of the array)
    sort(v.begin(), v.end());

    int c = 0; // Initialize a counter variable to count the number of swaps

    // Iterate through the sorted vector of pairs
    for (int i = 0; i < n; i++) {
        // If the original index of the element is not equal to its sorted position
        if (v[i].second != i) {
            c++; // Increment the counter to indicate a swap is needed
            swap(v[i], v[v[i].second]); // Swap the current element with the element at its sorted position
            i--;
            
        }
    }

    return c; // Return the total number of swaps required
}

};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n;
		cin >> n;
		vector<int>nums(n);
		for(int i = 0; i < n; i++)
			cin >> nums[i];
		Solution obj;
		int ans = obj.minSwaps(nums);
		cout << ans <<"\n";
	}
	return 0;
}
// } Driver Code Ends