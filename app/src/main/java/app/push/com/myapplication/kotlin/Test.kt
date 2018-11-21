package app.push.com.myapplication.kotlin

/**
 * Created by zhaobenbing@innotechx.com on 2018/11/20.
 */
class Test1 {
    var name: String? = null
    var sex: Int = 0

    init {
        name = "join"
        sex = 0
    }
}


class Test2 constructor(id: Int) {
    var id: Int = 0

    init {
        this.id = id
        print(id)
    }
}

class Test3 constructor(var name: String, var height: Int = 190) {
    init {
        println("name:$name,height:$height")
    }
}

class Test4 {
    var name: String? = null
    var sex: String? = null
    var height: Int? = 0

    constructor() {}
    constructor(name: String) {}
    constructor(name: String, sex: String) {}
    constructor(name: String, sex: String, height: Int) {}
}

open class Test5 {

    constructor(name: String) : this(name, null, 0)

    constructor(name: String, sex: String) : this(name, sex, 0)

    constructor(name: String?, sex: String?, height: Int?) {}

    open fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun isA() = true
}

class Test6 private constructor() {
    var name: String? = null

    init {

    }
}


class Test7 constructor(name: String) : Test5(name) {
    override fun sum(a: Int, b: Int): Int {
        return super.sum(a, b)
    }
}





