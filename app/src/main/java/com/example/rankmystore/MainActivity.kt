package com.example.rankmystore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    /*
    fun processLogin(user_name:String, password:String){
        val intent = Intent(this, SuccessLogin::class.java)
        intent.putExtra("user", user_name)
        intent.putExtra("pass",password)
        Toast.makeText(applicationContext, "Logging you in...!",Toast.LENGTH_SHORT).show()
        startActivity(intent)
    }

     */
    /*

    var uName = etUName.text.toString()
        var uPwd = etUPass.text.toString()
        var pwd = uName + "@123"
     */
    fun checkLogin(view: View){
       // var uName =
    }
}


