package com.example.room_database

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.room_database.databinding.ActivitySecondBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SecondActivity : AppCompatActivity() {
    private lateinit var binding :ActivitySecondBinding
    private lateinit var mydb : AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mydb=AppDatabase.initDatabase(this)
        binding.saveN.setOnClickListener {
            val title = binding.titleET.text.toString()
            val description = binding.descET.text.toString()
            val note = NoteModel(null,title,description)

            GlobalScope.launch {
                mydb.noteDao().insert(note)
            }
            Toast.makeText(this,"Note added successfully",Toast.LENGTH_LONG).show()
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}