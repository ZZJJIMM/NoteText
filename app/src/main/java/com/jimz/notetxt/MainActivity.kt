package com.jimz.notetxt

import android.Manifest.permission.READ_EXTERNAL_STORAGE
import android.Manifest.permission.WRITE_EXTERNAL_STORAGE
import android.content.Intent
import android.os.Bundle
import android.os.Environment
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.jimz.notetxt.text.viewmodel.ContentTextViewModel
import com.jimz.notetxt.util.CustomFileUtils
import com.jimz.notetxt.util.LogUtils
import com.jimz.notetxt.util.PermissionConstants
import com.jimz.notetxt.util.PermissionUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val viewModel by lazy { ViewModelProviders.of(this).get(ContentTextViewModel::class.java) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_main_name.setOnClickListener {
            CustomFileUtils.Instances.createDirectory(Environment.getExternalStorageDirectory().toString(),BuildConfig.APPLICATION_ID)
        }
    }

    val permissions = arrayOf(WRITE_EXTERNAL_STORAGE, READ_EXTERNAL_STORAGE)
    private fun getPermission(){
        PermissionUtils.permission(PermissionConstants.STORAGE)
            .callback(object : PermissionUtils.FullCallback {
                override fun onGranted(permissionsGranted: List<String>) {
                    LogUtils.d(permissionsGranted)
                }

                override fun onDenied(permissionsDeniedForever: List<String>,
                                      permissionsDenied: List<String>) {
                    LogUtils.d(permissionsDeniedForever, permissionsDenied)
                    if (!permissionsDeniedForever.isEmpty()) {
                        return
                    }
                }
            })
            .request()
    }

    private fun openFileDir(){
        var intent = Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("*/*");//设置类型，我这里是任意类型，任意后缀的可以这样写。
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(intent,1);
    }
}
