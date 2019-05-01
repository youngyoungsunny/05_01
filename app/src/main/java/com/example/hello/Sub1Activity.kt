package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sub1.*

class Sub1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub1)


        //bt_close를 눌러줬을 때 어케 해주냐를 정한다.
        bt_close.setOnClickListener {

            //finish()//activity를 아예 전체 종료. sub가 아예 종료됨.

            //버튼을 눌렀을 때 main Activitiy로 가게끔, ***sub는 background에 있음.
            val intent_main = Intent(applicationContext,MainActivity::class.java)

            startActivity(intent_main)
        }

        Toast.makeText(applicationContext,intent.getStringExtra("text"),Toast.LENGTH_LONG).show()
    }
}
