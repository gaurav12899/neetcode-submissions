class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        var start = 0
        var end = s1.length-1
        if(s1.length>s2.length)return false
        while(end<s2.length){
            print(end)
            var valid = validWindow(s1,s2.substring(start,end+1))
            if(valid)return true
            end++
            start++
        }
        return false

    }
    fun validWindow(s1:String,s2:String): Boolean{
        var arr = IntArray(26)
        for(i in s1.indices){
            arr[s1[i]-'a']++
            arr[s2[i]-'a']--
        }
        for(i in arr){
            if(i!=0)return false
        }
        return true
    }
}
