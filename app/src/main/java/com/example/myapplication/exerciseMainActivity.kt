package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class exerciseMainActivity : AppCompatActivity() {

        private lateinit var newRecyclerView: RecyclerView
        private lateinit var newArrayList: ArrayList<News>
        lateinit var imageId: Array<Int>
        lateinit var textId: Array<String>
        lateinit var text2Id: Array<String>

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_exercise_main)
            imageId = arrayOf(
                R.drawable.aw,
                R.drawable.aew,
                R.drawable.aq,
                R.drawable.asa,
                R.drawable.aa,
                R.drawable.bb,
                R.drawable.ff,

                )
            textId = arrayOf(
                "Running",
                "jumping",
                "weight lifting",
                "wall sit",
                "squats",
                "weight lifting",
                "stertshing",

                )
            text2Id = arrayOf(
                "10:00",
                "05:00",
                "8 times for 3 groups",
                "15:00",
                "8 times for 3 groups",
                "8 times for 3 groups",
                "07:00",

                )
            newRecyclerView = findViewById(R.id.recyclerView)
            newRecyclerView.layoutManager = LinearLayoutManager(this)
            newRecyclerView.setHasFixedSize(true)
            newArrayList = arrayListOf<News>()
            getUserdata()


        }

        private fun getUserdata() {
            for (i in imageId.indices) {
                var news = News(imageId[i] ,textId[i] ,text2Id[i] )
                newArrayList.add(news)
            }


            newRecyclerView.adapter = Myadapter(newArrayList)

        }
    }