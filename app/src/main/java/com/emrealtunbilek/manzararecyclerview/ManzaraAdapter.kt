package com.emrealtunbilek.manzararecyclerview

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

/**
 * Created by Emre on 31.12.2017.
 */
class ManzaraAdapter: RecyclerView.Adapter<ManzaraAdapter.ManzaraViewHolder>() {


    override fun getItemCount(): Int {
        return 0
    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ManzaraViewHolder? {
        return null
    }



    override fun onBindViewHolder(holder: ManzaraViewHolder?, position: Int) {

    }





    class ManzaraViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {



    }


}