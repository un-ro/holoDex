package dev.unero.holodex.utils

import dev.unero.holodex.R
import dev.unero.holodex.data.Talent
import java.time.LocalDate

object DataHelper {
    fun talents(): List<Talent> = listOf(
        Talent(
            "Ayunda Risu",
            "Gen 1st",
            "ID",
            LocalDate.of(2020, 5, 10),
            R.string.desc_risdu,
            "https://www.youtube.com/channel/UCOyYb1c43VlX9rc_lT6NKQw",
            "https://hololive.hololivepro.com/wp-content/uploads/2022/04/リス-1.png"
        ),
        Talent(
            "Anya Melfissa",
            "Gen 2nd",
            "ID",
            LocalDate.of(2020, 12, 5),
            R.string.desc_anya,
            "https://www.youtube.com/channel/UCOyYb1c43VlX9rc_lT6NKQw",
            "https://hololive.hololivepro.com/wp-content/uploads/2020/07/Anya-Melfissa_list_thumb.png"
        ),
        Talent(
            "Kureiji Ollie",
            "Gen 2nd",
            "ID",
            LocalDate.of(2020, 12, 4),
            R.string.desc_ollie,
            "https://www.youtube.com/channel/UCYz_5n-uDuChHtLo7My1HnQ",
            "https://hololive.hololivepro.com/wp-content/uploads/2020/07/Kureiji-Ollie_list_thumb.png"
        ),
        Talent(
            "Vestia Zeta",
            "Gen 3rd",
            "ID",
            LocalDate.of(2022, 3, 25),
            R.string.desc_zeta,
            "https://www.youtube.com/channel/UCTvHWSfBZgtxE4sILOaurIQ",
            "https://hololive.hololivepro.com/wp-content/uploads/2022/03/1_ベスティア・ゼータ.png"
        ),
        Talent(
            "Kobo Kanaeru",
            "Gen 3rd",
            "ID",
            LocalDate.of(2022, 3, 27),
            R.string.desc_kobo,
            "https://www.youtube.com/channel/UCjLEmnpCNeisMxy134KPwWw",
            "https://hololive.hololivepro.com/wp-content/uploads/2022/03/3_こぼ・かなえる.png"
        ),
        Talent(
            "Amelia Watson",
            "Myth",
            "EN",
            LocalDate.of(2020, 9, 13),
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
        ),
        Talent(
            "Takane Lui",
            "holoX",
            "JP",
            LocalDate.of(2021, 11, 27),
            R.string.desc_lui,
            "https://www.youtube.com/channel/UCs9_O1tRPMQTHQ-N_L6FU2g",
            "https://hololive.hololivepro.com/wp-content/uploads/2020/07/Takane-Lui_list_thumb.png"
        ),
        Talent(
            "Oozora Subaru",
            "Gen 2nd",
            "JP",
            LocalDate.of(2020, 5, 10),
            R.string.desc_subaru,
            "https://www.youtube.com/channel/UCvzGlP9oQwU--Y0r9id_jnA",
            "https://hololive.hololivepro.com/wp-content/uploads/2023/04/Oozora-Subaru_list_thumb.png"
        ),
        Talent(
            "Tokino Sora",
            "Gen 0",
            "JP",
            LocalDate.of(2017, 9, 7),
            R.string.desc_sora,
            "https://www.youtube.com/channel/UCp6993wxpyDPHUpavwDFqgg",
            "https://hololive.hololivepro.com/wp-content/uploads/2021/05/tokino_sora_thumb.png"
        ),
        Talent(
            "Hoshimachi Suisei",
            "Gen 0",
            "JP",
            LocalDate.of(2018, 3, 22),
            R.string.desc_sui,
            "https://www.youtube.com/channel/UC5CwaMl1eIgY8h02uZw7u8A",
            "https://hololive.hololivepro.com/wp-content/uploads/2023/04/Hoshimachi-Suisei_list_thumb-1.png"
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