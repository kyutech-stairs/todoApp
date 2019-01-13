package com.planningdev.todoapp.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required
import java.util.UUID
import java.util.Date

open class Task: RealmObject() {
    @PrimaryKey open var id: String = UUID.randomUUID().toString()
    @Required open var title: String = ""
    @Required open var note: String = ""
    @Required open var createdAt: Date = Date()
}