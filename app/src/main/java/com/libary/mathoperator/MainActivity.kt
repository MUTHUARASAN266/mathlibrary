package com.libary.mathoperator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.libary.mathlibrary.ArithmeticalOperation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val math=ArithmeticalOperation.add(1,2)
        Log.e("value",math.toString())
    }
}