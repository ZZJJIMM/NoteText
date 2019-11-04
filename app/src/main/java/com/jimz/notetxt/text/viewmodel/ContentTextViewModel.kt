package com.jimz.notetxt.text.viewmodel

import androidx.lifecycle.ViewModel
import com.jimz.notetxt.util.FileUtils
import java.io.File

/**
 * Descrip：
 * Author： Zhangjinming
 * CreateTime on 2019/10/29 0029.
 */
class ContentTextViewModel : ViewModel() {
    var filelist: MutableList<File> = ArrayList<File>()

    fun getFileList(): MutableList<File> {
        if (filelist == null) {
            filelist = FileUtils.listFilesInDir("com.dayizhihui.dayishi.doctor")
            return filelist
        }
        return filelist
    }
}