class TimeMap() {

    // fun set(key: String, value: String, timestamp: Int) {

    // }

    // fun get(key: String, timestamp: Int): String {

    // }
    private val map = HashMap<String, MutableList<Pair<Int, String>>>()

    fun set(key: String, value: String, timestamp: Int) {
        map.getOrPut(key) { mutableListOf() }
            .add(timestamp to value)
    }

    fun get(key: String, timestamp: Int): String {
        val list = map[key] ?: return ""

        var start = 0
        var end = list.size - 1
        var answer = ""

        while (start <= end) {
            val mid = start + (end - start) / 2

            if (list[mid].first <= timestamp) {
                answer = list[mid].second
                start = mid + 1
            } else {
                end = mid - 1
            }
        }

        return answer
    }
}
