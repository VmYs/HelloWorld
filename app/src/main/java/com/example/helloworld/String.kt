package com.example.helloworld

import java.lang.StringBuilder

//扩展函数的语法结构
//定义扩展函数只需要在函数名的前面加上一个“ClassName.”的语法结构，就表示将该函数添加到指定类当中了。
fun String.lettersCount(): Int {
    var count = 0
    for (char in this) {
        if (char.isLetter()) {
            count++
        }
    }
    return count
}

////通过“*”运算符重载实现字符串和数字相乘的能力，实现字符串重复n次的功能
//operator fun String.times(n: Int): String {
//    val builder = StringBuilder()
//    repeat(n) {
//        builder.append(this)
//    }
//    return builder.toString()
//}

//通过String类提供的repeat函数进一步简化运算符重载的形式
operator fun String.times(n: Int) = repeat(n)