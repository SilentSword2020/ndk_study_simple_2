package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.jni.NativeLib
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        sample_text.text = NativeLib.stringFromJNI()
    }


}
