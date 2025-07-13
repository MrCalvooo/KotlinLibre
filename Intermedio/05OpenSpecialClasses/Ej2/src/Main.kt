sealed class TaskStatus {
    data class Pending(val assignedTo: String) : TaskStatus()
    data class InProgress(val progress: Int) : TaskStatus()
    data class Completed(val completedBy: String) : TaskStatus()
    data class Cancelled(val reason: String) : TaskStatus()
}

@JvmInline
value class TaskId(val id: Int)

enum class Priority {
    LOW, MEDIUM, HIGH
}

data class Task(val id: TaskId, val title: String, val status: TaskStatus, val priority: Priority)

fun printTaskInfo(task: Task) {
    with(task) {
        when (val currentStatus = status) {
            is TaskStatus.Pending -> println("Task ${task.id.id} is pending, assigned to ${currentStatus.assignedTo} with a ${task.priority} priority")
            is TaskStatus.InProgress -> println("Task ${task.id.id} is in progress with ${currentStatus.progress}% completed with a ${task.priority} priority")
            is TaskStatus.Completed -> println("Task ${task.id.id} is completed by ${currentStatus.completedBy} with a ${task.priority} priority")
            is TaskStatus.Cancelled -> println("Task ${task.id.id} is cancelled due to: ${currentStatus.reason} with a ${task.priority} priority")
        }
    }
}

fun TaskId.validateId(): Boolean {
    var valido = true
    if (id <= 0) {
        valido = false
    }
    if (id > 0) {
        valido = true
    }

    return valido
}

fun main() {
    val task1 = Task(
        TaskId(1), "Implement new feature", TaskStatus.Pending("Alice"), Priority.HIGH
    )

    val task2 = Task(
        TaskId(2), "Fix bugs", TaskStatus.InProgress(50), Priority.MEDIUM
    )

    val task3 = Task(
        TaskId(3), "Review code", TaskStatus.Completed("Bob"), Priority.LOW
    )

    val task4 = Task(
        TaskId(-4), "Update documentation", TaskStatus.Cancelled("Not needed anymore"), Priority.LOW
    )

    if (task1.id.validateId()) {
        printTaskInfo(task1)
    } else {
        println("Task ID ${task1.id.id} is invalid.")
    }

    if (task2.id.validateId()) {
        printTaskInfo(task2)
    } else {
        println("Task ID ${task2.id.id} is invalid.")
    }

    if (task3.id.validateId()) {
        printTaskInfo(task3)
    } else {
        println("Task ID ${task3.id.id} is invalid.")
    }

    if (task4.id.validateId()) {
        printTaskInfo(task4)
    } else {
        println("Task ID ${task4.id.id} is invalid.")
    }
}