data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {

    override fun compareTo(other: MyDate): Int =

            when {
                this.year != other.year -> this.year - other.year
                this.month != other.month -> this.month - other.month
                this.dayOfMonth != other.dayOfMonth -> this.dayOfMonth - other.dayOfMonth
                else -> 0
            }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
