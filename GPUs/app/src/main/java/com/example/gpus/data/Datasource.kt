package com.example.gpus.data

import com.example.gpus.R
import com.example.gpus.model.GraphicsCards

class Datasource {
    fun loadGraphicsCards(): List<GraphicsCards> {
        return listOf<GraphicsCards>(
            GraphicsCards(R.string.gpu1, R.drawable.imggpu1),
            GraphicsCards(R.string.gpu2, R.drawable.imggpu2),
            GraphicsCards(R.string.gpu3, R.drawable.imggpu3),
            GraphicsCards(R.string.gpu4, R.drawable.imggpu4),
            GraphicsCards(R.string.gpu5, R.drawable.imggpu5),
            GraphicsCards(R.string.gpu6, R.drawable.imggpu6),
            GraphicsCards(R.string.gpu7, R.drawable.imggpu7),
            GraphicsCards(R.string.gpu8, R.drawable.imggpu8),
            GraphicsCards(R.string.gpu9, R.drawable.imggpu9),
            GraphicsCards(R.string.gpu10, R.drawable.imggpu10)
        )
    }
}