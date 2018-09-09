// PermCheck: check if a given array has a permutation sequence from 1-N
// https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
class PermCheck {
    public int solution(int[] A) {
        boolean[] seen = new boolean[A.length];
        int n = A.length;
        
        for (int element : A){
            if (element > n) return 0;
            if (seen[element-1] == true) return 0;
            
            seen[element - 1] = true;
        }
        
        return 1;
    }
}
