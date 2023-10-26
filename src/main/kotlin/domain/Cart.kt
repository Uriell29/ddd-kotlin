package domain

import domain.events.DomainEvent
import domain.events.ItemAddedToCartEvent
import domain.events.ItemRemovedFromCartEvent

data class Cart(
    val cartId: CartId = CartId.generateCartId(),
    val events: MutableList<DomainEvent> = mutableListOf(),
    val items: MutableList<Item> = mutableListOf()
) : Entity<Cart> {

    val removedProducts: MutableSet<String> = mutableSetOf()

    fun add(item: Item) {
        val itemAddedEvent = ItemAddedToCartEvent(item.product.name,item.quantity, item.product.price)

        apply(itemAddedEvent)
    }

    fun remove(item: Item) {
        val itemRemovedFromCartEvent = ItemRemovedFromCartEvent(item.product.name)
        apply(itemRemovedFromCartEvent)
    }

    private fun apply(event: ItemAddedToCartEvent) {
        events.add(event)
        items.add(Item(Product(event.productName,event.price), event.quantity))
    }

    private fun apply(event: ItemRemovedFromCartEvent) {
        events.add(event)

        val removed = items.remove(items.first { item -> item.product.name == event.productName })
        if (removed) {
            removedProducts.add(event.productName)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val cart = other as Cart
        return cartId == cart.cartId
    }

    override fun hashCode(): Int {
        return cartId.hashCode()
    }

    override fun hasSameIdentityAs(other: Cart): Boolean {
        if (this == other) return true
        if (this.javaClass != other.javaClass) return false
        return cartId == other.cartId
    }

    override fun toString(): String {
        return "Cart{items='$items'}"
    }
}
