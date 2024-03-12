fun main(){
//    Mes Infos perso
    var prenom:String = "Adama"
    var nom:String = "Traore"
    var age:Int = 27
    val genre:String = "M"
    val matricule:String = "QWER1234"

    println("Je me nomme ${prenom.toUpperCase()} ${nom.toLowerCase()}, j'ai ${age.inc()} ans, et je suis de sexe $genre.")


    if (age >= 18){
        println("Laisser passer")
    }
    else{
        println("Pas de passer")
    }

    val passe:String = if (age >= 88){
            "Laisser passer"
        }
        else{
            "Pas de passer"
        }
    println(passe)

    val reponse = when{
        age == 28 -> "C'est adama no"
        age < 28 -> "C'est adama petit"
        age > 28 -> "C'est adama grand la"
        else -> "C'est pas adama"
    }
    println(reponse)

//  Les Fonctions
    fun genereString(): String {
        val passe:String = if (age >= 88){
            "Laisser passer"
        }
        else{
            "Pas de passer"
        }
        return  passe
    }
    var let = genereString()
    println(let)

    fun genereString1(num:Int): String {
        return if (age >= 88){
            "Laisser passer"
        }
        else{
            "Pas de passer"
        }
    }

    fun genereString2(num:Int): String = if (age >= 88){
            "Laisser passer"
        }
        else{
            "Pas de passer"
        }

    fun odd(x:Int): Boolean = x % 2 == 1
    println(odd(6))
    println(odd(7))
}