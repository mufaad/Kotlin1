@file:JvmName("myktfile")
package com.learn

import com.javapack.myjavafile

fun main(args: Array<String>){

        var javaobj = myjavafile.multi(10, 15)
        println(javaobj)

        println("Without Height: " + findVolume(10, 5))
        println("With Height: ${findVolume(10, 5, 20)}")
    }

    fun display(x:Int, y:Int):Int{

        return x + y;
    }
//JvmOverloads
    @JvmOverloads
    fun findVolume(length: Int, breath: Int, height:Int = 10):Int{

        return length * breath * height;
    }