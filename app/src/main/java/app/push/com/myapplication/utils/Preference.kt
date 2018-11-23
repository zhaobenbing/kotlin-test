package app.push.com.myapplication.utils

import android.content.Context
import android.content.SharedPreferences
import app.push.com.myapplication.MyApp
import kotlin.reflect.KProperty

/**
 * Created by zhaobenbing@innotechx.com on 2018/11/22.
 */
class Preference<T>(var name: String, private var default: T) {
    companion object {
        private val FILE_NAME = "kotlin_file_name"
        private val prefs: SharedPreferences by lazy {
            MyApp.context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)
        }

        fun clearAll() {
            prefs.edit().clear().apply()
        }

        fun deleteByKey(key: String) {
            prefs.edit().remove(key).apply()
        }
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        putSharedPreferences(name, value)
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return getSharedPreferences(name, default)
    }

    fun putSharedPreferences(name: String, value: T): Unit = with(prefs.edit()) {
        when (value) {
            is Long -> putLong(name, value)
            is Int -> putInt(name, value)
            is Boolean -> putBoolean(name, value)
            is String -> putString(name, value)
            is Float -> putFloat(name, value)
            else -> putString(name, value.toString())
        }.apply()
    }

    fun getSharedPreferences(name: String, default: T): T = with(prefs) {
        var res: Any = when (default) {
            is Long -> getLong(name, default)
            is Int -> getInt(name, default)
            is Boolean -> getBoolean(name, default)
            is String -> getString(name, default)
            is Float -> getFloat(name, default)
            else -> getString(name, "")
        }
        return res as T

    }

    fun contains(key:String):Boolean{
        return prefs.contains(key)
    }
    fun getAll():Map<String,*>{
        return prefs.all
    }
}