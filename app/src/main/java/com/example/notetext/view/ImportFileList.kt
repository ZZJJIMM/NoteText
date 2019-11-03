package com.example.notetext.view

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notetext.R
import com.example.notetext.base.BaseActivity
import kotlinx.android.synthetic.main.activity_file_list.*

/**
 * Descrip：
 * Author： Zhangjinming
 * CreateTime on 2019/11/3 0003.
 */
class ImportFileList:BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_file_list)
        rv_file_list.layoutManager = LinearLayoutManager(this)
    }
}