package com.jimz.notetxt.util

import java.io.File

/**
 * Descrip：
 * Author： Zhangjinming
 * CreateTime on 2019/11/4 0004.
 */
class CustomFileUtils {
    companion object{
        //Kotlin懒汉式单例加锁线程安全
        val Instances by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            CustomFileUtils()
        }
    }

    fun createDirectory(path:String,dirName:String){
        val file = File(path+"/"+dirName)
        if (!file.exists()){
            file.mkdirs()
            LogUtils.iTag("TAG_DIR",file.mkdir(),file.mkdirs())
        }
    }
}