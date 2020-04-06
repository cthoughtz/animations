package com.example.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_animation_set_example.*

class AnimationSetExample : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_set_example)

        aimation_set_button.setOnClickListener {

            startAnimation()
        }

        nextActivityAnimateSet.setOnClickListener {

            val intent = Intent(this, AnimationFromResourceExample::class.java)
            startActivity(intent)
        }

    }

    private fun startAnimation() {

        val blueBallMoveUp = ObjectAnimator.ofFloat(blue_image_view,"translationY", -150f).apply{

            duration = 4000
        }

        val greenBallMoveUp = ObjectAnimator.ofFloat(green_image_view, "translationY", -150f).apply {

            duration = 1000
        }

        val redBallMove = ObjectAnimator.ofFloat(red_image_view, "translationY", -150f).apply {

            duration = 9000
        }

        AnimatorSet().apply {

            play(blueBallMoveUp).with(greenBallMoveUp).with(redBallMove)
            start()
        }
    }
}
