package algorithmx

data class Vertex(val name: String)

data class Edge<out T>(val src: Vertex, val dest: Vertex, val weight: T)

class Graph<out T>(private val edges: List<Edge<T>>) {
    private val vertexes: Set<Vertex>

    init {
        vertexes = edges.map { Pair(it.src, it.dest) }
                .fold(mutableSetOf()) { accSet, pair ->
                    accSet.add(pair.first)
                    accSet.add(pair.second)

                    accSet
                }
    }
}

fun createGraph(): Graph<Int> {
    val listOfVertex = (0..8).map { Vertex(it.toString()) }
    val listOfEdges = mutableListOf<Edge<Int>>()

    // 0
    listOfEdges.add(Edge(listOfVertex[0], listOfVertex[1], 4))
    listOfEdges.add(Edge(listOfVertex[0], listOfVertex[7], 8))
    // 1
    listOfEdges.add(Edge(listOfVertex[1], listOfVertex[2], 8))
    listOfEdges.add(Edge(listOfVertex[1], listOfVertex[7], 11))
    // 2
    listOfEdges.add(Edge(listOfVertex[2], listOfVertex[3], 7))
    listOfEdges.add(Edge(listOfVertex[2], listOfVertex[5], 4))
    listOfEdges.add(Edge(listOfVertex[2], listOfVertex[8], 2))
    // 3
    listOfEdges.add(Edge(listOfVertex[3], listOfVertex[4], 9))
    listOfEdges.add(Edge(listOfVertex[3], listOfVertex[5], 14))
    // 4
    listOfEdges.add(Edge(listOfVertex[4], listOfVertex[5], 10))
    // 5
    listOfEdges.add(Edge(listOfVertex[5], listOfVertex[6], 10))
    // 6
    listOfEdges.add(Edge(listOfVertex[6], listOfVertex[7], 1))
    listOfEdges.add(Edge(listOfVertex[6], listOfVertex[8], 6))
    // 7
    listOfEdges.add(Edge(listOfVertex[7], listOfVertex[8], 7))

    return Graph(listOfEdges)
}