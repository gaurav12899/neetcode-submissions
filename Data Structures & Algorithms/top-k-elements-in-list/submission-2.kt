class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String,MutableList<String>>()
        for(i in strs){
            var count = IntArray(26)
            for(j in i){
                count[j-'a']++
            }
            val key = count.joinToString("#")
            map.getOrPut(key) { mutableListOf() }.add(i)
        }
        return map.values.toList()
    }
}
