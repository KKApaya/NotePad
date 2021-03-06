package com.example.notes.repository

import androidx.lifecycle.LiveData
import com.example.notes.model.Note
import javax.inject.Singleton

@Singleton
interface NoteRepository{

    suspend fun insertNote(note: Note)

    suspend fun updateNote(note: Note)

    suspend fun delete(note: Note)

    fun getNoteById(noteId:String):LiveData<Note>

    fun getAllNotes(): LiveData<List<Note>>
}