package com.example.day13_data_passing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val ordersOfCustomer = intent.getStringExtra(MainActivity.KEY)

        val tVOrder = findViewById<TextView>(R.id.tVOrder)
        tVOrder.text ="Order Placed : " + ordersOfCustomer.toString()
    }
}