package com.example.shreepref

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val localStoreage=getSharedPreferences("user", Context.MODE_PRIVATE)

        val getname=localStoreage.getString("Username","Not found")
        val getemail=localStoreage.getString("Email","Not found")

        val name1=findViewById<TextView>(R.id.name1)
        val email1=findViewById<TextView>(R.id.email1)

        name1.text=getname

        email1.text=getemail

        Toast.makeText(this,"$getname", Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"$getemail", Toast.LENGTH_SHORT).show()




    }
}