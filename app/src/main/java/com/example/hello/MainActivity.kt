package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gotosub1.setOnClickListener {
            val intent1= Intent(this, Sub1Activity::class.java)
            var mytext = et_hello.text.toString()
            //et_hello를 불러온 후, String값을 받아온다는 뜻임.
            //var은 string이 바뀌니까 var로 받아줌.
            intent1.putExtra("text", mytext)


            startActivity(intent1)

        }

    }


}
