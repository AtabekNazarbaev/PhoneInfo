package uz.texnopos.phonesinfo.database

import androidx.room.Query

interface ChDao {

    @Query("Select * FROM characterisics Where phoneId=:id")
    fun getCharachteristics(id: Int): List<Characteristics>
}