package domain

class Cart(val items: MutableList<Item> = mutableListOf()) {

    val removedProducts: MutableSet<String> = mutableSetOf()
    fun add(item: Item){
        items.add(item)
    }

    fun remove(item: Item){
        val removed = items.remove(item)
        if (removed) {
            removedProducts.add(item.product.name)
        }
    }

    override fun toString(): String {
        return "Cart{items='$items'}"
    }
}