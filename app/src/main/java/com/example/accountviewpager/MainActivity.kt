package com.example.accountviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpViewPager()
    }

    private fun setUpViewPager() {
        val adaptor = MyViewPageStateAdapter(supportFragmentManager)
        adaptor.addFragment(MainFragment(), "")
        adaptor.addFragment(MainFragment(), "")
        adaptor.addFragment(MainFragment(), "")
        viewPager.adapter = adaptor
        tabs.setupWithViewPager(viewPager)
    }

}
