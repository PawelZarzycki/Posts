package com.karntrehan.posts.list.data.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = [(Post::class)], version = 1)
abstract class PostDb : RoomDatabase() {
    abstract fun postDao(): PostDao
}