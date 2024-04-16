package br.com.danilo.alves.notesroomdata.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Upsert  //Insert or Update
    suspend fun upsertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Query("SELECT * FROM note ORDER BY createdAt")
    fun getNotesOrdedByCreatedAt(): Flow<List<Note>>

    @Query("SELECT * FROM note ORDER BY title")
    fun getNotesOrdedByTitle(): Flow<List<Note>>

}