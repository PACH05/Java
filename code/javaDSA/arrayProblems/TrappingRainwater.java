package javaDSA.arrayProblems;
public class TrappingRainwater {
    int trappingWater(int a[], int n){
        n=a.length;
        int left[]= new int[n];
        int right[] = new int[n];
        left[0]=a[0];
        for(int i = 0; i<n ; i++){
            left[i]=Math.max(left[i-1],a[i]);
        }
        right[n-1]=a[n-1];
        for(int i=n-2;i>0;i--){
            right[i]= Math.min(right[i+1],a[i]);
        }
        
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.min(left[i],right[i])-a[i];
        }
        return ans;
    }
};


