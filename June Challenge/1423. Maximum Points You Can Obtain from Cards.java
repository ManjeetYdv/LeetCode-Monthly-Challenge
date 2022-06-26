class Solution {
    public int maxScore(int[] arr, int k) {
       
        HashMap<Integer ,Integer> map = new HashMap<>();
        int l = arr.length-k;       //we need minimum subarray sum of this length  , and subtract it to total sum to get maximumPointCard

        int sum=0;
        int minSubarrSum = Integer.MAX_VALUE;
        map.put(-1 , 0);

        for(int i=0 ;i<arr.length ;i++){
            sum+=arr[i];
            map.put(i , sum);

            if(i+1<l) continue;

            int prevIdx = i-l;

            minSubarrSum = Integer.min(minSubarrSum , (map.get(i) -map.get(prevIdx)));
        }

        return map.get(arr.length-1) - minSubarrSum;
        
    }
}
