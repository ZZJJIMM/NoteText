package com.example.notetext

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.example.notetext.text.viewmodel.ContentTextViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val viewModel by lazy { ViewModelProviders.of(this).get(ContentTextViewModel::class.java) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        tv_main_name.setOnClickListener {
//            val user = viewModel.userLiveData().value
//            user?.age = user?.age?.plus(1)!!
//            user?.let { it1 -> viewModel.data(it1) }
//        }
//
//        viewModel.userLiveData().observe(this, Observer {
//            tv_main_name.text = it.age.toString()
//        })

        tv_main_name.text = viewModel.getTextFile().toString()
    }
}
