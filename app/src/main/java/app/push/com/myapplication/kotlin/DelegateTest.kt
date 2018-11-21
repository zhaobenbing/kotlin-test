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
}








