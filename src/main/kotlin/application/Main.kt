import domain.Cart
import domain.Item
import domain.Product

fun main() {

    val cart = Cart()
    val applePencil = Item(Product("Apple Pencil"), 2)
    cart.add(applePencil)

    val headphones = Item(Product("Sony Wireless headphone"))
    cart.add(headphones)

    cart.remove(applePencil)

    println("Cart = $cart")
    println("----------------------------------------")
    println("items = ${cart.items}")
    println("----------------------------------------")

    println("Removed Products = ${cart.removedProducts}")

    val cart1 = Cart()
    val cart2 = Cart()
    val item1 = Item(Product("Sony Wireless headphone"))
    val item2 = Item(Product("Sony Wireless headphone"))
    cart1.add(item1)
    cart2.add(item1)
    println(cart1 == cart2)
    println(cart1 == cart1)
}
