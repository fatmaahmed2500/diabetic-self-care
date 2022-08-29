package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class medicine : AppCompatActivity() {private var recyclerView: RecyclerView? = null
private var medicineitem: ArrayList<medicineitem>? = null
private var gridLayoutManager: GridLayoutManager? = null
private var medicineadapters: medicineadapter? = null

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_medicine)

    recyclerView = findViewById(R.id.recycler_view_item)
//    gridLayoutManager = GridLayoutManager(applicationContext, 1, LinearLayoutManager.VERTICAL, false)
    //recyclerView?.layoutManager = gridLayoutManager
    //recyclerView?.setHasFixedSize(true)

    medicineitem = ArrayList()
    medicineitem = setAlphas()
    medicineadapters = medicineadapter(applicationContext, medicineitem!!)
    recyclerView ?.adapter = medicineadapters
}

private fun setAlphas(): ArrayList<medicineitem> {

    var arrayList: ArrayList<medicineitem> = ArrayList()
    arrayList.add(medicineitem(R.drawable.lantus1,"(Lantus) for children at least 6 years old with type 1 diabetes,should freeze,before meal"))


    arrayList.add(medicineitem(R.drawable.mix3, "(Maxtard)  The usual dose is between 0.3 and 1.0 international units per kilogram body weight per day,given once or twice a day"))
    arrayList.add(medicineitem(R.drawable.gal4,"(Galvus )  one dose of 50 mg in the morning and one dose of 50 mg in the evening,for type 2"))
    arrayList.add(medicineitem(R.drawable.vic5, "Victoza)  for type 2, 0.6 mg subcutaneously once a day for 1 week,Do not freeze "))
    arrayList.add(medicineitem(R.drawable.sax,"(Saxenda)  for type2 , not freeze , do not use Saxenda and Victoza togethe"))
    arrayList.add(medicineitem(R.drawable.novo2,"(Novarapid) type 1 and type 2,before meal,The usual dose is between 0.5 and 1.0 units per kilogram body weight per day"))
    arrayList.add(medicineitem(R.drawable.tre5,"(Tresible)  for type2 The recommended daily starting dose is 10 units, for1:used once daily with mealtime insulin"))
    arrayList.add(medicineitem(R.drawable.tra,"(trajenta)  for type2 , recommended doses:5 mg orally once a day"))
    return arrayList
}
}