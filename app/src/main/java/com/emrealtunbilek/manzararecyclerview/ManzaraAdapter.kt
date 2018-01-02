package com.emrealtunbilek.manzararecyclerview

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.tek_satir_manzara.view.*

/**
 * Created by Emre on 31.12.2017.
 */
class ManzaraAdapter(tumManzaralar: ArrayList<Manzara>) : RecyclerView.Adapter<ManzaraAdapter.ManzaraViewHolder>() {

    var manzaralar = tumManzaralar

    override fun getItemCount(): Int {

      //  Log.e("RECYCLERVIEW", "GET ITEM COUNT TETIKLENDI")
        return manzaralar.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ManzaraViewHolder? {

        var inflater = LayoutInflater.from(parent?.context)
        var tekSatirmanzara = inflater.inflate(R.layout.tek_satir_manzara, parent, false)

        Log.e("RECYCLERVIEW", "ON CREATE VIEW HOLDER TETIKLENDI")
        return ManzaraViewHolder(tekSatirmanzara)


    }


    override fun onBindViewHolder(holder: ManzaraViewHolder?, position: Int) {


        var oanOlusturulanManzara = manzaralar.get(position)
        holder?.setData(oanOlusturulanManzara, position)

        /*  holder?.manzaraBaslik?.text = manzaralar.get(position).baslik
          holder?.manzaraAciklama?.text = manzaralar.get(position).aciklama
          holder?.manzaraResim?.setImageResource(manzaralar.get(position).resim)
          Log.e("RECYCLERVIEW", "ON BIND VIEW HOLDER TETIKLENDI")*/


    }


   inner class ManzaraViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var tekSatirManzara = itemView as CardView

        var manzaraBaslik = tekSatirManzara.tvManzaraBaslik
        var manzaraAciklama = tekSatirManzara.tvManzaraAciklama
        var manzaraResim = tekSatirManzara.imgManzara
        var btnKopyala = tekSatirManzara.imgKopyala
        var btnSil = tekSatirManzara.imgSil


        init {
            Log.e("RECYCLERVIEW", "Manzara view holder TETIKLENDI")
        }

        fun setData(oankiManzara: Manzara, position: Int) {


            manzaraBaslik.text = oankiManzara.baslik
            manzaraAciklama.text = oankiManzara.aciklama
            manzaraResim.setImageResource(oankiManzara.resim)

            btnKopyala.setOnClickListener {

                manzaralar.add(position, oankiManzara)
                notifyItemInserted(position)
                notifyItemRangeChanged(position, manzaralar.size)
               // notifyDataSetChanged()

            }

            btnSil.setOnClickListener {

                Log.e("EMRE", "Silinmeden önce item pos : "+position + " Liste size : " + manzaralar.size)
                manzaralar.removeAt(position)
                Log.e("EMRE", "Silinmeden sonra item pos : "+position + " Liste size : " + manzaralar.size)
               notifyItemRemoved(position)
                notifyItemRangeChanged(position,manzaralar.size)
               // notifyDataSetChanged()


            }



        }


    }


}