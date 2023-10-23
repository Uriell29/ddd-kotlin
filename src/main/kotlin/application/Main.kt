import domain.Cart
import domain.Product

fun main(args: Array<String>) {

    val cart = Cart()
    val product = Product("Apple Pencil")
    cart.add(product)

    println("Cart = $cart")
    println("----------------------------------------")
    println("products = ${cart.products}")
    println("----------------------------------------")
}
