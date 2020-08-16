import junit.framework.Assert.*
import org.junit.Test

data class Product(
    val name: String,
    var price: Double,
    var onSale: Boolean = false
)

data class OrderItem(val product: Product, val quantity: Int)


class ProductTest {

    @Test
    fun `check equal`() {
        val p1 = Product("baseball", 10.0)
        val p2 = Product("baseball", 10.0, false)

        assertEquals(p1, p2)
        assertEquals(p1.hashCode(), p2.hashCode())
    }

    @Test
    fun `creae set to check equals and hashcode`() {
        val p1 = Product("baseball", 10.0)
        val p2 = Product(price = 10.0, onSale = false, name = "baseball")

        val produces = setOf(p1, p2)
        assertEquals(1, produces.size)
    }

//    @Test
//    fun `change price using copy`() {
//        val p1 = Product("baseball", 10.0)
//        val p2 = p1.copy(price = 12.0)
//
//        assertAll(
//            { assertEquals("baseball", p2.name) },
//            { assertEquals(p2.price, `is`(closeTo(12.0, 0.01)))},
//            { assertFalse(p2.onSale)}
//        )
//    }

    @Test
    fun `data copy function is shallow`() {
        val item1 = OrderItem(Product("baseball",10.0), 5)
        val item2 = item1.copy()

        assertTrue(item1 == item2)
        assertFalse(item1 === item2)

        assertTrue(item1.product == item2.product)
        assertTrue(item1.product === item2.product)
    }
}