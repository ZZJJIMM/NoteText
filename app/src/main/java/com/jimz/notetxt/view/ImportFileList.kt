package com.jimz.notetxt.view

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.jimz.notetxt.R
import com.jimz.notetxt.base.BaseActivity
import com.jimz.notetxt.text.viewmodel.ContentTextViewModel
import com.jimz.notetxt.util.LogUtils
import kotlinx.android.synthetic.main.activity_file_list.*

/**
 * Descrip：
 * Author： Zhangjinming
 * CreateTime on 2019/11/3 0003.
 */
class ImportFileList:BaseActivity() {
    val  viewModel by lazy { ViewModelProviders.of(this).get(ContentTextViewModel::class.java) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_file_list)
        rv_file_list.layoutManager = LinearLayoutManager(this)

        LogUtils.iTag("TAG_FILE",viewModel.getFileList())
        rv_file_list.adapter = FileListAdapter(viewModel.getFileList())
    }
}