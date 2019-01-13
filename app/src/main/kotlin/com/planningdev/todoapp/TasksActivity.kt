package com.planningdev.todoapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class TasksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasks)

        val button: Button = findViewById(R.id.button)
        // Intent作成
        val intent: Intent = Intent(this, newTask::class.java)
        // Button（IDがbutton）をタップされた際の処理
        button.setOnClickListener {
            startActivity(intent)
        }
    }
}
