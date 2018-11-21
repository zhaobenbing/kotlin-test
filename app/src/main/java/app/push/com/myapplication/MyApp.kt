package app.push.com.myapplication

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import android.util.Log
import app.push.com.myapplication.utils.DisplayManager
import kotlin.properties.Delegates

/**
 * Created by zhaobenbing@innotechx.com on 2018/11/21.
 */
class MyApp : Application() {
    companion object {
        private val TAG = "MyApp"
        var context: Context by Delegates.notNull()
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext

        DisplayManager.init(context)

        registerActivityLifecycleCallbacks(activityLifecycleCallbacks)
    }

    private val activityLifecycleCallbacks = object : ActivityLifecycleCallbacks {
        override fun onActivityPaused(activity: Activity?) {
            Log.d(TAG, "onActivityPaused " + activity?.componentName?.className)
        }

        override fun onActivityResumed(activity: Activity?) {
            Log.d(TAG, "onActivityResumed " + activity?.componentName?.className)

        }

        override fun onActivityStarted(activity: Activity?) {
            Log.d(TAG, "onActivityStarted " + activity?.componentName?.className)

        }

        override fun onActivityDestroyed(activity: Activity?) {
            Log.d(TAG, "onActivityDestroyed " + activity?.componentName?.className)

        }

        override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
            Log.d(TAG, "onActivitySaveInstanceState " + activity?.componentName?.className)

        }

        override fun onActivityStopped(activity: Activity?) {
            Log.d(TAG, "onActivityStopped " + activity?.componentName?.className)

        }

        override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
            Log.d(TAG, "onActivityCreated " + activity?.componentName?.className)

        }

    }
}