package whenenum




fun eval_(e: Expr): Int =

        when (e) {

            is Num -> e.value

            is Sum -> eval(e.right) + eval(e.left)

            else -> throw IllegalArgumentException("Unknown expression")

        }




fun main(args: Array<String>) {

    println(eval_(Sum(Num(1), Num(2))))

}

