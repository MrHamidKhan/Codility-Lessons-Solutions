// Passing Cars: Count the pairs of zeros and ones in which zeros are at lower index than ones.
// https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
class PassingCars {
    public int solution(int[] A) {
        int eastCars = 0; //the 0's
        int passingCars = 0;
        
        //ignore the 1's from the beginning as they are going West, they won't pass any car
        for(int i = 0; i<A.length; i++){
            if(A[i] == 0){
                eastCars++;
            } else if(eastCars > 0) { //a West going car
                passingCars += eastCars;
                if(passingCars > 1000000000) return -1;
            }
        }
        
        return passingCars;
        
    }
}
