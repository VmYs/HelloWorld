package com.example.helloworld

//open关键字使Person类可被继承，kotlin中默认所有非抽象类都不可被继承
open class Person(val name: String, val age: Int) {

    fun eat() {
        println("$name is eating. He is $age years old.")
    }
}