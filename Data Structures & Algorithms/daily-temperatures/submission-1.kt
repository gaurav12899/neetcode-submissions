class Solution {
    fun dailyTemperatures(temps: IntArray): IntArray {
        // ek stack banake usko ulta traverse karenge, kyuki muje aage wale ka info chaiye to me tabhi pata kar sakta hu jab mene traverse kia ho, to jab jab bada elmenet milega stack me uska index push karenge, jbtk nhi milta pop karte rahenge, top ka index minus element ka index mera us index ka result hoga
        val stack = Stack<Int>()
        var size = temps.size
        var result = IntArray(size)
        for(i in size-1 downTo 0){
            
            while (stack.isNotEmpty() && temps[stack.peek()] <= temps[i]) {
                stack.pop()
            }

            if (stack.isNotEmpty()) {
                result[i] = stack.peek() - i
            }

            stack.push(i)
        }
        return result
    }
}
