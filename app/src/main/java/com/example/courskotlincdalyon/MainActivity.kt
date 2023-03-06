package com.example.courskotlincdalyon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Constructor Primaire
class User(
    val name: String,
    val age: Int,
    val height: Float
) {
    //condition
    private val canPlayBasketBall = age >5 && height> 1.50f

    init {
        val basketString = when(canPlayBasketBall){
            true -> "peut jouer"
            false -> "Ne peut pas jouer"
        }
        println("Info: ${name}, ${age} ans,  ${basketString}")
    }
    constructor(name: String): this(name, 5, 1.20f)
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kevin = User("Kevin", 42, 1.65f)
        val yvan = User("Yvan", 20, 1.92f)
        val curtis = User("Curtis")
    }
}