package app.push.ccom.kotlin.test

/**
 * Created by zhaobenbing@innotechx.com on 2018/11/19.
 */
object SingleTon {
    val age = "7"
    fun printAge() = print(age)

}

data class Bean(var id: Int, var name: String)

fun main(args: Array<String>) {
    print(SingleTon.age)

    SingleTon.printAge()
    println()
    val bean1 = Bean(1, "liming")
    val bean2 = bean1.copy()
    val bean3 = bean1.copy(name = "123")
    val (id, name) = bean1
    print("$id ~ $name")
    val (id1, name1) = bean3
    println()
    print("$id1 ~ $name1")
}