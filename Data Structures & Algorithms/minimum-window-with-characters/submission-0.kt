class Solution {
    fun minWindow(s: String, t: String): String {
        var start = 0
        var minLength = Int.MAX_VALUE
        if (s.isEmpty() || t.isEmpty()) return ""
        var need = HashMap<Char, Int>()
        for(i in t){
            need[i] = need.getOrDefault(i,0)+1
        }
        var window = HashMap<Char,Int>()
        var left = 0
        var formed = 0
        var required = need.size
        for(right in s.indices){
            var c = s[right]
            window[c] =  window.getOrDefault(c,0)+1
            if(need.containsKey(c) && need[c]==window[c]){
                formed++
            }
            while(formed == required){
                if(right-left+1<minLength){
                    minLength = right-left+1
                    start = left
                }
                var leftChar = s[left]
                window[leftChar]=window[leftChar]!!-1
                if(need.containsKey(leftChar) && need[leftChar]!!>window[leftChar]!!){
                    formed--
                }
            left++
            }

        }
        if(minLength==Int.MAX_VALUE) return "" else return s.substring(start,start+minLength)





    }
}
