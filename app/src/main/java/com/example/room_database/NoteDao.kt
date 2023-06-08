package com.example.room_database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {
    @Insert
    fun insert (noteModel: NoteModel)
    @Query("SELECT * FROM notetable")
    fun getAllNotes():List<NoteModel>
}