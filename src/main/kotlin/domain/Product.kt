package domain

data class Product(val name: String) {
    override fun toString(): String {
        return "Product{name='$name'}"
    }
}