// Tape Equilibrium = Find the minimum difference between two parts of an array
// https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
class TapeEquilibrium {
    public int solution(int[] A) {
        long left = A[0];
        long right = 0;
        for (int i=1; i<A.length; i++){
            right += A[i];
        }
        
        int minDiff = diffAbs(right, left);
        
        for(int i=1; i<A.length-1; i++){ //other array shouldn't be empty
            left += A[i];
            right -= A[i];
            int diff = diffAbs(left, right);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        
        return minDiff;
    }
    
    private int diffAbs(long a, long b){
        return (int) (a > b? a-b : b-a);
    }
}
