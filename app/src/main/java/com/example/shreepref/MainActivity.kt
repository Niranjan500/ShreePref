package com.example.shreepref

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val name=findViewById<EditText>(R.id.name)
        val email=findViewById<EditText>(R.id.Email)

        val save=findViewById<Button>(R.id.save)
        val show=findViewById<Button>(R.id.show)

        val localStoreage=getSharedPreferences("user",Context.MODE_PRIVATE)

        save.setOnClickListener {
            val editpref=localStoreage.edit()

            editpref.putString("Username",""+name.text.toString())
            editpref.putString("Email",""+email.text.toString()).apply()
        }

        show.setOnClickListener {
//                val getname=localStoreage.getString("Username","Not found")
//                val getemail=localStoreage.getString("Email","Not found")
//
//                Toast.makeText(this,"$getname",Toast.LENGTH_SHORT)
//                Toast.makeText(this,"$getemail",Toast.LENGTH_SHORT)

            val intent=Intent(this,HomeActivity::class.java)

            startActivity(intent)
        }


    }
}