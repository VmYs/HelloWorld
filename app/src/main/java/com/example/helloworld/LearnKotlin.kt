package com.example.helloworld

fun main() {

//    println("Hello Kotlin!")
//
//    //强制规定变量类型，Kotlin中使用的是继承的方式
//    //Java中的基础数据类型在Kotlin中是对象数据类型，Java中的关键字int在Kotlin中变成了类Int
//    var aa: Int = 10
//    aa *= 10
//    println("aa = $aa")
//
//    //调用largeNumber函数
//    val a = 37
//    val b = 40
//    val value = largeNumber(a, b)
//    println("larger number is $value")
//
//    //调用getScore函数
//    val score1 = getScore("Tom")
//    println("Tom's score is $score1")
//    val score2 = getScore("Tommy")
//    println("Tommy's score is $score2")
//
//    //调用checkNumber函数
//    val num = 10
//    checkNumber(10)
//
//    //..表示两端闭合的区间（升序）
//    for (i in 0..10) {
//        println(i)
//    }
//
//    //until表示左闭右开的区间（升序），step规定了递增的幅度，默认不写是1
//    for (i in 0 until 10 step 2) {
//        println(i)
//    }
//
//    //downTo表示两端闭合的区间（降序）
//    for (i in 10 downTo 0) {
//        println(i)
//    }

    //实例化Person和Student类的对象，调用类中的方法
    val p = Person("Jack", 19)
    p.eat()

    val student1 = Student()
    val student2 = Student("Tom", 20)
    val student3 = Student("a123", 5, "Tom", 20)
    doStudy(student2)

    //实例化数据类Cellphone
    val cellphone1 = Cellphone("Samsung", 1299.99)
    val cellphone2 = Cellphone("Samsung", 1299.99)
    println(cellphone1)
    println("cellphone1 equals cellphone2 " + (cellphone1 == cellphone2))
}

/*
标准函数格式
fun largeNumber (num1: Int, num2: Int): Int {
    return max(num1, num2)
}*/

////函数语法糖简化
////由于max函数返回值为Int，因此可推导出函数largeNumber返回值也是Int，无需再显式声明函数返回值类型
//fun largeNumber (num1: Int, num2: Int) = max(num1, num2)

/*通过if语句实现
fun largeNumber (num1: Int, num2: Int) : Int {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }
}*/

////语法糖简化
//fun largeNumber (num1 : Int, num2 : Int) = if (num1 > num2) num1 else num2

////if语句实现查成绩
//fun getScore(name: String) = if (name == "Tom") {
//    86
//} else if (name == "Jim") {
//    77
//} else if (name == "Jack") {
//    95
//} else if (name == "Lily") {
//    100
//} else {
//    0
//}

////when语句实现查成绩
//fun getScore(name: String) = when (name) {
//    "Tom" -> 86
//    "Jim" -> 77
//    "Jack" -> 95
//    "Lily" -> 100
//    else -> 0
//}

////when不带参数实现特殊需求查成绩
//fun getScore(name: String) = when {
//    name.startsWith("Tom") -> 86
//    name == "Jim" -> 77
//    name == "Jack" -> 95
//    name == "Lily" -> 100
//    else -> 0
//}
//
////when语句实现类型匹配
//fun checkNumber(num: Number) {
//    when (num) {
//        is Int -> println("number is Int")
//        is Double -> println("number is Double")
//        else -> println("number not support")
//    }
//}

//面向接口编程，doStudy函数接收Study类型的参数，Student类实现了Study接口，因此该类的实例可以传到doStudy函数中。
fun doStudy(study: Study) {
    study.readBooks()
    study.doHomework()
}
