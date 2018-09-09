// Cyclic Rotation: rotate an array for K times
// https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // check for null or empty array
        if(A == null || A.length == 0) return A;
        int l = A.length;
        K = K%l; // only rotate effective times
        
        if(K == 0) return A; //no need to rotate
        
        int[] solutionArray = new int[l];
        
        for(int i=0; i<l; i++){
            int index = i-K;    //the effective index is K less
            if(index < 0) index += l; //make it positive
            
            solutionArray[i] = A[index];
        }
        
        return solutionArray;
    }
}
