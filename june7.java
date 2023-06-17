class Solution {
    public int minFlips(int a, int b, int c) {
        int fp = 0;
        while (a > 0 || b > 0 || c > 0) {
            int bitA = a & 1;
            int bitB = b & 1;
            int bitC = c & 1;
            if (bitC == 0) {
                fp += (bitA + bitB); 
            } else {
                if (bitA == 0 && bitB == 0) {
                    fp += 1; 
                }
            }
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return fp;
    }
}