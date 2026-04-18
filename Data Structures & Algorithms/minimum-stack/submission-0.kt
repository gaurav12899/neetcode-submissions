class MinStack() {
    private val st = ArrayDeque<Pair<Int, Int>>()

    fun push(`val`: Int) {
        if (st.isEmpty()) {
            st.addLast(`val` to `val`)
        } else {
            val currentMin = st.last().second
            st.addLast(`val` to minOf(`val`, currentMin))
        }
    }

    fun pop() {
        st.removeLast()
    }

    fun top(): Int = st.last().first

    fun getMin(): Int = st.last().second
}