class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var left = 0
        var maxFreq = 0
        var charCount = IntArray(26)
        var maxLength = 0
        for(right in s.indices){
            var rightCharIndex = s[right]-'A'
            charCount[rightCharIndex]++
            maxFreq = maxOf(maxFreq,charCount[rightCharIndex])
            var maxFreqNeeded = (right-left +1)-maxFreq
            if(maxFreqNeeded>k){
                var leftCharIndex = s[left]-'A'
                charCount[leftCharIndex]--
                left++
            }

            maxLength = maxOf(maxLength,right-left+1)
        }

    return maxLength
    }
}
