package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class testsadapter : RecyclerView.Adapter<testsadapter.ViewHolder>() {
    private var titles = arrayOf("Hemoglobin A1C Test", "Fasting Blood Sugar Test", "Glucose Tolerance Test", "Glucose Tolerance Test", "Random Blood Sugar Test")
    private var details = arrayOf("The A1C test measures your average blood sugar level over the past 2 or 3 months. An A1C below 5.7% is normal, between 5.7 and 6.4% indicates you have prediabetes, and 6.5% or higher indicates you have diabetes.", "This measures your blood sugar after an overnight fast (not eating). A fasting blood sugar level of 99 mg/dL or lower is normal, 100 to 125 mg/dL indicates you have prediabetes, and 126 mg/dL or higher indicates you have diabetes.", "This measures your blood sugar before and after you drink a liquid that contains glucose. You’ll fast (not eat) overnight before the test and have your blood drawn to determine your fasting blood sugar level. Then you’ll drink the liquid and have your blood sugar level checked 1 hour, 2 hours, and possibly 3 hours afterward. At 2 hours, a blood sugar level of 140 mg/dL or lower is considered normal, 140 to 199 mg/dL indicates you have prediabetes, and 200 mg/dL or higher indicates you have diabetes.", "This measures your blood sugar before and after you drink a liquid that contains glucose. You’ll fast (not eat) overnight before the test and have your blood drawn to determine your fasting blood sugar level. Then you’ll drink the liquid and have your blood sugar level checked 1 hour, 2 hours, and possibly 3 hours afterward. Results can differ depending on the size of the glucose drink and how often your blood sugar is tested. Ask your doctor what your test results mean", "This measures your blood sugar at the time you’re tested. You can take this test at any time and don’t need to fast (not eat) first. A blood sugar level of 200 mg/dL or higher indicates you have diabetes.")
    private val images  = intArrayOf(R.drawable.onee,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.testscard_layout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder:testsadapter .ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource (images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }
    inner class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        init {
            itemImage = itemView.findViewById(R.id.item_Image)
            itemTitle = itemView.findViewById(R.id.item_Title)
            itemDetail = itemView.findViewById(R.id.item_Detail)
        }
    }
}