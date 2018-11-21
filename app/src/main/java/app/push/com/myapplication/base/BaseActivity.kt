package app.push.com.myapplication.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import pub.devrel.easypermissions.EasyPermissions

/**
 * Created by zhaobenbing@innotechx.com on 2018/11/21.
 */
abstract class BaseActivity : AppCompatActivity(), EasyPermissions.PermissionCallbacks {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
    }

    override fun onPermissionsDenied(requestCode: Int, perms: MutableList<String>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onPermissionsGranted(requestCode: Int, perms: MutableList<String>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    abstract fun getLayoutId(): Int

    abstract fun loadData(): Unit
}