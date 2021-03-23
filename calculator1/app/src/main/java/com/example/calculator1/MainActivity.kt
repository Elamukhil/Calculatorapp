package com.example.calculator1
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


public class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        val view2: RelativeLayout = findViewById(R.id.layout1)
        view2.setVisibility(View.INVISIBLE)
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button1 -> {
                val message = button1.text.toString()
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("message_key", message)
                startActivityForResult(intent, 2)
            }
            R.id.button2 -> {
                val message = button2.text.toString()
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("message_key", message)
                startActivityForResult(intent, 2)
            }
            R.id.button3 -> {
                val message = button3.text.toString()
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("message_key", message)
                startActivityForResult(intent, 2)
            }
            R.id.button4 -> {
                val message = button4.text.toString()
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("message_key", message)
                startActivityForResult(intent,2)
            }
        }


    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val messageReturned = data?.getStringExtra("message_return")
        val value1 = data?.getStringExtra("value1")
        val value2 = data?.getStringExtra("value2")
        val operation = data?.getStringExtra("operation")

        val view2: RelativeLayout = findViewById(R.id.layout1)
        view2.setVisibility(View.VISIBLE)
        val view: RelativeLayout = findViewById(R.id.layout)
        view.setVisibility(View.INVISIBLE)
        val view1: TextView = findViewById(R.id.result)
        view1.setText("Your result is $messageReturned for inputs $value1 and $value2 with $operation" )
        reset.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivityForResult(intent, 0)
            finish()
        }

    }

}
