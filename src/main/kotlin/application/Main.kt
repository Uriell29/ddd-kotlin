import domain.Cart
import domain.Item
import domain.Price
import domain.Product


fun main() {

    //codeProblem1to5();

    codeProblem6()

    val cart = Cart()

}

private fun codeProblem6() {
    //Code Problem 6
    val cart1 = Cart()
    val cart2 = Cart()

    val headphone1 = Product("Sony Wireless headphone", Price(10.0))
    val headphoneItem1 = Item(headphone1, 1)

    val headphone2 = Product("Sony Wireless headphone", Price(10.0))
    val headphoneItem2 = Item(headphone2, 1)

    cart1.add(headphoneItem1)
    cart2.add(headphoneItem2)

    println("----------------------------------------")
    print("cart1.equals(cart2) :")
    println(if (cart1 == cart2) "true=Carts are same " else "false=Carts are different")
    println("----------------------------------------")
    print("cart1.hasSameIdentityAs(cart2) :")
    println(if (cart1.hasSameIdentityAs(cart2)) "true=Carts are same" else "false=Carts are different")
    println("----------------------------------------")
}

private fun codeProblem1to5() {
    val cart = Cart()
    val headphone = Product("Sony Wireless headphone", Price(10.0))
    val headphoneItem = Item(headphone, 1)
    cart.add(headphoneItem)
    val applePencil = Product("Apple Pencil", Price(200.0))
    val applePencilItem = Item(applePencil, 2)
    cart.add(applePencilItem)
    println("Cart = $cart")
    val items: List<Item> = cart.items
    println("items = $items")
    val applePencil1 = Product("Apple Pencil", Price(200.0))
    val applePencilItem1 = Item(applePencil1, 2)
    cart.remove(applePencilItem1)
    println("----------------------------------------")
    println("After Removing Apple Pencil with 2 quantity")
    println("Cart = $cart")
    val items1: List<Item> = cart.items
    println("items = $items1")
    println("----------------------------------------")
    println("Removed product names = " + cart.removedProducts)
}