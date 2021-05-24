package com.mukesh.nconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_answer_page.*

class AnswerPage : AppCompatActivity() {
    companion object{
        const val num="num"
        const val ans1st="ans1st"
        const val ans2nd="ans2nd"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_page)
        val theNum=intent.getStringExtra(num)
        val decMAns=intent.getStringExtra(ans1st)
        val baseMAns=intent.getStringExtra(ans2nd)

        textView10.text=theNum
        textView11.text=decMAns
        textView12.text=baseMAns

    }
}