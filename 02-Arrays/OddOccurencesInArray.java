// Odd Occurences In Array: Find the only unpaired element in an array of odd length
// https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
class OddOccurencesInArray {
    public int solution(int[] A) {
        int unpaired = A[0];
        
        for (int i=1; i<A.length; i++){
            unpaired ^= A[i]; //xor cancels out pairs
        }
        
        return unpaired;
    }
}
