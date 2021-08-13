package uz.texnopos.phonesinfo.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "phoneMarks")
data class Mark(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val markName: String
)
