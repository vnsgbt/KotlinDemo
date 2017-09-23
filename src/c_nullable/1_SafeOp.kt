package c_nullable



fun main(args: Array<String>) {


    /////////////////////////////

    fun printAllCaps(s: String?) = println(s?.toUpperCase())

    fun strLenSafe(s: String?) = s?.length ?: 0

    /////////////////////////////

    val x: String? = null

    println(strLenSafe(x))

    println(strLenSafe("abc"))

    printAllCaps("abc")

    printAllCaps(null)

    println(x?.length)


    /////////////////////////////


    class Employee(val name: String,
                   val manager: Employee?)

    class Address(val streetAddress: String,
                  val zipCode: Int,
                  val city: String,
                  val country: String)

    class Company(val name: String,
                  val address: Address?)


    class Person(val name: String,
                 val company: Company?)

    fun Person.countryName() = company?.address?.country ?: "Unknown"

    fun managerName(employee: Employee) = employee.manager?.name

    /////////////////////////////


    val ceo = Employee(
            "Da Boss",
            null)

    val developer = Employee(
            "Bob Smith",
            ceo)

    val person = Person(
            "Dmitry",
            null)

    /////////////////////////////


    println(managerName(developer))

    println(managerName(ceo))

    println(person.countryName())


    /////////////////////////////


    fun printShippingLabel(person: Person) {

        val address = person.company?.address
                ?: throw IllegalArgumentException("No address")

        with (address) {

            println(streetAddress)

            println("$zipCode $city, $country")

        }
    }

    /////////////////////////////

    val person2 = Person(
            "Dmitry",
            Company(
                    "JetBrains",
                    Address(
                            "Elsestr. 47",
                            80687,
                            "Munich",
                            "Germany")))


    printShippingLabel(person2)
}



