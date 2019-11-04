package com.jimz.notetxt.text.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.jimz.notetxt.text.viewmodel.ContentTextViewModel

/**
 * Descrip：
 * Author： Zhangjinming
 * CreateTime on 2019/10/29 0029.
 */
class ContentTextActivity:AppCompatActivity() {
    val viewModel by lazy { ViewModelProviders.of(this).get(ContentTextViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}