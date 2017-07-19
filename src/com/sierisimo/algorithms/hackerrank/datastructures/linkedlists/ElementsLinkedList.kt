package com.sierisimo.algorithms.hackerrank.datastructures.linkedlists

import java.util.*

/**
 * Created by Sinuhe_Jaime on 6/19/2017.
 *
 */
data class Node(var data: Int, var next: Node?) {
    constructor(data: Int) : this(data, null)
}

fun main(args: Array<String>) {
    val head = createList()
    println(reverseList(head))
}

fun createList(): Node {
    var head = Node(1)
    for (i in (2..3)) {
        head = insertNode(head, i)
    }
    return head
}

fun size(head: Node?): Int {
    if (head == null) {
        return 0;
    }else{
        var counter = 0
        var localHead = head
        while (localHead != null){
            counter++
            localHead = localHead.next
        }

        return counter
    }
}

fun insertNode(head: Node?, data: Int): Node {
    var localHead: Node? = head
    if (localHead == null) {
        localHead = Node(data)
    } else {
        localHead.next = insertNode(localHead.next, data)
    }

    return localHead
}

fun reverseList(head: Node?): Node? {
    val stack: Stack<Node?> = Stack()
    var tmpNode = head
    while (tmpNode != null) {
        stack.push(tmpNode)
        tmpNode = tmpNode.next
    }

    val nHead = stack.pop()
    tmpNode = nHead
    while (!stack.empty()) {
        tmpNode?.next = stack.pop()
        tmpNode = tmpNode?.next
    }
    tmpNode?.next = null
    return nHead
}

fun reverseWithoutStack(head: Node?): Node? {
    var localHead = head
    var last: Node? = localHead
    var next: Node?

    while (localHead != null) {
        next = localHead.next
        localHead.next = last
        last = localHead
        localHead = next
    }

    return localHead
}