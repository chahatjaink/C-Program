#include <bits/stdc++.h>
using namespace std;

vector<int> subarrayWithSum0(int arr[], int n)
{
    unordered_map<int, int> mapSum;
    vector<int> res;
    int sum = 0, index = -1, start = -1;
    for (int i = 0; i < n; i++)
    {
        sum += arr[i];
        if (sum == 0 || (mapSum.find(sum) != mapSum.end()))
        {
            start = mapSum[sum];
            index = i;
            break;
        }
        mapSum.insert({sum, i});
    }
    start++;
    if (sum == 0)
    {
        start = 0;
    }
    for (int i = start; i <= index; i++)
    {
        res.push_back(arr[i]);
    }
    return res;
}

int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    vector<int> vec = subarrayWithSum0(arr, n);
    if (vec.empty())
    {
        cout << "No Elements Found";
    }
    for (int i = 0; i < vec.size(); i++)
    {
        cout << vec[i] << " ";
    }

    return 0;
}