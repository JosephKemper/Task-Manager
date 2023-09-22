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
    println("4. Exit Program")
    println()
    print("Enter the number of the option you wish to perform: ")
    userInput = readln()

    when (userInput){
        "1" -> addTask()
        "2" -> deleteTask()
        "3" -> listTask()
        "4" -> println("Come back soon!")
        else  -> println("Please choose a valid option.")
    }

    if (userInput != "4"){
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
    val convertToIndex = userInput.toInt()-1
    val removedTask = taskList[convertToIndex]
    println("Okay we'll remove $removedTask from your task list.")
    taskList.removeAt(convertToIndex)

}

fun listTask(){
    var taskNumber = 1
    println("Here are your current tasks:")
    for (task in taskList){
        println("$taskNumber . $task")
        taskNumber +=1
    }

}