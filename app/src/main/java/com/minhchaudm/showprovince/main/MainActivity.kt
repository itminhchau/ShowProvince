package com.minhchaudm.showprovince.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.minhchaudm.kotlinmessenger.utils.replaceFragment
import com.minhchaudm.showprovince.R
import com.minhchaudm.showprovince.fragment.FragmentRecyclerview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(FragmentRecyclerview.newInstance(),R.id.Fr_layoutMain)
    }
}