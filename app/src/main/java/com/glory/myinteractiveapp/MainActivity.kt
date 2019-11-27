package com.glory.myinteractiveapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.glory.myinteractiveapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        next.setOnClickListener {
            val nextIntent = Intent(this, SecondActivity::class.java)
                    startActivity(nextIntent)

        }

        tryAgain.setBackgroundColor(resources.getColor(R.color.colorPrimary))

    }




}
