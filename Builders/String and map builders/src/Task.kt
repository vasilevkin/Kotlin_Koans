import java.util.HashMap

fun <T, U> buildMap(build: HashMap<T, U>.() -> Unit): HashMap<T, U> {
    val map = HashMap<T, U>()
    map.build()
    return map
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
