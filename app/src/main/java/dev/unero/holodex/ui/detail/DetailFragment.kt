package dev.unero.holodex.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import coil.load
import dev.unero.holodex.R
import dev.unero.holodex.data.Talent
import dev.unero.holodex.databinding.FragmentDetailBinding
import java.time.format.DateTimeFormatter

class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding as FragmentDetailBinding

    private val args: DetailFragmentArgs by navArgs()
    private val talent by lazy { args.talent }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val actionBar = (requireActivity() as AppCompatActivity).supportActionBar
        actionBar?.title = talent.name

        setupUI(talent)
    }

    private fun setupUI(talent: Talent) {
        binding.apply {
            tvTalentBirthdate.text = talent.birthday.format(DateTimeFormatter.ofPattern("dd MMMM"))
            tvTalentDebut.text = talent.debutDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"))
            tvTalentGroup.text = getString(R.string.format_group, talent.region, talent.group)
            tvTalentDescription.text = getText(talent.description)

            ivTalentAvatar.apply {
                load(talent.photo)
                contentDescription = talent.name
            }

            btnYoutube.setOnClickListener {
                requireContext().startActivity(
                    talent.youtube.let { yt ->
                        android.content.Intent(
                            android.content.Intent.ACTION_VIEW,
                            android.net.Uri.parse(yt)
                        )
                    }
                )
            }

            btnShare.setOnClickListener {
                requireContext().startActivity(
                    android.content.Intent.createChooser(
                        android.content.Intent().apply {
                            action = android.content.Intent.ACTION_SEND
                            putExtra(
                                android.content.Intent.EXTRA_TEXT,
                                getString(R.string.format_share, talent.region, talent.name, talent.youtube)
                            )
                            type = "text/plain"
                        },
                        getString(R.string.btn_lbl_share)
                    )
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}