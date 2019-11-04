package com.jimz.notetxt

import com.jimz.notetxt.base.BaseApplication
import com.jimz.notetxt.util.FileUtils
import com.jimz.notetxt.util.Utils

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