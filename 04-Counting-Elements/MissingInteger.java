// Missing Integer: find smallest positive integer not present in a given array
// https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
class MissingInteger {
    public int solution(int[] A) {
        boolean[] seen = new boolean[A.length];
        
        for (int value : A){
            if(value > 0 && value <= A.length) {
                seen[value-1] = true;
            }
        }
        
        for (int i=0; i<seen.length; i++){
            if(seen[i] == false) return i+1; 
        }
        
        return A.length + 1;
    }
}
