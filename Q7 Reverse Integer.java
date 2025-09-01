class Solution {
    public int reverse(int x) {
        int rev = 0;
        int rem = 0;
        while(x!=0){
            rem = x % 10;
            if (rev > Integer.MAX_VALUE/ 10 || rev < Integer.MIN_VALUE/10){
                return rev = 0;                                   // if reverse number exceeds the value to int
            }
            rev = rev*10 + rem;
            x /= 10;
        }
        return rev;
    }
}
