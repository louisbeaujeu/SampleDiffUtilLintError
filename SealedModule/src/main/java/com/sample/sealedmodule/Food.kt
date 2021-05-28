package com.sample.sealedmodule

sealed class Food(open val id: String) {
    data class Cheeseburger(override val id: String, val type: String) : Food(id)
    data class Cake(override val id: String, val type: String) : Food(id)
}
