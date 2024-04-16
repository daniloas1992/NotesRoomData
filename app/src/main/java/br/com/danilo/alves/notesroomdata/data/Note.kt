package br.com.danilo.alves.notesroomdata.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    val title: String,
    val description: String,
    val createdAt: Long,

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
