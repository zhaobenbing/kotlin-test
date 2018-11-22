package app.push.com.myapplication.kotlin

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * Created by zhaobenbing@innotechx.com on 2018/11/20.
 */
class User {
    var name: String by Delegates.observable("0") { kProperty: KProperty<*>, s: String, s1: String ->
        print("$s,$s1")
    }
}

fun main(args: Array<String>) {
    var user = User()
    user.name = "first"
    user.name = "second"
    var x = 123
    var y = 123.9
    var z = "123"
    var list = arrayListOf("1", "2", "3")
    list.add("4")
    list.add("5")
    println()
//    for (item in list){
//        println("$item")
//    }
    for (i in 1..5) {
        println(i)
    }
    for (i in 1..5) {
        println(i)
    }
    //cases(2)
    //cases("l")
    varAvg(1, "join", list)
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("数字")
        2 -> println("数字$obj")
        "2" -> println("字符串")
        else -> println("$obj 没有里面")
    }
}

fun varAvg(vararg va: Any) {
    for (v in va) {
        when (v) {
            is Int -> println("$v 是数字")
            is String -> println("$v 是字符串")
            else -> println("$v 是集合")
        }
    }
}





