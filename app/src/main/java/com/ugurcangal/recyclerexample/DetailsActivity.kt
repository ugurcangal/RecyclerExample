package com.ugurcangal.recyclerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ugurcangal.recyclerexample.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val selectedLandmark = MySingleton.chosenLandmark

        selectedLandmark?.let {
            binding.nameTxt.text = it.name
            binding.countryTxt.text = it.country
            binding.imageView.setImageResource(it.image)
        }
    }
}