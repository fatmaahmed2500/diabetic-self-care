package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class breakfastMainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var breakitem: ArrayList<breakitem>? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var breakadapters: breakadapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breakfast_main)
        recyclerView = findViewById(R.id.recycler_view_item)
        gridLayoutManager =
            GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        breakitem = ArrayList()
        breakitem = setAlphas()
        breakadapters = breakadapter(applicationContext, breakitem!!)
        recyclerView?.adapter = breakadapters

    }

    private fun setAlphas(): ArrayList<breakitem> {

        var arrayList: ArrayList<breakitem> = ArrayList()

        arrayList.add(breakitem(R.drawable.eggs, "egg:70 cal,6g protein,1g carb"))

        arrayList.add(breakitem(R.drawable.avocado, "avocado toast:257cal,6.9g protein,16g fat"))
        arrayList.add(breakitem(R.drawable.chia1, "chia seed pudding:175cal,6g protein,11g fat,15.1g carbs,10g fiber"))
        arrayList.add(breakitem(R.drawable.yogurt, "Greek yogurt:121cal,16g protein,0.8g fat,1.6g fiber,13.5g carbs"))
        arrayList.add(breakitem(R.drawable.brancreal, "Wheat bran cereal:92 cal,3g protein,23carb,0.7fat"))
        arrayList.add(breakitem(R.drawable.cheese, "cheese and nut bowl:191cal,9g protein,9.5g fat"))

        return arrayList
    }

}
