class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;

        while(num >0) {
            // before we used num % 2 -
            if( (num & 1) == 0) { // num: xxxxxxx0 & bitmask: 00000001 -> convert to decimal is 1
               // before we used   num /= 2;  // num = num / 2;
               num = num >> 1;
            } else {
                // remainder is 1
                num--;  // num = num - 1;
            }
            steps++;
        }

        return steps;
    }
    // TC - O log n
    // SC - o 1
}