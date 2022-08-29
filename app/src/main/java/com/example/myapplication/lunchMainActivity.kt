package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class lunchMainActivity : AppCompatActivity() {private var recyclerView: RecyclerView? = null
    private var lunchitem: ArrayList<lunchitem>? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var lunchadapters: lunchadapter? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lunch_main)
        recyclerView = findViewById(R.id.recycler_view_item)
        gridLayoutManager = GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        lunchitem = ArrayList()
        lunchitem = setAlphas()
        lunchadapters= lunchadapter(applicationContext, lunchitem!!)
        recyclerView?.adapter = lunchadapters



    }

    private fun setAlphas(): ArrayList<lunchitem> {

        var arrayList: ArrayList<lunchitem> = ArrayList()

        arrayList.add(lunchitem(R.drawable.maggi, "Maggi (sugar:9.96g,kcal:628.46)"))

        arrayList.add(lunchitem(R.drawable.noodle, "Vegetable Noodles(sugar:6.69g,kcal:339.18)"))
        arrayList.add(lunchitem(R.drawable.chicken, " chicken pasta with sun dried tomatos (sugar:18g,kcal:349)"))
        arrayList.add(lunchitem(R.drawable.rata, "pumbkin Rataouille (sugar:5.30g,kcal:200.95)"))
        arrayList.add(lunchitem(R.drawable.carry, "Pumbkin curry and rice(sugar:20g,kcal:378.4"))
        arrayList.add(lunchitem(R.drawable.salmon, "Grilled salmon with kebab (sugar:0g,kcal:185)"))

        return arrayList
    }

}
