// Genomic Range Query: find 
// https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
class GenomicRangeQuery{
    private static int A = 0,
                       C = 1,
                       G = 2,
                       T = 3;
    
    public int[] solution(String S, int[] P, int[] Q) {
        int[][] lastSeen = new int[4][S.length()];
        
        int nucleotide = findIndex(S.charAt(0));
        lastSeen[nucleotide][0] = 1;
        
        //build last seen
        for(int i=1; i<S.length(); i++) {
            for (int j=0; j<4; j++) {
                lastSeen[j][i] = lastSeen[j][i-1];
            }
            nucleotide = findIndex(S.charAt(i));
            lastSeen[nucleotide][i] = i + 1; //imp to remove -1 from the result
        }
        
        //solve queries
        int[] solution = new int[P.length];
        for(int i=0; i<P.length; i++){
            int j=0;
            for(; j<4-1; j++){
                if(lastSeen[j][Q[i]] >= P[i]+1){
                    break;
                }
            }
            solution[i] = j+1;
        }
        
        return solution;
    }
    
    private int findIndex(char nucleotide){
        switch(nucleotide){
            case 'A': return A;
            case 'C': return C;
            case 'G': return G;
            case 'T': return T;
        }
        
        //if not found
        return -1; //should never happen
    }
}
