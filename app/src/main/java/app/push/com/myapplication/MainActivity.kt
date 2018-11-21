package app.push.com.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.KeyEvent
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import app.push.com.myapplication.kotlin.Test1
import app.push.com.myapplication.kotlin.Test2
import app.push.com.myapplication.kotlin.Test3

class MainActivity : AppCompatActivity() {
    companion object {
        val url = "http:www.baidu.com"
    }

    lateinit var tv: TextView
    lateinit var imageView: ImageView
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        setView()
        alpha()
        clickBtn()
    }

    private fun init() {
        tv = findViewById(R.id.tv)
        imageView = findViewById(R.id.image_view)
        btn = findViewById(R.id.btn)
    }

    fun setView() {
        var t1 = Test1()
        tv.text = "kotlin" + url + t1.name + " " + t1.sex
    }

    fun alpha() {
        imageView.imageAlpha = 23
    }

    fun clickBtn() {
        btn.setOnClickListener {
            var t2 = Test2(5)
            var t3 = Test3("lili", 909)
            Toast.makeText(this, "click" + t2.id + " " + t3.height, Toast.LENGTH_LONG).show()
            var intent = Intent()
            intent.setClass(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private var mExitTime: Long = 0
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (System.currentTimeMillis().minus(mExitTime) <= 2000) {
                finish()
            } else {
                mExitTime = System.currentTimeMillis()
                showToast("再按一次退出程序")
            }
            return true

        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onDestroy() {
        super.onDestroy()
        mExitTime = 0
    }
}
