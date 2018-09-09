// Frog River One: find if an array consist of all integers from 1 to X
// https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
class FrogRiverOne {
    public int solution(int X, int[] A) {
        int maxTime = X - 1;
        boolean[] positionsCovered = new boolean[X];
        
        for (int time = 0; time<A.length; time++){
            if(time > maxTime && !positionsCovered[A[time]-1]) {
                maxTime = time;
            }
            positionsCovered[A[time]-1] = true;
        }
        
        for (boolean positionCovered : positionsCovered){
            if (!positionCovered) return -1;
        }
        
        return maxTime;
    }
}
