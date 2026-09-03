class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        var cars = position.indices.map{it->
                                    position[it] to speed[it]
        }.sortedByDescending{it.first}
        val stack = Stack<Float>()
        for((ps,sp) in cars){
            val time = (target-ps).toFloat()/sp
            if(stack.isEmpty() || stack.peek()<time){
                stack.push(time)
            }
        }
        return stack.size
    }
}
