class Solution {
     private  boolean collinearCheck(int x1 , int y1 , int x2 , int y2 , int x3 , int y3){
        int determinant = x1*(y2-y3) - y1*(x2 -x3) + 1*(x2*y3 - x3*y2 );
        return determinant==0;
    }
    public int maxPoints(int[][] points) {
        if(points.length<=2) return points.length;
        
        int res=2;
        for(int i=0 ;i<points.length;i++){
            for (int j=i+1 ;j<points.length ;j++){
                if(j==i) continue;;
                int maxCollinear=2;
                for(int k=i+2 ;k<points.length ;k++){
                    if(k==j)continue;
                    if(collinearCheck(points[i][0] , points[i][1] , points[j][0] ,points[j][1] , points[k][0] , points[k][1])) {
                        maxCollinear++;
                    }
                }
                res = Integer.max(res , maxCollinear);
            }
        }

        return res;



    }
}
