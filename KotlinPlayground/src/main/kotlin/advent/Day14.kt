package advent

data class Reindeer(
        val velocityKmS: Int,
        val secondsRunning: Int,
        val restingTime: Int,
        var totalDistance: Long,
        var points: Long = 0) {
    private var counterForRunned = 0
    private var counterForRested = restingTime

    fun advance() {
        if (counterForRunned != secondsRunning) {
            counterForRunned++
            totalDistance += velocityKmS

            if (counterForRunned == secondsRunning) counterForRested = restingTime
        } else {
            counterForRested--
            if (counterForRested == 0) counterForRunned = 0
        }
    }
}

fun reindeerOlympics(time: Int, statements: List<String>, maxByPredicate: (Reindeer) -> Long): Reindeer? {
    val listOfReindeers = parseStatements(statements)
    for (i in 1..time) {
        var leaderDistance = 0L
        listOfReindeers.forEach {
            it.advance()
            if(it.totalDistance > leaderDistance) leaderDistance = it.totalDistance
        }
        listOfReindeers.filter { it.totalDistance == leaderDistance }.forEach { it.points++ }
    }
    return listOfReindeers.maxBy(maxByPredicate)
}

fun parseStatements(statements: List<String>): List<Reindeer> =
        statements.map { reindeerFromStatement(it) }


fun reindeerFromStatement(statement: String): Reindeer {
    val parts = statement.split(" ")
    val velocityKMxS = parts[3].toInt()
    val seconds = parts[6].toInt()
    val restingTime = parts[parts.size - 2].toInt()

    return Reindeer(velocityKMxS, seconds, restingTime, 0)
}