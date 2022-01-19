package com.example.`notes CRUD App`.di

import android.app.Application
import androidx.room.Room
import com.example.`notes CRUD App`.data.TodoDatabase
import com.example.`notes CRUD App`.data.TodoRepository
import com.example.`notes CRUD App`.data.TodoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    //Creates database instantance
    @Provides
    @Singleton
    fun providesTodoDatabase(app: Application): TodoDatabase {
        return Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo_db"
        ).build()
    }

    //Creates repository instance needs database insatnce
    @Provides
    @Singleton
    fun providesTotoRepository(db: TodoDatabase): TodoRepository{
        return TodoRepositoryImpl(db.dao)
    }
//    Creates  repository given database instance

}