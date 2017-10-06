package advent

import org.junit.Test
import kotlin.test.assertEquals

class Day15KtTest {
    val input = """Sugar: capacity 3, durability 0, flavor 0, texture -3, calories 2
                  |Sprinkles: capacity -3, durability 3, flavor 0, texture 0, calories 9
                  |Candy: capacity -1, durability 0, flavor 4, texture 0, calories 1
                  |Chocolate: capacity 0, durability 0, flavor -2, texture 2, calories 8""".trimMargin()

    @Test
    fun testScience4HungryPeople() {

    }

    @Test
    fun testGetIngredientsFromString() {
        val resultList = getIngredientsFromString(input.split("\n"))

        assertEquals(4, resultList.size)
        assertEquals(resultList.first(), Ingredient(3, 0, 0, -3, 2))
        assertEquals(resultList[1], Ingredient(-3, 3, 0, 0, 9))
        assertEquals(resultList[2], Ingredient(-1, 0, 4, 0, 1))
        assertEquals(resultList.last(), Ingredient(0, 0, -2, 2, 8))
    }

    @Test
    fun testParseIngredient() {
        val ingredientInput = input.split("\n").first()

        val ingredient = parseIngredient(ingredientInput)

        assertEquals(3, ingredient.capacity)
        assertEquals(0, ingredient.durability)
        assertEquals(0, ingredient.flavor)
        assertEquals(-3, ingredient.texture)
        assertEquals(2, ingredient.calories)
    }

}