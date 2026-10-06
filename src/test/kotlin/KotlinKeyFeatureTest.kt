import org.junit.jupiter.api.Test

class KotlinKeyFeatureTest {

    @Test
    fun notNullable() {
//        var name: String = null
    }

    @Test
    fun nullable() {
        var name: String? = null
    }

    @Test
    fun safeCall() {
        val name: String? = null
        val len = name?.length
    }

    @Test
    fun elvisOperator() {
        val name: String? = null
        val len = name?.length ?: 100 // if-else
        println(len)
    }

    @Test
    fun function() {
        val result = sum(1,3)
        println(result)
    }

    private fun sum(num1: Int, num2: Int) = num1 + num2

    @Test
    fun typeRefer() {
        val name = "James"
        println(name)
    }

    @Test
    fun types() {
        val intNumber: Int = 10
        val longNumber: Long = 10
        val shortNumber: Short = 10
        val dNumber: Double = 10.1
        val bool: Boolean = true;
    }

    @Test
    fun collections() {
        // 1. List
        val fruits: List<String> = listOf("Apple", "Banana", "Pear", "Grape")
        println(fruits)
        println(fruits.size)

        val fruitsV2: MutableList<String> = mutableListOf("Apple", "Banana", "Pear", "Grape")
        fruitsV2.remove("Apple")
        println(fruitsV2.size)

        // 2. Set
        val fruitsSet = setOf("Apple", "Banana", "Pear", "Grape")
        val fruitsMuSet = mutableSetOf("Apple", "Banana", "Pear", "Grape")
    }

    @Test
    fun controlFlow() {
        val maxNum = max(1, 3)
        println(maxNum)

        val numberType = getNumberType(10)
        println(numberType)
    }

    private fun max(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

    private fun getNumberType(number: Int) = when {
        number < 0 -> "음수"
        number == 0 -> "제로"
        number > 0 -> "양수"
        else -> "Unknown"
    }
}