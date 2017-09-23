package a_whenenum


fun main(args: Array<String>) {




    fun fizzBuzz(i: Int) = when {

        i % 15 == 0 -> "FizzBuzz "

        i % 3 == 0 -> "Fizz "

        i % 5 == 0 -> "Buzz "

        else -> "$i "
    }




    for (i in 1..100) {
        println(fizzBuzz(i))
    }



//    for (i in 100 downTo 1 step 2) {
//        println(fizzBuzz(i))
//    }



    ////////////////////////////////////////



//    val binaryReps = TreeMap<Char, String>()
//
//
//
//    for (c in 'A'..'F') {
//        val binary = Integer.toBinaryString(c.toInt())
//        binaryReps[c] = binary
//    }
//
//
//    for ((letter, binary) in binaryReps) {
//        println("$letter = $binary")
//    }




    /////////////////////////////////////////




//    fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
//
//    fun isNotDigit(c: Char) = c !in '0'..'9'
//
//
//
//
//    println(isLetter('q'))
//
//    println(isNotDigit('x'))



    /////////////////////////////////////////



}
