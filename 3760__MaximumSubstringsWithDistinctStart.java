class Solution {
    public int maxDistinct(String s) {
        boolean[] seen = new boolean[26];  // initial value of all is false
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a'; // seen ki value access kr rha
            if (!seen[idx]) {            //! means false h ki nhi ye checkkr rha h 
                seen[idx] = true;    
                count++;
            }
        }
        return count;
    }
}
















// Ye code shi h lekin time complexity jyada h isse rough idea le skte ho


// class Solution {
//     public int maxDistinct(String s) {
        
//         boolean[] visited = new boolean[s.length()];
//         int diffCount = 0;

//         for (int i = 0; i < s.length(); i++) {

//         if (visited[i])
//             continue;

//         diffCount++;

//         for (int j = i + 1; j < s.length(); j++) {
//             if (s.charAt(i) == s.charAt(j)) {
//                 visited[j] = true;
//                 }
//             }
//        }
//        return diffCount;
//     }
// }
