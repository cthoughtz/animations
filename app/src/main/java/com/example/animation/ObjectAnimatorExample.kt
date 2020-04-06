package com.example.animation

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_object_animator_example.*

class ObjectAnimatorExample : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_animator_example)


        start_animation_object_animator.setOnClickListener {

            startObjectAnimation()
        }


        btnNextActivityObjectAnimator.setOnClickListener {

            val intent = Intent(this, ObjectAnimatorRotationExample::class.java)
            startActivity(intent)
        }
    }

    private fun startObjectAnimation() {

        ObjectAnimator.ofFloat(kirby_iv_object,"translationY",-200f).apply {

            duration = 3000
            start()
        }
    }
}
