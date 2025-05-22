package com.example.moviles_lab10_tarea.model

data class Product(
    var name:String,
    var description:String,
    var price:Double,
    var stock:Int,
    val category: Category,
    val supplier: Supplier
)