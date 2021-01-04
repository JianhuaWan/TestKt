package com.example.testkt

class Base {
    class InnerClass
}
typealias BaseInner = Base.InnerClass

fun main() {
    var baseInner1 = Base.InnerClass()
    var baseInner2 = BaseInner()
    println(baseInner1.javaClass)
    println(baseInner2.javaClass)
    testVar()
}

fun testVar() {
    var intValue: Int = 100
    val doubleValue: Double = 100.0
    var int1: Int
    val int2: Int
    println(doubleValue + 1)
}