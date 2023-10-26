package domain.service

import domain.Cart
import domain.Order
import domain.Product
import java.util.stream.IntStream
import kotlin.streams.toList

class CheckoutService {

    fun checkout(cart: Cart): Order {
        //val products = cart.items.flatMap { IntStream.range(1,it.quantity).mapToObj(it.product).toList<Product>() }
        return Order(emptyList())
    }
}