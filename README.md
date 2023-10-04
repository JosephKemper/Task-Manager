# Overview

My goal for creating this project is demonstrate my ability to meet deadlines and work under
pressure while still producing viable product that meet my goals, plan and organize projects,
learn new programming languages, learn new tools, and use those same tools and programming
languages to create a usable program.

This program runs through the terminal window. To use the menu, you will simply enter the number 
of the menu item you wish to select and press the enter key. For example if you wanted to add a 
task, you would enter "1" (without the quotes) into the terminal window and press the enter key. 
From there, you would enter the title of the task in question, the description of what you are 
trying to accomplish, and then the date by which you want to achieve it. 

To delete a task, you need to first know which number the task is, and thus will want to list 
current tasks first. Once you select the list menu item, it will automatically list all tasks 
that have been previously entered and will add a number next to each task that you can use to 
interact with that task through. From there, if you want to delete a task, you would simply 
enter the task number of the task you wish to delete. For example, if you have 10 tasks listed, 
and wanted to delete the third task listed, which would have a "Task 3" reference at the top of 
the task listing, you would simply need to enter "3" after going into the delete menu item 
dialog portion of the program. 

To save your tasks to a file, after entering the save dialog through entering the correct menu 
item number, you would enter the name you wish to save your file as. Do not enter the file 
extension, the program will enter that for you. For example if you wanted your save file to be 
named "MyTasks" then that is all you would enter. The program will automatically enter the file 
extension for you (".ser"). At this time, the .ser file extension is the only supported file type. 

To load a previously saved file, you have two options. Menu item 5, will clear out all tasks 
currently entered into the program, and load any saved in the file. Menu item 6, will load any 
tasks saved to the selected file and add them to any previously entered tasks. For either option,
just like with the save option, you would just enter the name of the file as you entered it when 
you saved the file, in our previous example, "MyTasks" and then hit enter, and the program will 
load your saved tasks up for you to review and work with. 

[Software Demo Video](https://youtu.be/9IO4r2GtAR8)

# Development Environment

- IntelliJ Community Edition
- Kotlin version 1.9.0
- GitHub

# Useful Websites

- [Kotlin Wikipedia](https://en.wikipedia.org/wiki/Kotlin_(programming_language))
- [Programiz Kotlin Tutorial](https://www.programiz.com/kotlin-programm)
- [Kotlin Language Official Site](https://kotlinlang.org/)
- [Kotlin Comparison to Java on Official Site](https://kotlinlang.org/docs/comparison-to-java.html)
- [Kotlin Variables and Basic Types on Programiz](https://www.programiz.com/kotlin-programming/variable-types)
- [Kotlin Collections Overview on Official Site](https://kotlinlang.org/docs/collections-overview.html)
- [Kotlin Data Classes on Official Site](https://kotlinlang.org/docs/data-classes.html)
- [Kotlin Conditions and Loops on Official Site](https://kotlinlang.org/docs/control-flow.html#when-expression)
- [IntelliJ Git functionality](https://www.jetbrains.com/help/idea/sync-with-a-remote-repository.html)
- [Basic IntelliJ and Kotlin tutorial](https://www.youtube.com/watch?v=d3VFQ-Dtrbk)
- [IntelliJ Tutorial Playlist](https://www.youtube.com/playlist?list=PLhW3qG5bs-L94pyVnP6YysYQ0_PfvqTQ3)
- [JDK Commercial Installation](https://www.oracle.com/java/technologies/downloads/#jdk20-windows)
- [JDK Open Source](https://jdk.java.net/)
- [IntelliJ Download](https://www.jetbrains.com/idea/download/?section=windows)
- [W3 Schools on Kotlin Functions](https://www.w3schools.com/kotlin/kotlin_functions.php)
- [Kotlin official docs on Kotlin Functions](https://kotlinlang.org/docs/functions.html)
- [Programiz on Kotlin Functions](https://www.programiz.com/kotlin-programming/functions)
- [Geeks for Geeks on Kotlin Functions](https://www.geeksforgeeks.org/kotlin-functions/)
- [Kotlin Official Docs coding conventions](https://kotlinlang.org/docs/coding-conventions.html)
- [Android.com Kotlin Style guide](https://developer.android.com/kotlin/style-guide)
- [EnjoyTutorials on Kotlin global variables](https://www.enjoytutorials.com/kotlin-local-and-global-variables-tutorial/) 
- [Baeldung Writing to Files in Kotlin](https://www.baeldung.com/kotlin/write-file)
- [Baeldung Reading from a File in Kotlin](https://www.baeldung.com/kotlin/read-file)
- [Tutorial Kart Kotlin File Operations](https://www.tutorialkart.com/kotlin/kotlin-file-operations/#gsc.tab=0)
- [Android Developers Kotlin File Operations](https://developer.android.com/reference/kotlin/java/io/File)
- [Kotlin Classes on Official Site](https://kotlinlang.org/docs/classes.html)
- [Kotlin Classes on W3 Schools](https://www.w3schools.com/kotlin/kotlin_classes.php)
- [Programiz on Classes and Objects](https://www.programiz.com/kotlin-programming/class-objects)
- [Kotlin - Class and Objects](https://www.tutorialspoint.com/kotlin/kotlin_class_and_object.htm)
- [Web Site Name](http://url.link.goes.here)

# Future Work

## Minimum Viable Product

- ~~Add Main Menu to interact with program through~~
- ~~Add Functionality to exit the program~~
- ~~Add functionality to add tasks~~
- ~~Add functionality to remove tasks~~
- ~~Add functionality to list tasks~~

## Extras

- ~~Task Title~~
- ~~Task Description~~
- ~~Task Due date~~
- ~~Task Creation date~~
- ~~Time Remaining till due~~
- Next due task menu option
- Category
- List by category
- Save tasks to file
- Load tasks from file
- Show completed tasks
- Show count of completed tasks
- Show count of current tasks