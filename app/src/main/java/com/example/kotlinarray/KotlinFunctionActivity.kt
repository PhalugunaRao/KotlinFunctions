package com.example.kotlinarray

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class KotlinFunctionActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Generate List excluding null

        val list= listOf(null,1,2,3,4,5,null)
        val notNullList = listOfNotNull(null,1,2,3,4,5,null)
        println("==list==$list")
        println("==notNullList===$notNullList")


    }
}