package com.planningdev.todoapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.realm.Realm
import io.realm.kotlin.createObject
import java.util.*


class newTask : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_task)

        Realm.init(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        var mRealm = Realm.getDefaultInstance()
        mRealm.close()
    }

    fun new() {
//        var mRealm = Realm.getDefaultInstance()
//        mRealm.executeTransaction {
//            var task = mRealm.createObject(Task::class.java, UUID.randomUUID().toString())
//            task.title = title
//            task.note = note
//            mRealm.copyToRealm(task)
//        }
    }
}
