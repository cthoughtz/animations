package com.example.animation

import android.animation.*
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_bi_directional_type_converter_example.*

class BiDirectionalTypeConverterExample() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bi_directional_type_converter_example)

        bi_button_start_animation.setOnClickListener {

            ObjectAnimator.ofObject(bi_button_start_animation, "backgroundColor",
                @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
                object: FloatArrayEvaluator(){} ,1f, 15f)
        }
    }
}
