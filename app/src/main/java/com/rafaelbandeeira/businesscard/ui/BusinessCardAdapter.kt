package com.rafaelbandeeira.businesscard.ui

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.rafaelbandeeira.businesscard.data.BusinessCard
import com.rafaelbandeeira.businesscard.databinding.ItemBusinessCardBinding

class BusinessCardAdapter :
    ListAdapter<BusinessCard, BusinessCardAdapter.ViewHolder>(DiffCallback()) {

    var listenerShare: (View) -> Unit = {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBusinessCardBinding.inflate(inflater, parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(
        private val binding: ItemBusinessCardBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: BusinessCard) {
            binding.apply {
                txtNome.text = item.nome
                txtTelefone.text = item.telefone
                txtCargo.text = item.cargo
                txtEmpresa.text = item.empresa
                cardContent.setCardBackgroundColor(Color.parseColor(item.background))
                cardContent.setOnClickListener {
                    listenerShare(it)
                }
            }
        }
    }
}

class DiffCallback : DiffUtil.ItemCallback<BusinessCard>() {
    override fun areItemsTheSame(
        oldItem: BusinessCard,
        newItem: BusinessCard
    ) = oldItem == newItem

    override fun areContentsTheSame(
        oldItem: BusinessCard,
        newItem: BusinessCard
    ) = oldItem.id == newItem.id
}