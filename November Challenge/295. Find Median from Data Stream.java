class MedianFinder {

   PriorityQueue<Integer> minHeap;
   PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
       if(maxHeap.size()==0) {
           maxHeap.add(num);
           return;
       }
       
       //keeping lowest element of minHeap greater than greatest element of maxHeap
       if(num>maxHeap.peek()) minHeap.add(num);
       else maxHeap.add(num);
       
       //balancing the heaps
       if(Math.abs(maxHeap.size()- minHeap.size())>1){
           if(maxHeap.size()>minHeap.size()) {
               minHeap.add(maxHeap.remove());
           }
           else if(minHeap.size()>maxHeap.size()){
               maxHeap.add(minHeap.remove());
           }
       }
       
    }

    public double findMedian() {
        
        
        boolean sizeEqual;
        double res = 0.0;
        sizeEqual = maxHeap.size()==minHeap.size()? true : false;
        if(sizeEqual){
            res= (double) (maxHeap.peek() + minHeap.peek())/2;
         }
        else {
            if(maxHeap.size()>minHeap.size()) res =  (double)maxHeap.peek();
            else if(minHeap.size()>maxHeap.size()) res = (double) minHeap.peek();
        }
        
        return res;


    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
