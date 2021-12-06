package com.darushina.healthyvess

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.list_item.*

data class Meal(val title: String, val cholesterol: Int)

class MainFragment : Fragment() {

    private val mealList = listOf(
        Meal("Яичница", 100),
        Meal("Кофе с молоком", 50),
        Meal("Яблоко", 0),
        Meal("Борщ", 150),
        Meal("Пельмени", 200),
        Meal("Пицца", 300),
        Meal("Макароны по-флотски", 150),
        Meal("Чай", 0),
        Meal("Гречка отварная", 0),
        Meal("Суп рассольник", 150),
        Meal("Запеченая курица", 300),
        Meal("Свинина тушеная", 300),
        Meal("Капуста тушеная", 50),
        Meal("Хек паровой", 50),
        Meal("Кисель ягодный", 0),
        Meal("Хлеб черный", 10)
    )

    lateinit var userRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        userRecyclerView = view.findViewById(R.id.list_recycler_view)
        userRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        userRecyclerView.adapter = ListAdapter(mealList)
        userRecyclerView.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
        )

        return view
    }

}


