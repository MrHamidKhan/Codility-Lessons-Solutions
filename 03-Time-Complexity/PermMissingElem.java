// Permutational Array Missing Element: Find the missing integer from an of permutation of N
// https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
class Solution {
    public int solution(int[] A) {
        if(A == null || A.length == 0) return 1;
        
        long n = A.length + 1; // the expected N - long avoids overflow
        long expectedSum = n*(n+1)/2;
        long actualSum = 0;
        for (int element : A){
            actualSum += element;
        }
        
        return (int) (expectedSum - actualSum);
    }
}
