// Import Libraries to allow file management for saving and loading files along with using dates
import java.io.File
import java.io.IOException
import java.time.LocalDate
import java.util.Date
import java.text.SimpleDateFormat
import java.time.ZoneId
import java.util.Locale
import java.time.temporal.ChronoUnit

//  Global variables for use later
val taskList = mutableListOf<TaskData>()// Store list of tasks
lateinit var userInput: String // Get input from user

// Define task data type
data class TaskData (
    val title: String,
    val description: String,
    val startDate: Date,
    val dueDate: Date
)

fun main() {
    // Program introduction
    println("Welcome to our task manager program!")
    println("What can we help you with today?")
    menu() // Call menu function
}

fun menu(){
    // Display menu options
    println()
    println("1. Add Task")
    println("2. Delete Task")
    println("3. List Task")
    println("4. Save Tasks to File")
    println("5. Load New Tasks (Note: This will overwrite any current tasks you have not saved)")
    println("6. Load Additional Tasks (Note: This will add the tasks being loaded to your current task list")
    println("7. Exit Program")
    println()
    print("Enter the number of the option you wish to perform: ")
    userInput = readln()

    // Call the function that runs the option the user selected
    when (userInput){
        "1" -> addTask()
        "2" -> deleteTask()
        "3" -> listTasks()
        "4" -> saveTasks()
        "5" -> loadNewTasks()
        "6" -> loadTasks()
        "7" -> println("Come back soon!")
        else  -> println("Please choose a valid option.")
    }

    // Uses recursion to call the menu function until the user chooses to exit
    if (userInput != "7"){
        menu()
    }
}

// Handles the adding of tasks input from the user through menu option 1
fun addTask(){
    println("To create a task, we will collect a short title, a description of what you are doing, and the date you want it completed by.")

    // Ask for title of task
    print("Please enter the title of your task: ")
    val taskTitle = readln()

    // Ask for description
    print("Please enter a description of what you are trying to achieve: ")
    val taskDescription = readln()

    // Collect start date from system
    val currentDate = Date()

    // Get target end date from user
    print("Please enter the target completion date for this task formatted as dd MMM yyyy (ex: 25 Jan 2024): ")
    val dateInput = readln()
    val format = SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH)
    val taskDueDate = format.parse(dateInput)

    // Create new instance of task class
    val newTask = TaskData(taskTitle, taskDescription, currentDate, taskDueDate)
    // Add new task to taskList
    taskList.add(newTask)
}

// Handles the removal of tasks from the list through menu option 2
fun deleteTask(){
    println() // Space for aesthetic purposes
    print("Which task number did you want to delete? ")
    userInput = readln() // Get task number from user
    // check if the value entered by the user can be converted to an integer
    val checkInput = userInput.toIntOrNull()
    // If userInput is an integer check if it is within a range that can be converted to an index for the task list
    if (checkInput != null && checkInput >= 1 && checkInput <= taskList.size){
        // Tasks will be listed starting at 1. By subtracting 1 from number it becomes the index of the task
        val taskIndex = checkInput -1
        val taskToRemove = taskList[taskIndex] // assign task to variable for use in confirmation to user
        println("Okay we'll remove $taskToRemove from your task list.") // Confirm to user what we are removing
        taskList.removeAt(taskIndex) // Remove selected task
    } else {
        // Let user know they have selected an invalid option
        println("We're sorry, that was not a valid selection.")
        println("You can view your current tasks through the list command.")
    }
}

// Handles the listing of tasks through menu option 3
fun listTasks(){
    var taskNumber = 1 // used for displaying the number of the task being printed
    println("Here are your current tasks:")
    // Iterates through taskList
    for (task in taskList){
        println("Task $taskNumber")
        println("Title: ${task.title}")
        println("Description: ${task.description}")
        println("Start Date: ${task.startDate}")
        println("Due Date: ${task.dueDate}")
        val currentDate = LocalDate.now()
        val dueDate = task.dueDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
        val daysRemaining = ChronoUnit.DAYS.between(currentDate, dueDate)
        println("Days Remaining Until Task is Due: $daysRemaining")
        taskNumber +=1 // Keeps track of current task number
    }
}

// Handles the saving of tasks to a file through menu option 4
fun saveTasks(){ /* BUG make sure saveTasks saves properly */
    print("What is the name of the file you want to save your tasks to? ")
    userInput = readln() // Gets the name of the file from the user
    // Error Checking for loading
    try {
        // Saves the provided tasks separated by a newline character to a file using the name provided by the user
        File(userInput).writeText(taskList.joinToString("\n"))
        println("Tasks have been saved to $userInput") // Confirms where the tasks were saved
    } catch (e: IOException) { // Catches any errors in the saving process
        println("Sorry, we could not save your tasks. Please try again.")
        e.printStackTrace()
        menu() // Return to menu if saving fails
    }
}

// Handles the loading of a new list of tasks through menu option 5
fun loadNewTasks (){
    taskList.clear() // Empties the taskList of any existing tasks
    listTasks()
}

// Handles the loading of additional tasks from a file menu option 6
fun loadTasks(){ /* BUG make sure loadTasks loads correctly */
    print("What is the name of the file you want to load your tasks from? ")
    userInput = readln() // Gets the name of the file from the user
    // Error checking for loading
    try {
        taskList.clear() // Empties the taskList of any existing tasks
        // Reads the lines of the file using the file name provided by the user into the taskList
        //taskList.addAll(File(userInput).readLines())
        println("Tasks Loaded Successfully: $taskList") // Confirms the tasks were successfully loaded
    } catch (e: IOException){ // Catches any errors in the loading process
        println("Sorry we were unable to load your tasks. Please try again.")
        e.printStackTrace()
        menu() // Return to menu if loading fails
    }
}