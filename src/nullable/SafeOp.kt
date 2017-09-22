package nullable







class Employee(val name: String,
               val manager: Employee?)



fun managerName(employee: Employee): String? = employee.manager?.name



class Address(val streetAddress: String,
              val zipCode: Int,
              val city: String,
              val country: String)





class Company(val name: String,
              val address: Address?)


class Person(val name: String,
             val company: Company?)


fun Person.countryName(): String {

    return company?.address?.country ?: "Unknown"

}



fun main(args: Array<String>) {


    /////////////////////////////



    fun strLenSafe(s: String?) = s?.length ?: 0



    val x: String? = null



    /////////////////////////////




    fun printAllCaps(s: String?) {


        val allCaps: String? = s?.toUpperCase()


        println(allCaps)

    }


    println(strLenSafe(x))


    println(strLenSafe("abc"))


    println(x?.length)




    /////////////////////////////





    printAllCaps("abc")


    printAllCaps(null)




    /////////////////////////////




    val ceo = Employee(
            "Da Boss",
            null)



    val developer = Employee(
            "Bob Smith",
            ceo)



    println(managerName(developer))



    println(managerName(ceo))



    /////////////////////////////


    val person = Person(
            "Dmitry",
            null)


    println(person.countryName())


    /////////////////////////////


    class Address(val streetAddress: String,
                  val zipCode: Int,
                  val city: String,
                  val country: String)



    class Company(val name: String,
                  val address: Address?)




    class Person(val name: String,
                 val company: Company?)


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


    val address = Address(
            "Elsestr. 47",
            80687,
            "Munich",
            "Germany")


    val jetbrains = Company(
            "JetBrains",
            address)


    val person2 = Person(
            "Dmitry",
            jetbrains)


    printShippingLabel(person2)


    printShippingLabel(Person(
            "Alexey",
            null))


}



