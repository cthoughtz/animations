package com.example.animation

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_object_animator_rotation_example.*

class ObjectAnimatorRotationExample : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_animator_rotation_example)

        btn_start_rotation.setOnClickListener {

            startAni()
        }

        rotation__next_activity.setOnClickListener {

            val intent = Intent(this,AnimationSetExample::class.java)
            startActivity(intent)
        }
    }

    private fun startAni() {

        ObjectAnimator.ofFloat(arrow, View.ROTATION, 0f,180f).apply {

            duration = 3000
            start()
        }
    }
}
