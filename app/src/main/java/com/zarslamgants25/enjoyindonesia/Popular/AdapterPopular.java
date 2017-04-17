package com.zarslamgants25.enjoyindonesia.Popular;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zarslamgants25.enjoyindonesia.R;

import java.util.List;

/**
 * Created by WIN10 on 23/03/2017.
 */

public class AdapterPopular extends RecyclerView.Adapter<AdapterPopular.ViewHolder> {

    private List<ListPopular> listPopulars;
    private Context context;

    public AdapterPopular(List<ListPopular> listPopulars, Context context) {
        this.listPopulars = listPopulars;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_popular, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ListPopular listPopular = listPopulars.get(position);

        holder.tvNamaWisata.setText(listPopular.getNamaWisata());
        holder.tvLokasi.setText(listPopular.getLokasiWisata());
        holder.tvJenisWisata.setText(listPopular.getJenisWisata());
    }

    @Override
    public int getItemCount() {
        return listPopulars.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView tvNamaWisata;
        public TextView tvLokasi;
        public TextView tvJenisWisata;

        public ViewHolder(View itemView) {
            super(itemView);

            tvNamaWisata = (TextView)itemView.findViewById(R.id.tvNamaWisata);
            tvNamaWisata = (TextView)itemView.findViewById(R.id.lokasi);
            tvNamaWisata = (TextView)itemView.findViewById(R.id.jenis_wisata);
        }
    }
}
