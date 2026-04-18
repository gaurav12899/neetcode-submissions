class Solution {
    fun isValid(s: String): Boolean {
        val st = ArrayDeque<Char>()    
        
        for (i in s) {
            when (i) {
                '(', '{', '[' -> st.addLast(i)
                
                ')' -> if (st.isEmpty() || st.removeLast() != '(') return false
                '}' -> if (st.isEmpty() || st.removeLast() != '{') return false
                ']' -> if (st.isEmpty() || st.removeLast() != '[') return false
            }
        }
        
        return st.isEmpty()
    }
}