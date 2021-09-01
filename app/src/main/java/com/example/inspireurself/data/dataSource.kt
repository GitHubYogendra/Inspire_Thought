package com.example.inspireurself.data

import com.example.inspireurself.R
import com.example.inspireurself.model.affimation

class dataSource {
    fun loadAffirmations() : List<affimation> {
        return listOf<affimation>(
            affimation(R.string.affirmation1,R.drawable.image1),
            affimation(R.string.affirmation2,R.drawable.image2),
            affimation(R.string.affirmation3,R.drawable.image3),
            affimation(R.string.affirmation4,R.drawable.image4),
            affimation(R.string.affirmation5,R.drawable.image5),
            affimation(R.string.affirmation6,R.drawable.image6),
            affimation(R.string.affirmation7,R.drawable.image7),
            affimation(R.string.affirmation8,R.drawable.image8),
            affimation(R.string.affirmation9,R.drawable.image9),
            affimation(R.string.affirmation10,R.drawable.image10)
        )

    }
}