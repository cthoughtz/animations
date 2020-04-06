package com.example.animation

import android.animation.*
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class ValueAnimatorExample : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Value Animator Increases The value of a number - which is can be used for smooth transitions

        btnStart.setOnClickListener {

            startAnimation()
        }



        btnNextActivity.setOnClickListener {

            val intent = Intent(this, ObjectAnimatorExample::class.java)
            startActivity(intent)
        }


    }


    fun startAnimation(){
        ValueAnimator.ofFloat(100f, -200f).apply {

            addUpdateListener(object : ValueAnimator.AnimatorUpdateListener {
                override fun onAnimationUpdate(animation: ValueAnimator?) {

                    val move = animation?.animatedValue as Float
                    kirby_iv.translationY = move
                    animator_text_value.setText("Value: $move")
                }

            })

            duration = 3000
            start()
        }
    }
}
