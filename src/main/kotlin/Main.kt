import java.io.File
import java.io.IOException

val taskList = mutableListOf<String>()
lateinit var userInput: String
fun main() {
    println("Welcome to our task manager program!")
    println("What can we help you with today?")
    menu()
}

fun menu(){
    println("")
    println("1. Add Task")
    println("2. Delete Task")
    println("3. List Task")
    println("4. Save Tasks to File")
    println("5. Load from File")
    println("5. Exit Program")
    println()
    print("Enter the number of the option you wish to perform: ")
    userInput = readln()

    when (userInput){
        "1" -> addTask()
        "2" -> deleteTask()
        "3" -> listTask()
        "4" -> saveTasks()
        "5" -> loadTasks()
        "6" -> println("Come back soon!")
        else  -> println("Please choose a valid option.")
    }

    if (userInput != "6"){
        menu()
    }
}

fun addTask(){
    println()
    print("What task did you want to add? ")
    userInput = readln()
    taskList.add(userInput)
    println("Okay we added $userInput to your task list.")
}

fun deleteTask(){
    print("Which task number did you want to delete? ")
    userInput = readln()
    val checkInput =userInput.toIntOrNull()
    if (checkInput != null && checkInput >= 1 && checkInput <= taskList.size){
        val taskIndex = checkInput -1
        val removedTask = taskList[taskIndex]
        println("Okay we'll remove $removedTask from your task list.")
        taskList.removeAt(taskIndex)
    } else {
        println("We're sorry, that was not a valid selection.")
        print("Please try again entering the number of the task you want to remove")
        deleteTask()
    }


}

fun listTask(){
    var taskNumber = 1
    println("Here are your current tasks:")
    for (task in taskList){
        println("$taskNumber . $task")
        taskNumber +=1
    }
}

fun saveTasks(){
    print("What is the name of the file you want to save your tasks to? ")
    userInput = readln()
}

fun loadTasks(){
    println("What is the name of the file you want to load your tasks from? ")
    userInput = readln()

}