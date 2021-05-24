//import kotlinx.android.synthetic.main.activity_main.*

package com.mukesh.nconverter


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun change(view: View) {
        val num =theString.editableText.toString()
        val fromBase=theNumber4.editableText.toString()
        val resBase=theNumber5.editableText.toString()
        val dot = base_converter()
        val ans1st =dot.ranToBase10(num,fromBase)
        val ans2nd =dot.decToBase(ans1st,resBase)
        Toast.makeText(this, "You have entered $num as value ", Toast.LENGTH_LONG).show()
        val intent=Intent(this,AnswerPage::class.java)
        intent.putExtra(AnswerPage.num,num)
        intent.putExtra(AnswerPage.ans1st,ans1st)
        intent.putExtra(AnswerPage.ans2nd,ans2nd)
        startActivity(intent)

    }
}
