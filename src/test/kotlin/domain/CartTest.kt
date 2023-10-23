package domain

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CartTest {

    @Test
    fun shouldAddProductToCart() {
        val cart = Cart()
        val product = Product("Some test product")
        cart.add(product)
        val actual = cart.products

        assertEquals(1,actual.size)
        assertEquals("Some test product",actual.get(0).name)
    }
}
