fun main(){
    val fruitList = listOf("Pomme", "Banana", "Mangue")
    println(fruitList.size)
    println(fruitList.first())
    println(fruitList.last())

    val fruitListMutable = mutableListOf("Pomme", "Banana", "Mangue")
    fruitListMutable.add("Poisson 😁")
    println(fruitListMutable.size)
    println(fruitListMutable)

}