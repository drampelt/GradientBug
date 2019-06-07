package com.github.drampelt.gradientbug

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.content).background =
            GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, intArrayOf(Color.RED, Color.GREEN, Color.BLUE))
    }
}
