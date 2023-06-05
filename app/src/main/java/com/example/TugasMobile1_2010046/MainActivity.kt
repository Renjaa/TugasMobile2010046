package com.example.TugasMobile1_2010046

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.TugasMobile1_2010046.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.profilePhoto.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
            Toast.makeText(this, "Selamat Datang Di Menu Provile",Toast.LENGTH_LONG).show()
        }
        binding.btnMovie.setOnClickListener {
            Toast.makeText(this, "Ini Menu Movie", Toast.LENGTH_LONG).show()
        }

    }

}