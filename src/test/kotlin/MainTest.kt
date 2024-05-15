import org.example.tambah
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun testTambah() {
        assertEquals(8, tambah(4, 4))
    }
}