// Count Div: find number of divisible integers within a given range for a given integer
// https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
class CountDiv {
    public int solution(int A, int B, int K) {

        return A % K == 0? B/K - A/K+1 : B/K - A/K;
    }
}
