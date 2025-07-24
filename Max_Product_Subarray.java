    int maxProduct(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int  n=arr.length;
        
        int lefttoright=1;
        int righttoleft=1;
        
        for(int i=0;i<n;i++){
            
            if(lefttoright==0)lefttoright=1;
            if(righttoleft==0)righttoleft=1;
            lefttoright*=arr[i];
            
            int j=n-i-1;
            
            righttoleft*=arr[j];
            
           max = Math.max(lefttoright,Math.max(max,righttoleft));
        }
        return max;
    }
}
