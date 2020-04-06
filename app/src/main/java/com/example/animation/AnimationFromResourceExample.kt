package com.example.animation

import android.animation.AnimatorInflater
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_animation_from_resource_example.*

class AnimationFromResourceExample : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_from_resource_example)

        btn_start_flight.setOnClickListener {

            AnimatorInflater.loadAnimator(this, R.animator.animation_one).apply {
                setTarget(bee_flying)
                start()
            }
        }


        next_activity_animation_resource.setOnClickListener {

            val intent = Intent(this, AnimatorListenerAdapterExample::class.java)
            startActivity(intent)
        }
    }
}
