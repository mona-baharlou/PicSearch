package com.mona.picsearch.data.model

import com.google.gson.annotations.SerializedName

data class PhotoResponse(
    @SerializedName("photos")
    val photos: Photos
)