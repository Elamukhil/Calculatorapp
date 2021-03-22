package com.example.calculator1
import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity


public class MainActivity2 : AppCompatActivity() {
    lateinit var passButton: Button
    lateinit var editText: EditText
    lateinit var editText1: EditText
    lateinit var string: String
    lateinit var string1: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent = intent
        val str = intent.getStringExtra("message_key")
        passButton = findViewById(R.id.submit)
        passButton.setText(str)

        passButton.setOnClickListener {
            when (str)
            {
                "ADD"-> {
                    val intentWithResult = Intent()
                    editText = findViewById(R.id.input1)
                    editText1 = findViewById(R.id.input2)
                    string = editText.text.toString()
                    string1 = editText1.text.toString()
                    val int1: Int? = string.toInt()
                    val int2: Int? = string1.toInt()
                    val int3 = int1?.plus(int2!!)
                    val output : String = int3.toString()
                    intentWithResult.putExtra(
                            "message_return",
                            output
                    )
                    intentWithResult.putExtra(
                            "value1",
                            string
                    )
                    intentWithResult.putExtra(
                            "value2",
                            string1
                    )
                    intentWithResult.putExtra(
                            "operation",
                            str
                    )

                    setResult(1, intentWithResult)
                    finish()
                }
                "SUB"-> {
                    val intentWithResult = Intent()
                    editText = findViewById(R.id.input1)
                    editText1 = findViewById(R.id.input2)
                    string = editText.text.toString()
                    string1 = editText1.text.toString()
                    val int1: Int? = string.toInt()
                    val int2: Int? = string1.toInt()
                    val int3 = int1?.minus(int2!!)
                    val output: String = int3.toString()
                    intentWithResult.putExtra(
                            "message_return",
                            output
                    )
                    intentWithResult.putExtra(
                            "value1",
                            string
                    )
                    intentWithResult.putExtra(
                            "value2",
                            string1
                    )
                    intentWithResult.putExtra(
                            "operation",
                            str
                    )
                    setResult(1, intentWithResult)
                    finish()
                }
                "MUL"-> {
                    val intentWithResult = Intent()
                    editText = findViewById(R.id.input1)
                    editText1 = findViewById(R.id.input2)
                    string = editText.text.toString()
                    string1 = editText1.text.toString()
                    val int1: Int? = string.toInt()
                    val int2: Int? = string1.toInt()
                    val int3 = int1?.times(int2!!)
                    val output: String = int3.toString()
                    intentWithResult.putExtra(
                            "message_return",
                            output
                    )
                    intentWithResult.putExtra(
                            "value1",
                            string
                    )
                    intentWithResult.putExtra(
                            "value2",
                            string1
                    )
                    intentWithResult.putExtra(
                            "operation",
                            str
                    )
                    setResult(1, intentWithResult)
                    finish()
                }
                "DIV"-> {
                    val intentWithResult = Intent()
                    editText = findViewById(R.id.input1)
                    editText1 = findViewById(R.id.input2)
                    string = editText.text.toString()
                    string1 = editText1.text.toString()
                    val int1: Int? = string.toInt()
                    val int2: Int? = string1.toInt()
                    val int3 = int1?.div(int2!!)
                    val output: String = int3.toString()
                    intentWithResult.putExtra(
                            "message_return",
                            output
                    )
                    intentWithResult.putExtra(
                            "value1",
                            string
                    )
                    intentWithResult.putExtra(
                            "value2",
                            string1
                    )
                    intentWithResult.putExtra(
                            "operation",
                            str
                    )
                    setResult(1, intentWithResult)
                    finish()
                }
            }
        }

    }

}