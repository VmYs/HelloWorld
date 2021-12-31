package com.example.helloworld

//接口中定义的方法默认没有函数体，若有函数体，则函数体的内容就是该函数的默认实现，在其他类调用该接口时可以不强制重写该函数。
interface Study {
    fun readBooks()
    fun doHomework()
}