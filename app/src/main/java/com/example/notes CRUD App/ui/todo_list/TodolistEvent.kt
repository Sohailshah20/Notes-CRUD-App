package com.example.`notes CRUD App`.ui.todo_list

import com.example.`notes CRUD App`.data.Todo

sealed class TodolistEvent {

    data class DeleteTodo(val todo: Todo): TodolistEvent()

    data class OnDoneChange(val todo:Todo, val isDone: Boolean): TodolistEvent()

    object OnUndoDeleteClick: TodolistEvent()

    data class OnTodoClick(val todo: Todo): TodolistEvent()

    object OnAddTodoClick: TodolistEvent()

}
