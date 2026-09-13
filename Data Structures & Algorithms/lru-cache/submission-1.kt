class LRUCache(private val capacity: Int) {

    class Node(
        var key: Int,
        var value: Int
    ) {
        var prev: Node? = null
        var next: Node? = null
    }

    private val map = HashMap<Int, Node>()

    private val head = Node(0, 0)
    private val tail = Node(0, 0)

    init {
        head.next = tail
        tail.prev = head
    }

    private fun remove(node: Node) {
        val prev = node.prev
        val next = node.next

        prev?.next = next
        next?.prev = prev
    }

    private fun add(node: Node) {
        val prev = tail.prev

        node.prev = prev
        node.next = tail

        prev?.next = node
        tail.prev = node
    }

    fun get(key: Int): Int {

        if (!map.containsKey(key)) {
            return -1
        }

        val node = map[key]!!

        remove(node)
        add(node)

        return node.value
    }

    fun put(key: Int, value: Int) {

        if (map.containsKey(key)) {

            val node = map[key]!!

            node.value = value

            remove(node)
            add(node)

            return
        }

        val node = Node(key, value)

        map[key] = node
        add(node)

        if (map.size > capacity) {

            val lru = head.next!!

            remove(lru)
            map.remove(lru.key)
        }
    }
}