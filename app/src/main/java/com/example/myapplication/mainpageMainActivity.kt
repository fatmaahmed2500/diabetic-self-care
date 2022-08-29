package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class mainpageMainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var charItem: ArrayList<charItem>? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var alphaAdapters:AlphaAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage_main)

        recyclerView = findViewById(R.id.recycler_view_item)
        gridLayoutManager =
            GridLayoutManager(applicationContext,2, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        charItem = ArrayList()
        charItem = setAlphas()
        alphaAdapters = AlphaAdapter(applicationContext, charItem!!)
        recyclerView?.adapter = alphaAdapters
        alphaAdapters?.SetOnItemClickListener(object :AlphaAdapter.onItemClickListener{
            override fun onItemClick(position: Int ) {

                if (position == 0) {

                    val myintent = Intent(this@mainpageMainActivity,medicine::class.java)
                    startActivityForResult(myintent, 0)
                }
                if (position == 1) {

                    val myintent = Intent(this@mainpageMainActivity, factsMainActivity::class.java)
                    startActivityForResult(myintent, 0)
                }
                if (position == 2) {

                    val myintent = Intent(this@mainpageMainActivity, medicine::class.java)
                    startActivityForResult(myintent, 0)
                }
                if (position == 3) {

                    val myintent = Intent(this@mainpageMainActivity, testMainActivity::class.java)
                    startActivityForResult(myintent, 0)
                }
                if (position == 4) {

                    val myintent = Intent(this@mainpageMainActivity, mealMainActivity::class.java)
                    startActivityForResult(myintent, 0)
                }
                if (position == 5 ){

                    val myintent = Intent(this@mainpageMainActivity, exerciseMainActivity::class.java)
                    startActivityForResult(myintent, 0)
                }
            }

        })

    }

    private fun setAlphas(): ArrayList<charItem> {

        var arrayList: ArrayList<charItem> = ArrayList()

        arrayList.add(charItem(R.drawable.medicine, "Medication"))

        arrayList.add(charItem(R.drawable.facts, "Important facts"))
        arrayList.add(charItem(R.drawable.tips, "Tips"))
        arrayList.add(charItem(R.drawable.te, "Tests"))
        arrayList.add(charItem(R.drawable.meals, "Meals"))
        arrayList.add(charItem(R.drawable.ecercise, "Exercises"))

        return arrayList

    }
}