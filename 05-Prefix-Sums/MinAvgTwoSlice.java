// Min Avg Two Slice: Find the starting slice in an array which has the lowest average.
// https://app.codility.com/programmers/lessons/5-prefix_sums/min_avg_two_slice/
class Solution {
    public int solution(int[] A) {
        double currentAvg = (A[0]+A[1])/2.0;
        double minAvg = currentAvg;
        int minAvgPos = 0;
        
        for(int i=0; i<A.length-2; i++){
            currentAvg = (A[i]+A[i+1])/2.0;
            if(minAvg > currentAvg) {
                minAvg = currentAvg;
                minAvgPos = i;
            }
            
            currentAvg = (A[i]+A[i+1]+A[i+2])/3.0;
            if(minAvg > currentAvg){
                minAvg = currentAvg;
                minAvgPos = i;
            }
        }
        
        //check last two elements pair
        currentAvg = (A[A.length-1]+A[A.length-2])/2.0;
        if(minAvg > currentAvg){
            minAvg = currentAvg;
            minAvgPos = A.length-2;
        }
        
        return minAvgPos;
    }
}
