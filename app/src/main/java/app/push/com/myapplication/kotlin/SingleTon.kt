package app.push.com.myapplication.kotlin

/**
 * Created by zhaobenbing@innotechx.com on 2018/11/21.
 */
class SingleTon private constructor() {
    companion object {
        fun get(): SingleTon {
            return Holder.instance
        }
    }

    private object Holder {
        val instance = SingleTon()
    }
}