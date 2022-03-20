package com.example.customtoastexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.toast)
        button.setOnClickListener { showToast() }
    }

    private fun showToast() {
        //inflate를 해서 그걸로 inflate를 하는데 인자로 해당 xml화일과 루트 id를 넣어준다.
        //이렇게 하면 custom layout을 사용할 수 있는거가?
        val inflater : LayoutInflater = layoutInflater
        val layout : View = inflater.inflate(R.layout.toast_layout, findViewById<ViewGroup>(R.id.toast_root))
        var toast : Toast = Toast(baseContext)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.duration = Toast.LENGTH_LONG
        toast.view = layout
        toast.show()

    }
}