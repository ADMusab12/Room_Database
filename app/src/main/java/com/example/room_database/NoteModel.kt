package com.example.room_database
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notetable")
class NoteModel (
        @PrimaryKey(autoGenerate = true)val id:Int?,
        val title:String?,
       val description:String?,
        )
