package app.push.com.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.ImageView
import android.widget.TextView
import app.push.com.myapplication.base.BaseActivity

class SplashActivity : BaseActivity() {

    lateinit var tv: TextView
    lateinit var imageView: ImageView

    var alphaAnimation: AlphaAnimation? = null

    override fun loadData() {
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    fun initView(): Unit {
        tv = findViewById(R.id.tv)
        imageView = findViewById(R.id.image_view)

        alphaAnimation = AlphaAnimation(0.2f, 1.0f)
        alphaAnimation?.duration = 2000
        alphaAnimation?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationRepeat(animation: Animation?) {
            }

            override fun onAnimationEnd(animation: Animation?) {
                gotoMain()
            }

            override fun onAnimationStart(animation: Animation?) {
            }

        })
        imageView.startAnimation(alphaAnimation)
    }

    fun gotoMain() {
        var intent = Intent()
        intent.setClass(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true
        }
        return super.onKeyDown(keyCode, event)
    }
}
