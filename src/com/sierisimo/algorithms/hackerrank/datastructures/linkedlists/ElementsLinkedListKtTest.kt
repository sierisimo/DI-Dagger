package com.sierisimo.algorithms.hackerrank.datastructures.linkedlists

import org.junit.Assert.*
import org.junit.Test

/**
 * Created by Sinuhe_Jaime on 7/13/2017.
 */
class ElementsLinkedListKtTest {
    @Test
    fun test_createList() {
        val head = createList()

        assertNotNull("Check the list is not null", head)
        assertNotNull("Check it has content", head.data)
        assertTrue("Check the data is Int", head.data is Int)
    }

    @Test
    fun test_insertNode() {
        var head: Node? = null

        head = insertNode(head, 2)

        assertNotNull("Head Shouldn't be null after inserting first node", head)
        assertEquals("Data should be 2", 2, head.data)
    }

    @Test
    fun test_size() {
        var head = createList()

        assertEquals("Size for initial list is 3", 3, size(head))

        head = insertNode(head, 4)
        assertEquals("Size after insertion should be 4", 4, size(head))
    }

    @Test
    fun test_reverseList() {
    }

    @Test
    fun test_reverseWithoutStack() {

    }
}