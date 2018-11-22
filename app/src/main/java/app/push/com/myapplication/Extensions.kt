package app.push.com.myapplication

import android.content.Context
import android.support.v4.app.Fragment
import android.widget.Toast

/**
 * Created by zhaobenbing@innotechx.com on 2018/11/21.
 */
fun Context.showToast(content: CharSequence, duration: Int = Toast.LENGTH_LONG): Toast {
    var toast = Toast.makeText(MyApp.context, content, Toast.LENGTH_LONG)
    toast.show()
    return toast
}

fun Fragment.showToast(message: String, duration: Int = Toast.LENGTH_LONG): Toast {
    var toast = Toast.makeText(MyApp.context, message, Toast.LENGTH_LONG)
    toast.show()
    return toast
}





















