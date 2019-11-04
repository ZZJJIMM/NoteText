package com.jimz.notetxt.view

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.jimz.notetxt.R
import com.jimz.notetxt.util.FileUtils
import java.io.File

/**
 * Descrip：
 * Author： Zhangjinming
 * CreateTime on 2019/11/3 0003.
 */
class FileListAdapter:BaseQuickAdapter<File,BaseViewHolder> {
    constructor(data: MutableList<File>?) : super(R.layout.activity_main, data)

    override fun convert(helper: BaseViewHolder, item: File?) {
        item.apply {
            helper.setText(R.id.tv_main_name,FileUtils.getFileName(item))
        }
    }

}