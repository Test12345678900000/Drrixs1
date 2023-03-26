package com.example.drrixs

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val packageName = "com.byril.tictactoe2" // замените на нужный пакет приложения
            val intent = packageManager.getLaunchIntentForPackage(packageName)
            if (intent != null) {
                startActivity(intent)
                Toast.makeText(this, "Приложение запушено!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Приложение не было найдено", Toast.LENGTH_SHORT).show()
                val url = "https://play.google.com/store/apps/details?id=com.byril.tictactoe2"
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        }

        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val intent = Intent(this, NewWindowActivity::class.java)
            startActivity(intent)


        }


        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val packageName = "com.mojang.minecraftpe" // замените на нужный пакет приложения
            val intent = packageManager.getLaunchIntentForPackage(packageName)
            if (intent != null) {
                startActivity(intent)
                Toast.makeText(this, "Приложение запушено!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Приложение не было найдено", Toast.LENGTH_SHORT).show()
                val url = "https://play.google.com/store/apps/details?id=com.mojang.minecraftpe&hl=en&gl=US"
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }

        }

        fun toastMe(view: View) {
            val myToast = Toast.makeText(this, "В разработке...", Toast.LENGTH_SHORT)

            myToast.show()
        }


        fun onTestButtonClick(view: View) {
            val packageName = "com.supercell.brawlstars" // замените на нужный пакет приложения
            val intent = packageManager.getLaunchIntentForPackage(packageName)
            if (intent != null) {
                startActivity(intent)
                Toast.makeText(this, "Приложение запушено!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Приложение не было найдено", Toast.LENGTH_SHORT).show()
                val url = "https://play.google.com/store/apps/details?id=com.supercell.brawlstars"
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)

                // Приложение не было найдено
            }
        }
    }

    fun onTestButtonClick(view: View) {
        val packageName = "com.supercell.brawlstars" // замените на нужный пакет приложения
        val intent = packageManager.getLaunchIntentForPackage(packageName)
        if (intent != null) {
            startActivity(intent)
            Toast.makeText(this, "Приложение запушено!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Приложение не было найдено", Toast.LENGTH_SHORT).show()
            val url = "https://play.google.com/store/apps/details?id=com.supercell.brawlstars"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)

            // Приложение не было найдено
        }
    }
}

