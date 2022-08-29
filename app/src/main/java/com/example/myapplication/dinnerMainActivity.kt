package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class dinnerMainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var charItem2: ArrayList<Charitem2>? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var alphaAdapters: Alphaadapter2? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dinner_main)
        recyclerView = findViewById(R.id.recycler_view_item)
        gridLayoutManager = GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        charItem2 = ArrayList()
        charItem2 = setAlphas()
        alphaAdapters = Alphaadapter2(applicationContext, charItem2!!)
        recyclerView?.adapter = alphaAdapters

    }

    private fun setAlphas(): ArrayList<Charitem2> {

        var arrayList: ArrayList<Charitem2> = ArrayList()

        arrayList.add(Charitem2(R.drawable.salad, "Broccoli Salad:82 cal, 14.7g carbs, 5.9g protein, 12.4g fat, 3.6g fiber"))

        arrayList.add(Charitem2(R.drawable.vtacos, "Vegetarian Lentil Tacos: 45 cal, 2g fat, 23g carbs, 10g fiber, 2g sugar, 8g protein"))
        arrayList.add(Charitem2(R.drawable.salmon2, "Lemon Garlic Salmon:294 cal, 9g carbs, 29g protein, 17g fat, 2g fiber,2g sugar"))
        arrayList.add(Charitem2(R.drawable.lettus, "Chicken Burger Lettuce Wraps: 242cal, 11g fat,11g carbs, 2g fiber, 11g sugar"))
        arrayList.add(Charitem2(R.drawable.tso, "healthy chicken:207 cal, 10g carbs, 12g protein,7g sugar"))
        arrayList.add(Charitem2(R.drawable.chic, "Chicken Veggie Stir-Fry:220 cal, 11g carbs, 26g protein, 3g sugar, 3g fiber, 9g fat"))

        return arrayList
    }

}
