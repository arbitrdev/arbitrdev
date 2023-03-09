package com.arbitrdev.wsc.data

import androidx.annotation.Keep

@Keep
data class EntityAppsflyerData(
    val isOrganic: Boolean,
    val naming: String?,
    val urlParams: List<android.util.Pair<String, String>>?,
    val fullStr: String
)
