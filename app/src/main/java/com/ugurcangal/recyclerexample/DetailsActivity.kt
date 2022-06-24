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

        val intent = intent
        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark

        binding.nameTxt.text = selectedLandmark.name
        binding.countryTxt.text = selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)

    }
}