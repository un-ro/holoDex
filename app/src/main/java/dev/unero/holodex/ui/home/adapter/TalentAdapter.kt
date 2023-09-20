package dev.unero.holodex.ui.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import dev.unero.holodex.R
import dev.unero.holodex.data.Talent
import dev.unero.holodex.databinding.ItemTalentBinding
import dev.unero.holodex.ui.home.HomeFragmentDirections

class TalentAdapter(
    private var data: List<Talent>,
    private val context: Context
): RecyclerView.Adapter<TalentAdapter.ViewHolder>() {

    fun setData(newData: List<Talent>) {
        data = newData
    }

    class ViewHolder(
        private val binding: ItemTalentBinding,
        private val context: Context
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(talent: Talent) {
            binding.apply {
                tvTalentName.text = talent.name
                tvTalentGroup.text = context.getString(
                    R.string.format_group, talent.group, talent.region
                )

                root.setOnClickListener {
                    val action = HomeFragmentDirections.actionHomeToDetail(talent)
                    it.findNavController().navigate(action)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemTalentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding, context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size
}