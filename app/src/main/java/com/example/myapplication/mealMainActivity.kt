package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class mealMainActivity : AppCompatActivity() {
    private  var recyclerView: RecyclerView? = null
    private var Mealitem: ArrayList<Mealitem>? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var mealadapters: mealadapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meals_main)
        recyclerView = findViewById(R.id.recycler_view_item)
        gridLayoutManager =
            GridLayoutManager(applicationContext, 1, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        Mealitem = ArrayList()
        Mealitem = setAlphas()
        mealadapters = mealadapter(applicationContext, Mealitem!!)
        recyclerView?.adapter = mealadapters



        mealadapters?.SetOnItemClickListener(object : mealadapter.onItemClickListener {
            override fun onItemClick(position: Int) {

                if (position == 0) {

                    val myintent = Intent(this@mealMainActivity, breakfastMainActivity::class.java)
                    startActivityForResult(myintent, 0)
                }
                if (position == 1) {

                    val myintent = Intent(this@mealMainActivity, lunchMainActivity::class.java)
                    startActivityForResult(myintent, 0)
                }
                if (position == 2) {

                    val myintent = Intent(this@mealMainActivity, dinnerMainActivity::class.java)
                    startActivityForResult(myintent, 0)


                }

                // fun setAlphas(): ArrayList<Mealitem> {

            }
        })
    }
    private fun setAlphas(): ArrayList<Mealitem>? {
        var arrayList: ArrayList<Mealitem> = ArrayList()

        arrayList.add(Mealitem(R.drawable.breakfast, "Breakfast"))

        arrayList.add(Mealitem(R.drawable.lunch2, "Lunch"))
        arrayList.add(
            Mealitem(
                R.drawable.dinner,
                "Dinner"))

        return arrayList
    }



}
