class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        
        // Invalid cases
        if (n <= 0 || n % 2 != 0) {
            return false;
        }
        
        // Recursive call
        return isPowerOfTwo(n / 2);
    }
}