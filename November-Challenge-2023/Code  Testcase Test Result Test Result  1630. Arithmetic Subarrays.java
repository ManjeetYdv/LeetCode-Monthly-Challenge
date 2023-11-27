class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        for(int i=0 ;i<l.length ;i++){
            res.add(isAP(nums , l , r, i));
        }
        return res;
    }

    public boolean isAP(int []nums , int []l ,int[] r , int idx){
        int len = r[idx] - l[idx]+1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=l[idx] ; i<=r[idx] ;i++){
            max = Math.max(max , nums[i]);
            min = Math.min(min , nums[i]);
        }

        if((max-min)%(len-1)!=0) return false;
        int d = (max-min)/(len-1);   //d =(an -a)/(len-1)
        if(d==0) return true;

        boolean vis[] = new boolean[len];

        //finding index for an ele ==> a + (n-1)d = an ==> (n-1) = (an-a)d
        for(int i=l[idx] ;i<=r[idx] ;i++){
            if((nums[i]-min)%d!=0) return false;
            //else
            int pos =(nums[i]-min)/d;
            if(vis[pos]) return false;
            else vis[pos] = true;
        }

        return true;

    }
}
