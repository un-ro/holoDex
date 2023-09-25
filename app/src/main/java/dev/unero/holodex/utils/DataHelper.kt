package dev.unero.holodex.utils

import dev.unero.holodex.data.Talent
import java.time.LocalDate

object DataHelper {
    fun talents(): List<Talent> = listOf(
        Talent(
            "Amelia Watson",
            "EN",
            "Hololive EN",
            LocalDate.of(2020, 9, 12),
            "Smug Detective",
            "https://www.youtube.com/channel/UCyl1z3jo3XHR1riLFKG5UAg",
            "https:/"
        ),
        Talent(
            "Gawr Gura",
            "EN",
            "Hololive EN",
            LocalDate.of(2020, 9, 13),
            "Cute Shark",
            "https://www.youtube.com/channel/UCyl1z3jo3XHR1riLFKG5UAg",
            "https:/"
        )
    )

    fun searchTalent(query: String): List<Talent> {
        val talents = talents()

        return talents.filter { talent ->
            talent.name.contains(query, true) ||
                    talent.group.contains(query, true) ||
                    talent.region.contains(query, true)
        }
    }
}