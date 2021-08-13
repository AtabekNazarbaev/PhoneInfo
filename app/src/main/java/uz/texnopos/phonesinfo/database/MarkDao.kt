package uz.texnopos.phonesinfo.database

import androidx.room.Dao
import androidx.room.Query

@Dao
interface MarkDao {

    @Query("Select * From phoneMarks")
    fun getAllFromMarks():List<Mark>
}