package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class factsrecyclerAdapter : RecyclerView.Adapter<factsrecyclerAdapter.ViewHolder>() {
    private var titles = arrayOf("THERE ARE 3 TYPES", "THE VAST MAJORITY OF PEOPLE WITH DIABETES HAVE TYPE 2 DIABETES", "DIABETES IS A LEADING CAUSE OF DEATH IN THE WORLD", "TYPE 1 DIABETES IS MOST COMMON IN YOUNG PEOPLE","TYPE 2 DIABETES IS PREVENTABLE", "CASES OF TYPE 2 DIABETES HAVE DOUBLED IN AMERICA IN THE PAST 20 YEARS")
    private var details = arrayOf("Diabetes has 3 types: Type 1, Type 2 and gestational. Type 1 diabetes is an autoimmune disease in which your body doesn’t produce insulin for itself at all, because the immune system is attacking the cells in the pancreas that create insulin. People with Type 1 diabetes must take insulin every day to be able to live. Type 2 diabetes is caused when the body can’t make enough insulin for the body, and is most common in individuals over the age of 45. The final type is gestational diabetes, which occurs only in women during pregnancy, and goes away after the baby is born. However, women who have had gestational diabetes are more at risk for Type 2 diabetes after they give birth. Over 420 million people in the world have some form of diabetes.", "About 90-95 percent of people with diabetes have Type 2, while about 5 percent have Type 1, and the remainder have gestational diabetes.\n", "While diabetes—and the complications of it—is the number 7 cause of death in the United States, it has a much higher mortality rate in the rest of the world. This is especially true in middle- to low-income countries, as these countries are often unable to access proper treatment for this condition.", "Type 1 diabetes usually develops early in life, and has been known previously as insulin-dependent or juvenile diabetes. It’s most common in African Americans and Hispanics/Latinos.", "Risk factors for Type 2 diabetes include aging and being overweight or obese, though as youth obesity rates rise, so do cases of early-onset Type 2 diabetes. Staying healthy through proper diet and about 30 minutes of exercise every day or on most days can drastically decrease your chance of getting Type 2 diabetes.","Causes for this are the high and increasing rate of obesity in America. Also, a large percentage of the American population is advancing in age.")
    private val images  = intArrayOf(R.drawable.onee,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): factsrecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.factscard_layout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder:factsrecyclerAdapter .ViewHolder, position: Int) {
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

