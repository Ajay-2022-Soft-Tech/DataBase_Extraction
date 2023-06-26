package com.example.day13_data_passing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

//    Creating Key
    companion object{
        const val KEY = "com.example.day13_data_passing.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val editText3 = findViewById<EditText>(R.id.editText3)
        val editText4 = findViewById<EditText>(R.id.editText4)

        btnOrder.setOnClickListener {
            val ordersPlaced = "\n"+editText1.text.toString() + "\t\n" + editText2.text.toString()+"\t\n"+
                    editText3.text.toString()+ "\t\n" +editText4.text.toString()


            intent = Intent(this,Order::class.java)
            intent.putExtra(KEY,ordersPlaced)
            startActivity(intent)
            
        }

    }
}