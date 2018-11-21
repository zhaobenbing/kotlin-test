package app.push.com.myapplication.kotlin

/**
 * Created by zhaobenbing@innotechx.com on 2018/11/20.
 */
interface People {
    var id: Int
    fun name(name: String) {}

    fun isPeople() = true
}


class Man() : People {
    override var id: Int = 0
    override fun name(name: String) {
        super.name(name)
    }

    override fun isPeople(): Boolean {
        return super.isPeople()
    }
}


abstract class Car {
    var categry: Int = 1
    abstract fun run()
}

class Truck : Car() {
    override fun run() {
    }

}












