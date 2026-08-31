class Solution {
    fun minWindow(s: String, t: String): String {
        var left =0 
        var minLeft =0
        var right =0
        val need = mutableMapOf<Char,Int>()
        for(i in t){
            need[i]=need.getOrDefault(i,0)+1
        }
        var minLength = Int.MAX_VALUE
        var window = mutableMapOf<Char,Int>()
        var formed = 0
        while(right<s.length){
            var c = s[right]
            if(need.containsKey(c)){
                window[c] = window.getOrDefault(c,0)+1
                if(window[c]==need[c]){
                    formed++
                }
            }

            while(formed==need.size){
                //update minlength
                if(minLength> right-left+1){
                    minLength = right-left+1
                    minLeft = left
                }
                var leftChar = s[left]
                if(need.containsKey(leftChar)){
                    window[leftChar]= window[leftChar]!!-1
                    if(window[leftChar]!!<need[leftChar]!!){
                        formed--
                    }
                }
                left++
            }
            right++

        }
        return  if (minLength == Int.MAX_VALUE) ""
        else s.substring(minLeft,minLength+minLeft)
    }
}
