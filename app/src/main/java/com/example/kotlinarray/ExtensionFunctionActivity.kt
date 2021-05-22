package com.example.kotlinarray

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ExtensionFunctionActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //https://medium.com/techshots/kotlin-collection-function-12fc3c16f579
        val list = listOf(
            User("Yash",24),
            User("Dilpreet",22),
            User("himanshu",24),
            User("deepanshu",21),
            User("rohit",19),
            User("sonam",18)
        )

        // 1) Find if any user has age greater than 22?

       // any — returns true if any element in the collection satisfies the predicate
        val greter24User=list.any {
            it.age>22
        }
        println("====age===$greter24User")
       /* What if we need to find if all user has age greater than 22?
        all — returns true if all element satisfies the predicate*/

        val allgreter24User=list.all {
            it.age>22
        }
        println("====allgreter24User===$allgreter24User")

       /* If we need to check if no element in the list satisfies the predicate.
        none — returns true if no element satisfies the given condition*/

        val noUser=list.none{
            it.age>22
        }
        println("====noUser===$noUser")


        //Q2. Find all user with age greater than 22?

        val r1=list.filter {
            it.age>22
        }

        for (num in r1){
            println("==$num")
        }

        val r2=list.count{
            it.age>24
        }
        println("=r2=$r2")

        //Q3.Find user with name equal to Yash?
        //find — returns the first element for which the predicate is true else null

        val r4=list.find { it.name == "sonam" }

        println("=r4=$r4")

       // Q4. Find the user with age greater than equal to 24 from the last?
        //findLast — returns the last element for which the predicate is true else null
        val r5 = list.findLast {
            it.age>=24
        }
        println("=r5=$r5")


       /* val r6=list.first{
            it.age>24
        }
        println("=r6=$r6")
         Caused by: java.util.NoSuchElementException: Collection contains no element matching the predicate.
        */

       // last/lastOrNull
        val r7=list.firstOrNull(){
            it.age>24
        }
        println("=r7=$r7")

       // Q5. Group the user by their age?

        val r8=list.groupBy {
            it.age
        }
        for (num in r8){
            println("===r8===$num")
        }

       /* There is another function that is little similar to this ie. associateBy.
        associateBy — makes a map of the element in the collection using the predicate function provided as a parameter.
        The difference from groupBy — if there are multiple values for a key associateBy keeps the last one whereas groupBy creates a list for it.
*/
        val result9 = list.associateBy{user -> user.age}

        for (num in result9){
            println("===result9===$num")
        }



        val u1= arrayListOf(
            User("A1",age=21),
            User("A2", age=22),
            User("A3", age=23),
            User("A4", age=24)
        )

        val u2= arrayListOf(
            User("B1",age=21),
            User("B2", age=22),
            User("B3", age=23),
            User("B4", age=24)
        )

        val u3= arrayListOf(
            User("C1",age=21),
            User("C2", age=22),
            User("C3", age=23),
            User("C4", age=24)
        )
        val list2 = listOf(
            UserSection("A",u1),
            UserSection("B",u2),
             UserSection("C",u3)

        )

        /*Q6.Return list of all user?
        flatMap — iterates over each element in the collection use the transform function on it and then return a single list of result.
*/
        val rr3=list2.flatMap {
            it.users
        }

        println("====rr3===$rr3")

        /*Q7. Return all list of user with age>21?
        Now we can use more than one functions to achieve this.
*/


        val rr4=list2.flatMap { it.users}.filter { it.age>21 }

        println("====rr4===$rr4")


      /*  Q8.Return all the name of users with age > 21?*/

        val rr5=list2.flatMap { it.users }.filter { it.age>21 }.map { it.name }
        println("====rr5===$rr5")

        //Q9.Group student by age?

        val rr6=list2.flatMap { it.users }.groupBy { it.age }



     /*   adb tcpip 5555
//then
        adb connect your.device.ip.address
//or
        adb connect your.device.ip.address:5555
*/

    }
}