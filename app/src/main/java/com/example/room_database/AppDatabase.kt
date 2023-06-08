package com.example.room_database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [NoteModel::class], version = 4)
abstract class AppDatabase:RoomDatabase() {
    abstract fun noteDao():NoteDao

    companion object{
        var INSTANCE : AppDatabase?=null

        fun initDatabase (context: Context):AppDatabase{
            val instance = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "Nothingss"
            ).fallbackToDestructiveMigration().build()
           // INSTANCE=instance
            return instance
        }
    }
}