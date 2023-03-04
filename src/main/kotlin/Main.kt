fun getUserChoice(userChoice: Array<String>): String {

    var isValidChoice = false
    var userValue = ""
    while (!isValidChoice) {
        // Ask the user for their choice
        println("Ваш выбор:")

        for ((index, item) in userChoice.withIndex()) {
            println("${index + 1} . $item")
        }
        val userInput = readlnOrNull().toString()
        println("Вы выбрали: $userInput")

        // validate the user input
        if (userInput in userChoice
        ) {
            isValidChoice = true
            userValue = userInput
        } else (println(ERROR_MESSAGE))

        // If the choice is invalid inform the user
        if (!isValidChoice) {
            ERROR_MESSAGE


        }


    }
    return userValue

}


fun getGameChoice(randomChoice: String) = randomChoice

fun printResult(gamePrint: String, userPrint: String) {

    println("Компьютер выбрал: $gamePrint")
    if (gamePrint == userPrint) {
        println("Ничья")
    } else if (gamePrint == "Камень" && userPrint == "Бумага") {
        println("$userPrint бьёт $gamePrint. (Вы выйграли!!")
    }  else if (gamePrint == "Бумага" && userPrint == "Камень") {
        println("$userPrint не бьёт Бумагу. (Вы проиграли)")
    }    else if (gamePrint == "Ножницы" && userPrint == "Камень") {
            println("$userPrint бьёт $gamePrint. (Вы выйграли!!)")
    } else if (gamePrint == "Камень" && userPrint == "Ножницы") {
        println("$userPrint не бьют $gamePrint. (Вы проиграли)")
    } else if (gamePrint == "Ножницы" && userPrint == "Бумага") {
        println("$userPrint не бьёт $gamePrint. (Вы проиграли) ")
    } else if (gamePrint == "Бумага" && userPrint == "Ножницы") {
        println("$userPrint бьют Бумагу. (Вы выйграли!!)")
    }
    else (ERROR_MESSAGE)


}

const val ERROR_MESSAGE = "Вы неправильно ввели, попробуйте заново"

fun main() {
    val choices = arrayOf("Камень", "Бумага", "Ножницы")
    val gameChoice = getGameChoice(choices.random())
    val userChoice = getUserChoice(choices)
    printResult(gameChoice, userChoice)

}