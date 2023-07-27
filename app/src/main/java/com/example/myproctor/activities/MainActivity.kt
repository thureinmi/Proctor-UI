package com.example.myproctor.activities

import AnomaliesFragment
import ViewPagerAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.myproctor.R
import com.example.myproctor.fragments.NearFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(AnomaliesFragment(), "Anomalies")
        adapter.addFragment(NearFragment(), "Nearby Devices")

        pager.adapter = adapter
        tab.setupWithViewPager(pager)
    }
}