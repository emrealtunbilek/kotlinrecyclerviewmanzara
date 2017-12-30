package com.emrealtunbilek.manzararecyclerview

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.tek_satir_manzara.view.*

/**
 * Created by Emre on 31.12.2017.
 */
class ManzaraAdapter(tumManzaralar:ArrayList<Manzara>): RecyclerView.Adapter<ManzaraAdapter.ManzaraViewHolder>() {

    var manzaralar=tumManzaralar

    override fun getItemCount(): Int {
        return manzaralar.size
    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ManzaraViewHolder? {

        var inflater=LayoutInflater.from(parent?.context)
        var tekSatirmanzara=inflater.inflate(R.layout.tek_satir_manzara, parent, false)

        return ManzaraViewHolder(tekSatirmanzara)


    }



    override fun onBindViewHolder(holder: ManzaraViewHolder?, position: Int) {

        holder?.manzaraBaslik?.text = manzaralar.get(position).baslik
        holder?.manzaraAciklama?.text = manzaralar.get(position).aciklama
        holder?.manzaraResim?.setImageResource(manzaralar.get(position).resim)


    }





    class ManzaraViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var tekSatirManzara = itemView as CardView

        var manzaraBaslik=tekSatirManzara.tvManzaraBaslik
        var manzaraAciklama=tekSatirManzara.tvManzaraAciklama
        var manzaraResim = tekSatirManzara.imgManzara


    }


}