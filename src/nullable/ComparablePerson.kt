package nullable

fun main(args: Array<String>) {

    (1 .. 2 ).forEach { (1 .. 50).forEach{ print("#") }; println() }
    (1 .. 2 ).forEach { println() }



    /////////////////////////////////////////////////////////////

    class Person(val firstName: String, val lastName: String) {

        override fun equals(other: Any?): Boolean {

            val otherPerson = other as? Person ?: return false

            return otherPerson.firstName == firstName &&
                    otherPerson.lastName == lastName

        }

        override fun hashCode(): Int =
                firstName.hashCode() * 37 + lastName.hashCode()
    }

    /////////////////////////////////////////////////////////////


    val p1 = Person("Dmitry", "Jemerov")

    val p2 = Person("Dmitry", "Jemerov")

//    println(p1 == p2)
//
//    println(p1.equals(42))


    /////////////////////////////////////////////////////////////


    fun ignoreNulls(s: String?) {

        val sNotNull: String = s!!

        println(sNotNull.length)

    }


//    ignoreNulls(null)


    /////////////////////////////////////////////////////////////


    var email: String? = "yole@example.com"


    fun sendEmailTo(email: String) = println("Sending email to $email")


    /////////////////////////////////////////////////////////////

    email?.let { sendEmailTo(it) }


    email = null


    email?.let { sendEmailTo(it) }


    /////////////////////////////////////////////////////////////









    /////////////////////////////////////////////////////////////
    (1 .. 2 ).forEach { println() }
    (1 .. 2 ).forEach { (1 .. 50).forEach{ print("#") }; println() }
}