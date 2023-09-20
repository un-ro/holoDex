package dev.unero.holodex.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.Date

@Parcelize
data class Talent(
    val name: String,
    val group: String,
    val region: String,
    val debutDate: Date,
    val description: String,
    val youtube: String,
    val photo: String,
): Parcelable
