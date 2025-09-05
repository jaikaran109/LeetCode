class Solution {
    public void reverseString(char[] s) {
        for(int i = 0; i < s.length/2 ; i++){ // for half loop
            int newLen = s.length - i - 1; // for 7th line 
            char ans = s[i];
            s[i] = s[newLen];
            s[newLen] = ans;
        }
    }
}
