package com.example.helloworld

<<<<<<< HEAD
import java.util.*

=======
>>>>>>> defb10f609b12ee9c2632a4ff9c609da892c77f8
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

<<<<<<< HEAD
    //实例化Person和Student类的对象，调用类中的方法
    val p = Person("Jack", 19)
    p.eat()

    val student1 = Student()
    val student2 = Student("Tom", 20)
    val student3 = Student("a123", 5, "Tom", 20)
    doStudy(student2)
=======
//    //实例化Person和Student类的对象，调用类中的方法
//    val p = Person("Jack", 19)
//    p.eat()
//
//    val student1 = Student()
//    val student2 = Student("Tom", 20)
//    val student3 = Student("a123", 5, "Tom", 20)
//    doStudy(student2)
>>>>>>> defb10f609b12ee9c2632a4ff9c609da892c77f8
//
//    //实例化数据类Cellphone
//    val cellphone1 = Cellphone("Samsung", 1299.99)
//    val cellphone2 = Cellphone("Samsung", 1299.99)
//    println(cellphone1)
//    println("cellphone1 equals cellphone2 " + (cellphone1 == cellphone2))

    //调用时，kotlin自动创建了一个Singleton类的实例，且保证全局只存在一个Singleton实例
<<<<<<< HEAD
    //Singleton.singletonTest()

    //listOf()函数初始化集合，且listOf()创建的集合是不可变的
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")

    //找出集合list中最长的单词，使用了集合的函数式API，调用接口方法时，通过Lambda表达式传入函数
    //Lambda表达式的语法结构：详见书p91
    //{参数名1: 参数类型, 参数名2: 参数类型 -> 函数体}
    //当Lambda表达式的参数列表中只有一个参数时，也不必声明参数名，而是可以使用it关键字来代替
    val maxLengthFruit = list.maxBy { it.length }
    println("max length fruit is $maxLengthFruit")

    //集合中的map函数是最常用的一种函数式API，它用于将集合中的每个元素都映射成一个另外的值，映射的规则在Lambda表达式中指定，最终生成一个新的集合
    //val newList = list.map { it.toUpperCase(Locale.ROOT) }

    //filter函数是用来过滤集合中的数据的，它可以单独使用，也可以配合刚才的map函数一起使用
    val newList = list.filter { it.length <= 5 }.map { it.toUpperCase(Locale.ROOT) }

    for (fruit in newList) {
        println(fruit)
    }

    //any函数用于判断集合中是否至少存在一个元素满足指定条件，all函数用于判断集合中是否所有元素都满足指定条件
    val anyResult = list.any { it.length <= 5 }
    val allResult = list.all { it.length <= 5 }
    println("anyResult is $anyResult, allResult is $allResult")

    //在Kotlin代码中调用了一个Java方法，并且该方法接收一个Java单抽象方法接口参数，就可以使用函数式API
    //通过匿名类的写法、kotlin的规则和kotlin中Lambda表达式的规则，创建线程简化如下：详见2.6.3
    Thread {
        println("Thread is running")
    }.start()

//    //mutableListOf()函数初始化的集合是可变的
//    val list = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape")
//    list.add("watermelon")
//    for (fruit in list) {
//        println(fruit)
//    }

//    //和list同理，通过setOf()和mutableSetOf()函数初始化不可变/可变的集合，但set集合中不允许存放重复元素。
//    val set = setOf("Apple", "Banana", "Orange", "Pear", "Grape")
//    for (fruit in set) {
//        println(fruit)
//    }
=======
    Singleton.singletonTest()

    //listOf()函数初始化集合，且listOf()创建的集合是不可变的
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
    //找出集合list中最长的单词，使用了Lambda表达式
    val maxLengthFruit = list.maxBy { it.length }
    println("max length fruit is $maxLengthFruit")

//    //mutableListOf()函数初始化的集合是可变的
//    val list = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape")
//    list.add("watermelon")
    for (fruit in list) {
        println(fruit)
    }

    //和list同理，通过setOf()和mutableSetOf()函数初始化不可变/可变的集合
    val set = setOf("Apple", "Banana", "Orange", "Pear", "Grape")
    for (fruit in set) {
        println(fruit)
    }
>>>>>>> defb10f609b12ee9c2632a4ff9c609da892c77f8

//    //类似Java写法，存取数据时无需使用put/get
//    val map = HashMap<String, Int>()
//    map["Apple"] = 1
//    map["Banana"] = 2
//    map["Orange"] = 3
//    map["Pear"] = 4
//    map["Grape"] = 5

<<<<<<< HEAD
//    //kotlin中与之前集合相似，map对应有mapOf()和mutableMapOf()
//    //这里关联键值对组合的“to”并不是关键字，而是一个infix函数，会在本书第9章深入探究infix函数的相关内容。
//    val map = mapOf("Apple" to 1, "Banana" to 2, "Orange" to 3, "Pear" to 4, "Grape" to 5)
//    //for-in循环时将键值对变量一起声明到一个括号里，每次遍历的结果就会赋值给这两个键值对变量
//    for ((fruit, number) in map) {
//        println("fruit is $fruit, number is $number")
//    }

    //通过键值对的方式来传参，避免编译器默认的传参顺序
    printParams(str = "world")
=======
    //kotlin中与之前集合相似，map对应有mapOf()和mutableMapOf()
    //这里关联键值对组合的“to”并不是关键字，而是一个infix函数，会在本书第9章的Kotlin课堂中深入探究infix函数的相关内容。
    val map = mapOf("Apple" to 1, "Banana" to 2, "Orange" to 3, "Pear" to 4, "Grape" to 5)
    //for-in循环时将键值对变量一起声明到一个括号里
    for ((fruit, number) in map) {
        println("fruit is $fruit, number is $number")
    }

>>>>>>> defb10f609b12ee9c2632a4ff9c609da892c77f8


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

<<<<<<< HEAD
//面向接口编程，doStudy函数接收Study类型的参数，Student类实现了Study接口，因此该类的实例可以传到doStudy函数中
//kotlin默认所有的参数和变量都不可为空，可通过在类名后添加?表示可为空的类型系统
//fun doStudy(study: Study?) {
//    //通过if判断检查空指针
//    if (study != null) {
//        study.readBooks()
//        study.doHomework()
//    }
//}

//kotlin中可以通过?.操作符实现if的判空处理代码
//?.操作符表示对象为空时什么都不做，对象不为空时就调用let函数，而let函数会将study对象本身作为参数传递到Lambda表达式中
//此时的study对象肯定不为空了，我们就能放心地调用它的任意方法了
fun doStudy(study: Study?) {
    study?.let {
        it.readBooks()
        it.doHomework()
    }
}

//函数的参数默认值
fun printParams(num: Int = 0, str: String) {
    println("num is $num, str is $str")
=======
//面向接口编程，doStudy函数接收Study类型的参数，Student类实现了Study接口，因此该类的实例可以传到doStudy函数中。
fun doStudy(study: Study) {
    study.readBooks()
    study.doHomework()
>>>>>>> defb10f609b12ee9c2632a4ff9c609da892c77f8
}
