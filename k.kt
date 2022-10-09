package com.example.kotlin

fun main() {
    var todo=Todo()
    var task1= Task(2, "Abdulrahman", "travel to NewYourk", false)
    var task2= Task(2, "Omar", "buy a car", false)
    var task3= Task(2, "Saad", "sell my cat ", false)
Todo.addTask(task1)
  }






data class Task(var id:Int, var name:String, var note:String, var completed:Boolean )
class Todo(){
    val tasks = arrayListOf<Task>()
    fun addtask(task:Task){
        println("add Task: ${task.Task}")
        tasks.add(task)
    }
    }
