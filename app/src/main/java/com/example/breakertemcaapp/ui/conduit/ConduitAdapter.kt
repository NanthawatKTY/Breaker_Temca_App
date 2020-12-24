package com.example.breakertemcaapp.ui.conduit

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.breakertemcaapp.R
import kotlinx.android.synthetic.main.item_conduit_lists.view.*

class ConduitAdapter : RecyclerView.Adapter<ConduitAdapter.ViewHolder>(){

    private val kode = arrayOf("d116df5", "36ffc75", "f5cfe78")

    private val kategori = arrayOf("Kekayaan", "Teknologi", "Keluarga", )

    private val isi = arrayOf("pertanyaan 9", "pertanyaan 11", "pertanyaan 17")

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemKode: TextView
        var itemKategori: TextView
        var itemIsi: TextView


        init {
            itemKode = itemView.findViewById(R.id.edtCableType)
            itemKategori = itemView.findViewById(R.id.edtCableSize)
            itemIsi = itemView.findViewById(R.id.edtCableAmount)

//            itemView.setOnClickListener {
//                var position: Int = adapterPosition
//                val context = itemView.context
//                val intent = Intent(context, DetailPertanyaan::class.java).apply {
//                    putExtra("NUMBER", position)
//                    putExtra("CODE", itemKode.text)
//                    putExtra("CATEGORY", itemKategori.text)
//                    putExtra("CONTENT", itemIsi.text)
//                }
//                context.startActivity(intent)
//            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_conduit_cal_list, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemKode.text = kode[position]
        viewHolder.itemKategori.text = kategori[position]
        viewHolder.itemIsi.text = isi[position]

    }

    override fun getItemCount(): Int {
        return kode.size
    }
}