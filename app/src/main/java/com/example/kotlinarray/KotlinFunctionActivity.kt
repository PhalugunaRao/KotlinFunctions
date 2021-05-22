package com.example.kotlinarray

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class KotlinFunctionActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Generate List excluding null
        //https://pongployappdev.medium.com/kotlins-collection-how-to-use-memo-5a8ca9478c53
        val list= listOf(null,1,2,3,4,5,null)
        val notNullList = listOfNotNull(null,1,2,3,4,5,null)
        println("==list==$list")
        println("==notNullList===$notNullList")

        //lastIndex

        val  listlastIndex  =  listOf ( 1 ,  2 ,  3 ,4,5)
        println("==listlastIndex===${listlastIndex.lastIndex}")
        //all()

        val iteratorAll = listOf(1,2,3)

        println("==iteratorAll===${iteratorAll.all { it<4 }}")
        println("======iteratorAll===${iteratorAll.all { it<3}}")

        println("====iteratorAny===${iteratorAll.any { it<4 }}")
        println("====iteratorAny===${iteratorAll.any { it<0 }}")

        //average ()

        val myAveg= listOf(1,2,3)
        println("=====average===${myAveg.average()}")

       // distinct ()

        val distinct = listOf(1,2,1,1,3,2,3,4,5,6,4,5,6)
        println("====distinct===${distinct.distinct()}")

        println("====distinct===${distinct.distinctBy { it>2 }}")

       // filterNot ()

        val filterTest= listOf(1,2,3,4,5)
        println("===filterTest==${filterTest.filterNot { it%2==0 }}")

        //fold ()

       //intersect ()

        val h1= listOf(1,2,3,4,5)
        val h12= listOf(2,3,5,2)
        h1.intersect(h12)
        val t2 : Set<Int> = h1.intersect(h12)
        println("t2=====$t2")
    }
}