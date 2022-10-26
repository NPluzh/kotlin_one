package com.example.kotlin_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<AppCompatButton>(R.id.btn).setOnClickListener {
            findViewById<TextView>(R.id.label_hello).text = "Кнопка нажата!"
            findViewById<TextView>(R.id.label_object1_property1).text = w1.town
            findViewById<TextView>(R.id.label_object1_property2).text = w1.temperature.toString()

            findViewById<TextView>(R.id.label_object2_property1).text = w2.town
            findViewById<TextView>(R.id.label_object2_property2).text = w2.temperature.toString()


            val weatherList = listOf(w1,w2)
            for(weather in weatherList) {
                println(weather.town)
            }

            for(i in 1..10) {
                println(i)
            }

            for(i in 10 downTo 1 step 2) {
                println(i)
            }


        }
    }

}

data class WeatherData constructor(val town: String, val temperature: Int)

val w1 = WeatherData("Москва", 5)
val w2 = w1.copy(town = "Санкт-Петербург", temperature = -5)

