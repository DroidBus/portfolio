package com.shweta.portfolioapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.shweta.portfolioapplication.R
import com.shweta.portfolioapplication.adapter.SkillsAdapter
import com.shweta.portfolioapplication.databinding.ActivityProfileBinding
import java.lang.reflect.Array

class ProfileActivity : AppCompatActivity() {

    lateinit var activityProfileBinding: ActivityProfileBinding
    lateinit var staggeredGridLayoutManager: StaggeredGridLayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityProfileBinding= ActivityProfileBinding.inflate(layoutInflater)
        setContentView(activityProfileBinding.root)
        val arrayList = resources.getStringArray(R.array.skills_array)

        staggeredGridLayoutManager = StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL)

        var adapter = SkillsAdapter(arrayList)
        activityProfileBinding.rvSkills.layoutManager=staggeredGridLayoutManager
        activityProfileBinding.rvSkills.adapter= adapter

    }
}