package domain

import java.util.*


class CartId(private val randomUUID: UUID = UUID.randomUUID()) {

    companion object {
        fun generateCartId(): CartId {
            return CartId(UUID.randomUUID())
        }
    }
}