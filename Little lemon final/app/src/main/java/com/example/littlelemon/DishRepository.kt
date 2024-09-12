package com.example.littlelemon

import androidx.annotation.DrawableRes

object DishRepository {
    val dishes = listOf(
        Dish(
            1,
            "Greek Salad",
            "Fresh lettuce, peppers, olives, and feta cheese with a tangy vinaigrette.",
            14.99,
            R.drawable.greeksalad
        ),
        Dish(
            2,
            "Lemon Dessert",
            "Italian Lemon Ricotta Cake with a light, citrusy flavor.",
            10.99,
            R.drawable.lemondesert
        ),
        Dish(
            3,
            "Bruschetta",
            "Grilled bread topped with ripe tomatoes, garlic, and basil.",
            6.99,
            R.drawable.bruchetta
        ),
        Dish(
            4,
            "Grilled Fish",
            "Fish marinated in citrus juices and grilled with zesty wedges.",
            22.99,
            R.drawable.grilledfish
        ),
        Dish(
            5,
            "Pasta",
            "Penne pasta with aubergines, cherry tomatoes, and spicy tomato sauce.",
            12.99,
            R.drawable.pasta
        ),
        Dish(
            6,
            "Lasagne",
            "Layers of pasta with Bolognese, béchamel, ham, and cheese.",
            11.99,
            R.drawable.lasagna
        )
    )

    fun getDish(id: Int) = dishes.firstOrNull { it.id == id }
}

data class Dish(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    @DrawableRes val imageResource: Int
)
