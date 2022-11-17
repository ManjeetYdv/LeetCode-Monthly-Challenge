class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
       

        int totalArea = (ax2-ax1)*(ay2-ay1) + (bx2-bx1)*(by2-by1);

        //Overlap Area finding
        int cx1 = Math.max(ax1 , bx1);
        int cx2 = Math.min(ax2 ,bx2);
        
        int cy1 = Math.max(ay1 , by1);
        int cy2 = Math.min(ay2 , by2);
        
        int overLapArea = Math.max(0 , cx2-cx1)*Math.max(0 , cy2-cy1);
        
        return totalArea-overLapArea;
    }
}
