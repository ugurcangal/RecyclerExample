package com.ugurcangal.recyclerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ugurcangal.recyclerexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        val pisa = Landmark("Pisa", "Italy", R.drawable.pisa)
        val collesium = Landmark("Collesium", "Italy", R.drawable.collesium)
        val eiffel = Landmark("Eiffel Tower", "France", R.drawable.eiffel)
        val londonBridge = Landmark("London Bridge", "UK", R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(collesium)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkRecyclerAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter
    }
}