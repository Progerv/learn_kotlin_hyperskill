//Kotlin 1.1
package machine
import java.util.Scanner

fun main(args: Array<String>) {
    
    val scanner = Scanner(System.`in`)
    print("Write how many ml of water the coffee machine has: ")
    val mlWater = scanner.nextInt()
    println(mlWater)
    print("Write how many ml of milk the coffee machine has: ")
    val mlMilk = scanner.nextInt()
    println(mlMilk)
    print("Write how many grams of coffee beans the coffee machine has: ")
    val grCoffee = scanner.nextInt()
    println(grCoffee)
    print("Write how many cups of coffee you will need: ")
    val cupsNeed = scanner.nextInt()
    println(cupsNeed)
    val wCup: Int = mlWater/200
    val mCup: Int = mlMilk/50
    val cCup: Int = grCoffee/15
    val cupReal: Int = listOf(wCup, mCup, cCup).min()!!.toInt()
    if (cupsNeed == cupReal) {
        println("Yes, I can make that amount of coffee")
    } else if (cupsNeed > cupReal) {
        println("No, I can make only $cupReal cups of coffee")
    } else {
        println("Yes, I can make that amount of coffee (and even ${cupReal - cupsNeed} more than that)")
    }
    
}
