package com.example.gpus.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class GraphicsCards (
    @StringRes val stringResourceId : Int,
    @DrawableRes val imageResourceId : Int
)