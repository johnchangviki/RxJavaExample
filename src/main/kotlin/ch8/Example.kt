package ch8

fun main(args: Array<String>) {
}

fun `demonstrate whole-number integer`() {
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1 // Byte
    val sixteenByHex = 0x0F // Int
    val elevenByBinary = 0b00001011 // Int
    // use underscore to make number constants more readable
    val oneMillion = 1_000_000 // Int
    val creditCardNumber = 1234_5678_9012_3456L // Long
    val socialSecurityNumber = 999_99_9999L // Long
    val hexByte = 0xFF_EC_DE_5E // Long
    val bytes = 0b11010010_01101001_10010100_10010010 // Long
}

fun `demonstrate number with decimal`() {
    val pi = 3.14 // Double
    val e = 2.7182818284
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817
}
