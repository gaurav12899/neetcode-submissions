class TimeMap() {
    private data class TimeValue(val timestamp: Int, val value: String)
    private val map = HashMap<String, ArrayList<TimeValue>>()
    fun set(key: String, value: String, timestamp: Int) {
        if (!map.containsKey(key)) {
            map[key] = ArrayList()
        }
        map[key]!!.add(TimeValue(timestamp, value))
    }

    fun get(key: String, timestamp: Int): String {
        val timeline = map[key] ?: return ""

        var start = 0
        var end = timeline.size - 1
        var result = ""

        while (start <= end) {
            val mid = start + (end - start) / 2
            val midTime = timeline[mid].timestamp

            if (midTime == timestamp) {
                return timeline[mid].value
            } else if (midTime < timestamp) {
                result = timeline[mid].value
                start = mid + 1
            } else {
                end = mid - 1
            }
        }

        return result
    }
}
