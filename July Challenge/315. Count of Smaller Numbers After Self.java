class Solution {
    
     public class Pair {
        int val;
        int index;

        public Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }
    
    private void merge(Pair[] arr, int left, int mid, int right, Integer[] resArr) {
        Pair[] temp = new Pair[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while(i <= mid && j <= right) {
            if(arr[i].val > arr[j].val) {
                resArr[arr[i].index] += right - j + 1;
                temp[k++] = arr[i++];
            } 
			
			else 
                temp[k++] = arr[j++];
        }

        while(i <= mid) 
            temp[k++] = arr[i++];

        while(j <= right) 
            temp[k++] = arr[j++];
        
        for(i = left; i <= right; i++) 
            arr[i] = temp[i - left];
    }
    
    
	
	private void mergeSort(Pair[] arr, int left, int right, Integer[] resArr) {
        if(left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid, resArr);
            mergeSort(arr, mid + 1, right, resArr);

            merge(arr, left, mid, right, resArr);
        }
    }
    
    
    public List<Integer> countSmaller(int[] nums) {
        
       List<Integer> res = new ArrayList<>();

        if (nums == null || nums.length == 0) 
            return res;

        Pair[] arr = new Pair[nums.length];

        for (int i = 0; i < nums.length; i++)
            arr[i] = new Pair(nums[i], i);

        Integer[] resArr = new Integer[nums.length];
        Arrays.fill(resArr, 0);

        mergeSort(arr, 0, nums.length - 1, resArr);

        res.addAll(Arrays.asList(resArr));

        return res; 
    
    

    
    }
}
