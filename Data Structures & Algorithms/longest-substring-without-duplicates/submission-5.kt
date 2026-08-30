class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        var start = 0
        var end = 0
        val map = mutableMapOf<Char, Int>()
        var mx = 0

        while (end < s.length) {

            if (map.containsKey(s[end])) {
                start = maxOf(start, map[s[end]]!! + 1)
            }

            mx = maxOf(mx, end - start + 1)

            map[s[end]] = end
            end++
        }

        return mx
    }
}