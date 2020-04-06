package com.example.animation

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_animator_listener_adapter_example.*

class AnimatorListenerAdapterExample : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animator_listener_adapter_example)


        btn_animator_listener.setOnClickListener {

            setAnimation()
        }

        button.setOnClickListener {

            val intent = Intent(this,TypeEvaluatorExample::class.java)
            startActivity(intent)
        }
    }

    private fun setAnimation() {

        ObjectAnimator.ofFloat(superman,"rotationY",-200f).apply{

            duration = 3000
            start()
            addListener(object: AnimatorListenerAdapter(){

                override fun onAnimationEnd(animation: Animator?) {
                    super.onAnimationEnd(animation)
                    text_message.text = "Its superman"
                }
            })
        }
    }
}
