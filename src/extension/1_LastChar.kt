package extension



fun String.lastChar(): Char = this[this.length - 1]





fun main(args: Array<String>) {


    println("Kotlin".lastChar())


}