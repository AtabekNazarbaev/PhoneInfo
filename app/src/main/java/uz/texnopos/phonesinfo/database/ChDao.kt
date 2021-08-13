package uz.texnopos.phonesinfo.database

import androidx.room.Dao
import androidx.room.Query

@Dao
interface ChDao {
    @Query("Select * From characterisics")
    fun getAllFromCharacteristics(): List<Characteristics>

    @Query("Select * FROM characterisics Where phoneId=:id")
    fun getChar(id: Int): List<Characteristics>
}