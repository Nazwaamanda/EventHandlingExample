package com.nazwa.eventhandlerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nazwa.eventhandlerexample.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
// Correct import for the generated binding class

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ensure the button is correctly referenced and set up a click listener
        binding.btnDisplayMessage.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Hello World",
                Toast.LENGTH_LONG
            ).show()
        }

        binding.btnDisplayMessage.setOnLongClickListener {
            true
        }
        binding.btnDisplayMessage.setOnLongClickListener {
            Snackbar.make(binding.rootLayout, "Long Click",
                Snackbar.LENGTH_LONG).show()
            true
        }
    }
}
