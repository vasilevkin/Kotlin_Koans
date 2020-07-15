import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate =
        this.addTimeIntervals(timeInterval, 1)

class RepTimeInt(val timeInterval: TimeInterval, val value: Int)

operator fun TimeInterval.times(number: Int): RepTimeInt =
        RepTimeInt(this, number)

operator fun MyDate.plus(timeInts : RepTimeInt): MyDate =
        addTimeIntervals(timeInts.timeInterval, timeInts.value)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
     return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
