package nonrelated

import org.junit.Test

import org.junit.Assert.*

class GetPriceKtTest {
    @Test
    fun test_getValue() {
        assertEquals(40.0, getValue(25.0, 1000.0),0.0)
    }
}