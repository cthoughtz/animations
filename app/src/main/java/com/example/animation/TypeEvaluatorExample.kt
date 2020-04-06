package com.example.animation

import android.animation.*
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Property
import android.view.View
import kotlinx.android.synthetic.main.activity_object_animator_example.*
import kotlinx.android.synthetic.main.activity_type_converter_example.*

class TypeEvaluatorExample : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type_converter_example)


        sa_button.setOnClickListener {

            startAnimation()
        }

        btn_na.setOnClickListener {

        }

    }

    fun startAnimation(){


        ObjectAnimator.ofObject(screen_background,"backgroundColor",  object: ArgbEvaluator(){}, Color.BLUE, Color.GREEN).apply {

            duration = 3000
            start()
        }

    }
}
