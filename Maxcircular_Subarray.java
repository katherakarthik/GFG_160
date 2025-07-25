
class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int n=arr.length;
        
        int currmaxsum=0;
        int currminsum=0;
        int total=0;
        
        int max=arr[0];
        int min=arr[0];
        
        for(int i=0;i<n;i++){
            
            currmaxsum=Math.max(currmaxsum+arr[i],arr[i]);
            max=Math.max(max,currmaxsum);
            
            currminsum=Math.min(currminsum+arr[i],arr[i]);
            min=Math.min(currminsum,min);
            
            total+=arr[i];
            
            
        }
        int normalsum=max;
        
        int circularsum=total-min;
        
        if(total==min){
            return normalsum;
        }
        
        
       return Math.max(normalsum,circularsum);
        
    }
}
