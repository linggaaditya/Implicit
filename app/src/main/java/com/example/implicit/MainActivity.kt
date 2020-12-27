package com.example.implicit

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_implicit_whatsapp.setOnClickListener() {
            val sendWhatsapp = Intent()
            sendWhatsapp.action = Intent.ACTION_SEND
            sendWhatsapp.putExtra(Intent.EXTRA_TEXT, "Permisi Perkenalkan Nama Saya")
            sendWhatsapp.type = "text/plain"
            sendWhatsapp.setPackage("com.whatsapp")
            startActivity(sendWhatsapp)
        }

    }

}

