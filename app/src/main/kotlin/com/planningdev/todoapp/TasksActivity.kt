package com.planningdev.todoapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View

class TasksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasks)
    }

    fun segueToNew(view: View) {
        // Create an Intent to start the second activity
        val newTaskIntent = Intent(this, newTask::class.java)

        // Start the new activity.
        startActivity(newTaskIntent)
    }
}
