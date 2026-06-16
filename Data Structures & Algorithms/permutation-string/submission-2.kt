class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if(s1.length>s2.length)return false
        var window = IntArray(26)
        var need = IntArray(26)
        for(i in s1){
            need[i-'a']++
        }
        for(i in 0 until s1.length){
            window[s2[i]-'a']++
        }
        if (need.contentEquals(window)) return true
        for(i in s1.length until s2.length){
            window[s2[i]-'a']++
            window[s2[i-s1.length]-'a']--
            if (need.contentEquals(window)) return true

        }
        return false
    }
}
