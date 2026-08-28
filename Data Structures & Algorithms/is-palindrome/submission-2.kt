class Solution {
    fun isPalindrome(s: String): Boolean {
        var start = 0
        var end = s.length-1
        while(start<=end){

            // Skip non-alphanumeric characters
            while (start < end && !s[start].isLetterOrDigit()) {
                start++
            }

            while (start < end && !s[end].isLetterOrDigit()) {
                end--
            }
            if(s[start].lowercaseChar()!=s[end].lowercaseChar())return false
            start++
            end--
        }
        return true
    }
}
