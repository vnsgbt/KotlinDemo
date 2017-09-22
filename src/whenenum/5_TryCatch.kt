package whenenum

import java.io.BufferedReader
import java.io.StringReader




fun readNumber(reader: BufferedReader) {

    val number = try {

        Integer.parseInt(reader.readLine())

    } catch (e: NumberFormatException) {

        null  //return

    }

    println(number)
}




fun main(args: Array<String>) {

    val reader = BufferedReader(StringReader("not a number"))

    readNumber(reader)

}

