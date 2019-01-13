
class TaskInteractor {

    fun add(title: String, note: String) {
        mRealm.executeTransaction {
            var task = mRealm.createObject(Task::class.java , UUID.randomUUID().toString())
            task.title = title
            task.note = note
            mRealm.copyToRealm(book)
        }
    }

    fun update() { /// update Task or add new Task
    }

    fun delete() {
    }

    fun all() : Array<Task> {

    }
}