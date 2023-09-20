package dev.unero.holodex.utils

import dev.unero.holodex.data.Talent
import java.util.Date

object TalentGenerator {
    fun talents(): List<Talent> = listOf(
        Talent(
            "Amelia Watson",
            "EN",
            "Hololive EN",
            Date(2020, 9, 13),
            "Smug Detective",
            "https://www.youtube.com/channel/UCyl1z3jo3XHR1riLFKG5UAg",
            "https:/"
        ),
        Talent(
            "Gawr Gura",
            "EN",
            "Hololive EN",
            Date(2020, 9, 13),
            "Cute Shark",
            "https://www.youtube.com/channel/UCyl1z3jo3XHR1riLFKG5UAg",
            "https:/"
        )
    )
}