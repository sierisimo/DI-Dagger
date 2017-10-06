package advent

data class Ingredient(val capacity: Int,
                      val durability: Int,
                      val flavor: Int,
                      val texture: Int,
                      val calories: Int) {
    constructor(map: Map<String, Int>) : this(
            map["capacity"] ?: 0,
            map["durability"] ?: 0,
            map["flavor"] ?: 0,
            map["texture"] ?: 0,
            map["calories"] ?: 0)
}

fun science4HungryPeople(teaspoons: Int = 100, ingredients: List<String>): Long {
    val listOfIngredients = getIngredientsFromString(ingredients)

    return 0
}

fun getIngredientsFromString(str: List<String>): List<Ingredient> = str.map(::parseIngredient)

fun parseIngredient(str: String): Ingredient {
    val attrValueMap = str.split(":")[1].split(",")
            .map {
                val attributeSplit = it.trim().split(" ")
                Pair(attributeSplit[0], attributeSplit[1].toInt())
            }.toMap()

    return Ingredient(attrValueMap)
}