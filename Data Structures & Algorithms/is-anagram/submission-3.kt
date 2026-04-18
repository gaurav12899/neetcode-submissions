class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        
        val countMap = mutableMapOf<Char, Int>()
        
        for (char in s) {
            countMap[char] = countMap.getOrDefault(char, 0) + 1
        }
        
        for (char in t) {
            val count = countMap.getOrDefault(char, 0)
            if (count == 0) {
                return false
            }
            countMap[char] = count - 1
        }
        
        return true
    }
}
