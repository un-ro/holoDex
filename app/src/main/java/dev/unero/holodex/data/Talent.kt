package dev.unero.holodex.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDate

@Parcelize
data class Talent(
    val name: String,
    val group: String,
    val region: String,
    val debutDate: LocalDate,
    val description: String,
    val youtube: String,
    val photo: String,
): Parcelable
