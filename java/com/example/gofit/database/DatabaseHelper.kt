package com.example.gofit.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context): SQLiteOpenHelper(context,
    DATABASE_NAME,null,6){
    override fun onUpgrade(db: SQLiteDatabase?, oldversion: Int, newversion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME)
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table $TABLE_NAME(ID INTEGER PRIMARY KEY AUTOINCREMENT,"
            +"email TEXT,password TEXT)")
    }

    fun insertData(email:String,password:String){
        val db=this.writableDatabase
        val contentValues=ContentValues()
        contentValues.put(COL_2,email)
        contentValues.put(COL_3,password)
        db.insert(TABLE_NAME,null,contentValues)
    }

    val allData:Cursor
    get() {
        val db=this.writableDatabase
        val res=db.rawQuery("select * from "+ TABLE_NAME,null)
        return res
    }
    fun updateData(id:String,email:String,password:String):Boolean{
        val db=this.writableDatabase
        val contentValues=ContentValues()
        contentValues.put(COL_1,id)
        contentValues.put(COL_2,email)
        contentValues.put(COL_3,password)
        db.update(TABLE_NAME,contentValues,"ID=?", arrayOf(id))
        return true
    }

    fun deleteData(id: String):Int{
        val db=this.writableDatabase
        return db.delete(TABLE_NAME,"ID=?", arrayOf(id))
    }

    companion object{
        val DATABASE_NAME = "user"
        val TABLE_NAME = "user_table"
        val COL_1 = "ID"
        val COL_2 = "email"
        val COL_3 = "password"

    }
}