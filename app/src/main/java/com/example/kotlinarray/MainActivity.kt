package com.example.kotlinarray

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myNumbers:List<Int> = listOf(2,3,4,5,8,34,56,89,90)

        //Function filter and map
        //filter
        val mysmallNums =myNumbers.filter { v-> v<10}
        for (num in mysmallNums){
            println("====$num")
        }

        //map
        val mysquNumber=myNumbers.map { it*it }
        for (num in mysquNumber){
            println("====$num")
        }

        //both

        val mysmallSquare=myNumbers.filter { it<10 }.map{  it*it}
        for (num in mysmallSquare){
            println("=mysmallSquare===$num")
        }

        var peopleDemo= listOf<Demo>(Demo(1,"phalu"), Demo(2,"dndn"), Demo(4,"xvxvv"))
        var names=peopleDemo.map { it.name }
        for (num in names){
            println("=names===$num")
        }

        /*Predicates: Or a condition that return TRUE Or False
        all:Do all elements Satisfy the condition
        any:Do any element in list satisfy
        count: total element satisfy the condition
        find: Return the first element satisfy condition
         */

        val demos= listOf(1,2,3,6,7,23,45,67,9)
        val check1= demos.all { it>10 }
        println("===check1==$check1")

        val check2=demos.any { it > 10 }

        println("===check2==$check2")

        val totalCount:Int=demos.count{it>10}
        println("===totalCount==$totalCount")

        val findNum =demos.find{it>10}
        println("===findNum==$findNum")


    }
}

class Demo(var age:Int,var name:String) {

}

