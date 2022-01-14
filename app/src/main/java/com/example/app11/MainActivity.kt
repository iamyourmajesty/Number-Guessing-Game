package com.example.app11

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       /* val rot=findViewById(R.id.andro) as ConstraintLayout
        val btn=findViewById(R.id.button) as Button
        val root=findViewById(R.id.cook) as FrameLayout
        btn.setOnClickListener{
            //ch.setBackgroundColor(color.W)
            root.setBackgroundColor(Color.GREEN)
        }
*/
        val btnLeft=findViewById(R.id.btnLeft) as Button
        val btnRight=findViewById(R.id.btnRight) as Button
        val lol=findViewById(R.id.button3) as Button
        btnLeft.setOnClickListener{
            val leftNum :Int =btnLeft.text.toString().toInt()
            val rightNum :Int=btnRight.text.toString().toInt()
            if(leftNum>=rightNum)
            {
                lol.setBackgroundColor(Color.GREEN)
                lol.text="correct"


            }
            else
            {
                lol.setBackgroundColor(Color.RED)
                lol.text="wrong"
            }
            assignNumbersToButton()
        }
        btnRight.setOnClickListener{
            val leftNum :Int =btnLeft.text.toString().toInt()
            val rightNum :Int=btnRight.text.toString().toInt()
            if(leftNum<=rightNum)
            {
                lol.setBackgroundColor(Color.GREEN)
                lol.text="correct"

            }
            else
            {
                lol.setBackgroundColor(Color.RED)
                lol.text="wrong"
            }
            assignNumbersToButton()
        }


    }
    private fun assignNumbersToButton() {
        val btnLeft=findViewById(R.id.btnLeft) as Button
        val btnRight=findViewById(R.id.btnRight) as Button
        val r= Random()
        val leftNum:Int=r.nextInt(10)
        val rightNum:Int=r.nextInt(10)
        btnLeft.text=leftNum.toString()
        btnRight.text=rightNum.toString()

    }
}