fun main() {
    val const = 12
    var noConst = 8
    noConst = 18
    println(noConst)

    val age: Int = 27


    val fooString = "My String Is Here!"
    val barString = "Printing on a new line?\nNo Problem!"
    val bazString = "Do you want to add a tab?\tNo Problem!"
    println(fooString)
    println(barString)
    println(bazString)

    val fooTemplateString = "$fooString has ${fooString.length} characters"
    println(fooTemplateString)

    var fooNullable: String? = "abc"
    println(fooNullable?.length) // => 3
    println(fooNullable?.length ?: -1) // => 3
    fooNullable = null
    println(fooNullable?.length) // => null
    println(fooNullable?.length ?: -1)


}