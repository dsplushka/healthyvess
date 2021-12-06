package com.darushina.healthyvess

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val mealList: List<Meal>) : RecyclerView.Adapter<MealViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MealViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: MealViewHolder, position: Int) {
        val meal: Meal = mealList[position]
        holder.bind(meal)

    }

    override fun getItemCount(): Int = mealList.size

}

class MealViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item, parent, false)) {
    private var mTitleView: TextView? = null
    private var mCholesterolView: TextView? = null


    init {
        mTitleView = itemView.findViewById(R.id.list_title)
        mCholesterolView = itemView.findViewById(R.id.list_cholesterol)
    }

    fun bind(meal: Meal) {
        mTitleView?.text = meal.title
        mCholesterolView?.text = meal.cholesterol.toString()


    }

}