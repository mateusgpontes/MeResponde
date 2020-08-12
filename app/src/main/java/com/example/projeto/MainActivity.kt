package com.example.projeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

fun resMenssage(): String {

    val res = arrayOf("Sim", "Não", "Talves")
    val randow = Random.Default
    val index: Int = randow.nextInt(3)

    return res[index]
}



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textDefault = "Faça sua pergunta"

        editText.setOnFocusChangeListener { v, hasFocus ->
            textView.text = textDefault
        }

        button.setOnClickListener {
            if(editText.text.isNotEmpty()){
                textView.text = resMenssage()
            }else{
                textView.text = textDefault
            }
            editText.text = null
        }
    }
}
