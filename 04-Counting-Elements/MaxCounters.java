// Max Counters: handle N counters based on the elements of an array
// https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
class MaxCounters {
    public int[] solution(int N, int[] A) {
        int max = 0;
        int lastIncrease = 0;
        int[] counters = new int[N];
        
        for(int element : A){
            if(element > N){
                lastIncrease = max;
            } else {
                if(counters[element-1] < lastIncrease){
                    counters[element-1] = lastIncrease;
                }
                
                ++counters[element-1];
                
                if (max < counters[element-1]) {
                    max = counters[element-1];
                }
            }
        }
        
        for (int i=0; i<N; i++) {
            if(counters[i] < lastIncrease) {
                counters[i] = lastIncrease;
            }
        }
        
        return counters;
    }
}
