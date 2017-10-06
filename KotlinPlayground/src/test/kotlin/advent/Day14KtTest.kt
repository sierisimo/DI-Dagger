package advent

import org.junit.Test
import kotlin.test.assertEquals

class Day14KtTest {
    @Test
    fun test_reindeerOlympics() {
        val time = 2503
        val text =
                """Rudolph can fly 22 km/s for 8 seconds, but then must rest for 165 seconds.
                  |Cupid can fly 8 km/s for 17 seconds, but then must rest for 114 seconds.
                  |Prancer can fly 18 km/s for 6 seconds, but then must rest for 103 seconds.
                  |Donner can fly 25 km/s for 6 seconds, but then must rest for 145 seconds.
                  |Dasher can fly 11 km/s for 12 seconds, but then must rest for 125 seconds.
                  |Comet can fly 21 km/s for 6 seconds, but then must rest for 121 seconds.
                  |Blitzen can fly 18 km/s for 3 seconds, but then must rest for 50 seconds.
                  |Vixen can fly 20 km/s for 4 seconds, but then must rest for 75 seconds.
                  |Dancer can fly 7 km/s for 20 seconds, but then must rest for 119 seconds.""".trimMargin().split("\n")

        val reindeer = reindeerOlympics(time, text) { it.totalDistance }
        println(reindeer?.totalDistance)

        val reindeerByPoints = reindeerOlympics(time, text) { it.points }
        println(reindeerByPoints?.points)
    }

    @Test
    fun test_parseStatement() {
        val statement = "Rudolph can fly 22 km/s for 8 seconds, but then must rest for 165 seconds."
        val result = reindeerFromStatement(statement)

        assertEquals(22, result.velocityKmS)
        assertEquals(8, result.secondsRunning)
        assertEquals(165, result.restingTime)
    }
}