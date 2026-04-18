class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val st = ArrayDeque<Int>()
        
        for (token in tokens) {
            when (token) {
                "+" -> st.addLast(st.removeLast() + st.removeLast())
                "*" -> st.addLast(st.removeLast() * st.removeLast())
                "-" -> {
                    val b = st.removeLast()
                    val a = st.removeLast()
                    st.addLast(a - b)
                }
                "/" -> {
                    val b = st.removeLast()
                    val a = st.removeLast()
                    st.addLast(a / b)
                }
                else -> {
                    st.addLast(token.toInt())
                }
            }
        }
        
        return st.last()
    }
}