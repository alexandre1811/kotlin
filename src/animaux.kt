
interface animal{
        var son : String
        var animal : String

    fun bruit(){
        val str: String = "mon son est "
        val result = str + son
        println(result)
    }

    fun quisuisje(){
        val str: String = "je suis un "
        val result2 = str + animal
        println(result2)
    }

}

class animalerie{

}

class chien : animal{
    override var son : String = "wouf"
    override var animal : String = "chien"
}

class chat : animal{
    override var son : String = "miaou"
    override var animal : String = "chat"
}

class perroquet : animal{
    override var son : String = "coa"
    override var animal : String = "perroquet"
}

fun main(args: Array<String>){

    print("Quel animal? ")
    val stringInputChien = readLine()!!
    val stringInputChat = readLine()!!

    if (stringInputChien == "chien"){


        var Animal: animal = chien()
        Animal.bruit()
        Animal.quisuisje()

    }

    else if (stringInputChat == "chat?"){
        var Animal: animal = chat()
        Animal.bruit()
        Animal.quisuisje()

    }


}
