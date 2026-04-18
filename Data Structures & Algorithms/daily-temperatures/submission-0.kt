class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val n = temperatures.size
        val result = IntArray(n) { 0 }
        val stack = ArrayDeque<Int>()

        for (i in temperatures.indices) {
            while (stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]) {
                val prevIndex = stack.removeLast()
                result[prevIndex] = i - prevIndex
            }
            stack.addLast(i)
        }

        return result
    }
}