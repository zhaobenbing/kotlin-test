package app.push.com.myapplication.kotlin

/**
 * Created by zhaobenbing@innotechx.com on 2018/11/21.
 */
interface Animal {
    fun bark()
}

class Dog : Animal {
    override fun bark() {
        println("wang,wang")
    }
}

class Cat(animal: Animal) : Animal by animal {
}

fun  main(args:Array<String>){
    Cat(Dog()).bark()
}