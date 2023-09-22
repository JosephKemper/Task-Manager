val taskList = mutableListOf<String>()
lateinit var userInput: String
fun main() {
    menu()
}

fun menu(){
    println("Welcome to our task manager program!")
    println("What can we help you with today?")
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
    println("Add task called")
}

fun deleteTask(){
    println("Delete task called")
}

fun listTask(){
    println("List Task Called")
}