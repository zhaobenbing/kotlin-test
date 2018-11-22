package app.push.com.myapplication.utils

import android.app.ActivityManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build

/**
 * Created by zhaobenbing@innotechx.com on 2018/11/22.
 */
class AppUtils private constructor() {
    init {
        throw Error("Do not need instantiate!")
    }

    companion object {
        private var DEBUG = true
        private var TAG = "AppUtils"

        /**
         * @param context 上下文
         * @return 当前版本名称
         */
        fun getVersionName(context: Context): String {
            var verName = ""
            var packageName = context.packageName
            try {
                verName = context.packageManager.getPackageInfo(packageName, 0).packageName
            } catch (e: PackageManager.NameNotFoundException) {
                e.printStackTrace()
            }
            return verName
        }

        /**
         * @param context 上下文
         * @return 当前版本号
         */
        fun getVersinCode(context: Context): Int {
            var verCode = 0
            var packageName = context.packageName
            try {
                verCode = context.packageManager.getPackageInfo(packageName, 0).versionCode
            } catch (e: PackageManager.NameNotFoundException) {
                e.printStackTrace()
            }
            return verCode
        }

        fun getMobileModel(): String {
            var model: String? = Build.MODEL
            model = model?.trim { it <= ' ' } ?: ""
            return model

        }

        /**
         * 获取可用内存
         */
        fun getDeviceUsableMemory(context: Context): Int {
            var am = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
            var mi = ActivityManager.MemoryInfo()
            am.getMemoryInfo(mi)
            return (mi.availMem / (1024 * 1024)).toInt()

        }

        /**
         * 获取手机系统SDK版本
         *
         * @return 如API 17 则返回 17
         */
        val sdkVersion: Int
            get() = android.os.Build.VERSION.SDK_INT
    }
}