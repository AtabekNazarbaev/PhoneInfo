package uz.texnopos.phonesinfo.database

import androidx.room.Dao
import androidx.room.Query

@Dao
interface MyDao {
    @Query("SELECT * FROM phones ")
    fun getAllPhones():List<Model>

    @Query("Select * FROM phones Where markId=:id")
    fun getSortPhones(id: Int): List<Model>
}