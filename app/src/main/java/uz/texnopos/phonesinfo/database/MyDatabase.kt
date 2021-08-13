package uz.texnopos.phonesinfo.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Model::class,Characteristics::class,Mark::class], version = 1)
abstract class MyDatabase : RoomDatabase() {
    companion object {
        private lateinit var INSTANCE: MyDatabase
        fun getInstance(context: Context): MyDatabase {
            if (!::INSTANCE.isInitialized) {
                INSTANCE =
                    Room.databaseBuilder(context, MyDatabase::class.java, "phones-database")
                        .allowMainThreadQueries()
                        .createFromAsset("Phones.db")
                        .build()
            }
            return INSTANCE
        }
    }
abstract fun phonesDao():MyDao
}