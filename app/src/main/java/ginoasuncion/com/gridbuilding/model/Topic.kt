package ginoasuncion.com.gridbuilding.model

import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val topicNumber: Int,
    @DrawableRes val imageResourceId: Int,
)