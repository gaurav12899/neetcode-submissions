class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        if(position.isEmpty()) return 0
            var cars = position.indices.map{i->
                val time = (target-position[i]).toDouble()/speed[i]
                Pair(position[i],time)
            }.sortedByDescending{it.first}
            var fleets = 0
            var mxTime = 0.0
            for(car in cars){
                val currentTime = car.second
                if(currentTime>mxTime){
                    fleets++
                    mxTime = currentTime
                }
            }
        return fleets
    }
}
