package app.push.com.myapplication.utils

import android.content.Context
import android.util.DisplayMetrics

/**
 * Created by zhaobenbing@innotechx.com on 2018/11/21.
 */
object DisplayManager {
    init {

    }

    var displayMetrices: DisplayMetrics? = null

    private var screenWidth: Int? = null
    private var screenHeight: Int? = null
    private var densityDpi: Int? = null

    fun init(context: Context) {
        displayMetrices = context.resources.displayMetrics
        screenWidth = displayMetrices?.widthPixels
        screenHeight = displayMetrices?.heightPixels
        densityDpi = displayMetrices?.densityDpi
    }

    /**
     * 获取屏幕宽度
     */
    fun getScreenWidth(): Int? {
        return screenWidth
    }

    /**
     * 获取屏幕高度
     */
    fun getScreenHeight(): Int? {
        return screenHeight
    }

    fun getDensityDpi(): Int? {
        return densityDpi
    }

    /**
     * dp 转化 px
     */
    fun dptoPx(dipValue: Float): Int {
        var scale = displayMetrices?.density
        return (dipValue * scale!! + 0.5f).toInt()
    }
}