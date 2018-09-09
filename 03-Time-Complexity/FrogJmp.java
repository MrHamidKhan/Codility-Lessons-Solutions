// Frog Jump: Find (integer) number of jumps needed for a distance
// https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
class FrogJmp {
    public int solution(int X, int Y, int D) {
        int jumps = (Y-X)/D; // might leave some fraction left
        int additionalJump = (Y-X)%D == 0? 0 : 1;
        
        return jumps+additionalJump;
    }
}
