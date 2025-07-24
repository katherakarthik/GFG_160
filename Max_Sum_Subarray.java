class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n=arr.length;
        if(n==0)return 0;
        int res=arr[0];
        int maxE=arr[0];
        
        for(int i=1;i<n;i++){
            
            maxE=Math.max(maxE+arr[i],arr[i]);
            
            res=Math.max(res,maxE);
        }
        return res;
        
    }
}
