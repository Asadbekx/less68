package com.asadbek.less68.data.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class StudentDbOpenHelper(context: Context) : SQLiteOpenHelper(context, "student.db", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        if (db == null) return
        val sqLite =
            ("CREATE TABLE  " +
                    "$STUDENT_TABLE(" + "" +
                    "$ID_COLUMN INTEGER PRIMARY KEY AUTOINCREMENT," + "" +
                    "$NAME_COLUMN TEXT NOT NULL, " + "" +
                    "$AGE_COLUMN INTEGER NOT NULL DEFAULT 18, " + "" +
                    "$COURSE_COLUMN INTEGER NOT NULL DEFAULT 1)").trimIndent()
        db.execSQL(sqLite)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
    }

    companion object {
        const val STUDENT_TABLE = "STUDENT"
        const val ID_COLUMN = "ID"
        const val NAME_COLUMN = "NAME"
        const val AGE_COLUMN = "AGE"
        const val COURSE_COLUMN = "COURSE"
    }

}