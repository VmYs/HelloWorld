package com.example.helloworld

//主构造函数直接定义在类名后，无函数体，若需要编写逻辑，可使用init结构体。
//若继承的父类，如Person有主构造函数，则需在Student类的主构造函数中加上name和age这两个参数，再将这两个参数传给Person类的构造函数。
//在Student类的主构造函数中增加name和age这两个字段时，不能再将它们声明成val，因为在主构造函数中声明成val或者var的参数将自动成为该类的字段，这就会导致和父类中同名的name和age字段造成冲突。
//因此，这里的name和age参数前面我们不用加任何关键字，让它的作用域仅限定在主构造函数当中即可。
//kt中继承类和调用接口都使用“:”，由于接口没有构造函数，因此无需加括号。
class Student (val sno : String, val grade : Int, name: String, age: Int) : Person(name, age) , Study {
    //override关键字重写父类或实现接口中的函数，接口定义的函数，在这个类中必须实现。
    override fun doHomework() {
        println("$name is doing homework.")
    }

    override fun readBooks() {
        println("$name is reading books.")
    }
    //次构造函数，关键字constructor，必须直接或间接调用主构造函数，可存在多个
    //若当前类没有主构造函数，次构造函数则通过super关键字调用父类的主构造函数，所有类的超类为Object，默认构造函数Object()
    constructor(name: String, age: Int) : this("", 0, name, age) {
    }
    constructor() : this("",0) {
    }
}