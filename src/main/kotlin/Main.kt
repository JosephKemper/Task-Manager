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

}