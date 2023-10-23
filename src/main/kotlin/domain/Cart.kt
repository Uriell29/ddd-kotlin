package domain

class Cart(val products: MutableList<Product> = mutableListOf()) {

    fun add(product: Product){
        products.add(product)
    }

    override fun toString(): String {
        return "Cart{products='$products'}"
    }
}