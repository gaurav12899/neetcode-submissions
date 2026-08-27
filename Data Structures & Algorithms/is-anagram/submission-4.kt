class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        var arr = IntArray(26){0}
        if(s.length!=t.length)return false
        for(i in 0 until s.length){
            arr[s[i]-'a']++
            arr[t[i]-'a']--
        }
        for(i in arr){
            if(i!=0)return false
        }
        return true
    }
}
