class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var i =0
        var j=0
        var mx = 0
        val mset = HashSet<Char>()
        while(j<s.length){
            while (mset.contains(s[j])) {
                mset.remove(s[i])
                i++
            }
            mset.add(s[j])
            mx = maxOf(mx,j-i+1)
            j++
        }
        return mx
    }
}
