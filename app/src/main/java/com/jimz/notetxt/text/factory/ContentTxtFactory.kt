package com.jimz.notetxt.text.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jimz.notetxt.text.viewmodel.ContentTextViewModel

/**
 * Descrip：
 * Author： Zhangjinming
 * CreateTime on 2019/10/31 0031.
 */
class ContentTxtFactory(private val viewModel: ContentTextViewModel):ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when{
            modelClass.isInstance(viewModel) -> viewModel as T

            else -> throw IllegalAccessException("unknown model is $viewModel")
        }
    }
}