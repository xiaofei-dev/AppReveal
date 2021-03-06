package com.xiaofeidev.appreveal

import android.content.Intent
import android.os.Bundle

import com.xiaofeidev.appreveal.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext.setOnClickListener {view ->
            val intent = Intent(this, SecondActivity::class.java)
            val location = IntArray(2)
            view.getLocationInWindow(location)
            //把点击按钮的中心位置坐标传过去作为 SecondActivity 的揭露动画圆心
            intent.putExtra(CLICK_X, location[0] + view.width/2)
            intent.putExtra(CLICK_Y, location[1] + view.height/2)
            startActivity(intent)
        }
    }
}
