package com.example.androidlab

val data: Int by lazy {
    println("in lazy..")
    10
}

var data2: Int = 1

var cData: Char = 'a'

fun main(){
    println("in main")
    println(data + 10)  // 20
    println(data + 20)  // 30
    println(data + 30)  // 40

    println(data2)
    data2 = data2.plus(4)
    println(data2)

    var data1: Int? = 1 // nullable
    var data2: Int = 1  // not null



}