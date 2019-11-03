package com.example.notetext

import com.example.notetext.base.BaseApplication
import com.example.notetext.util.FileUtils
import com.example.notetext.util.Utils

/**
 * Descrip：
 * Author： Zhangjinming
 * CreateTime on 2019/11/3 0003.
 */
class App: BaseApplication() {
    var noteFileIsExist:Boolean = false
    override fun onCreate() {
        super.onCreate()
        initNotePkg()
    }

    fun initNotePkg(){
        Utils.init(this)
        noteFileIsExist = FileUtils.createOrExistsDir(BuildConfig.APPLICATION_ID)
    }
}