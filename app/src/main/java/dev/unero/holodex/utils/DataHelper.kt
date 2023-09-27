package dev.unero.holodex.utils

import dev.unero.holodex.R
import dev.unero.holodex.data.Talent
import java.time.LocalDate

object DataHelper {
    fun talents(): List<Talent> = listOf(
        Talent(
            "Ayunda Risu",
            "ID Gen 1",
            "ID",
            LocalDate.of(2020, 5, 10),
            R.string.desc_risdu,
            "https://www.youtube.com/channel/UCOyYb1c43VlX9rc_lT6NKQw",
            "https://hololive.hololivepro.com/wp-content/uploads/2022/04/リス-1.png"

        ),
        Talent(
            "Amelia Watson",
            "Myth",
            "EN",
            LocalDate.of(2020, 9, 12),
            R.string.desc_ame,
            "https://www.youtube.com/channel/UCyl1z3jo3XHR1riLFKG5UAg",
            "https://hololive.hololivepro.com/wp-content/uploads/2022/04/アメリア.png"
        ),
        Talent(
            "Gawr Gura",
            "Myth",
            "EN",
            LocalDate.of(2020, 9, 13),
            R.string.desc_gura,
            "https://www.youtube.com/channel/UCoSrY_IQQVpmIRZ9Xf-y93g",
            "https://hololive.hololivepro.com/wp-content/uploads/2022/04/ぐら.png"
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