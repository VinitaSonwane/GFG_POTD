class Solution {
   
        long max_Books(int arr[], int n, int k) {
        // Your code here
        long ans=0,sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=k)sum+=arr[i];
            else{
                ans=Math.max(ans,sum);
                sum=0;
            }
        }
        ans=Math.max(sum,ans);
       return ans;
    
    }
        }
