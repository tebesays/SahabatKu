package com.example.toshiba.sahabatku.adapter;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.toshiba.sahabatku.R;
import com.example.toshiba.sahabatku.model.SahabatModel;

import java.util.List;

public class SahabatAdapter extends RecyclerView.Adapter<SahabatAdapter.MakananViewHolder>
{
    private Context mCtx2;
    private List<SahabatModel> SahabatList;

    public SahabatAdapter(Context mCtx2, List<SahabatModel> SahabatList)
    {
        this.mCtx2 = mCtx2;
        this.SahabatList = SahabatList;
    }

    class MakananViewHolder extends RecyclerView.ViewHolder
    {
        TextView namasahabat, desksahabat;
        ImageView gambar;
        ConstraintLayout layout1;

        public MakananViewHolder(View itemView)
        {
            super(itemView);
            namasahabat = itemView.findViewById(R.id.judulmakan);
            desksahabat = itemView.findViewById(R.id.hargamakan);
            gambar = itemView.findViewById(R.id.gambarmakan);
            layout1 = itemView.findViewById(R.id.klikmakan);
        }
    }

    @Override
    public MakananViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(mCtx2);
        View view = inflater.inflate(R.layout.rv_sahabat,null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lp);
        return new MakananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MakananViewHolder holder, int position)
    {
        final SahabatModel rSahabat = SahabatList.get(position);

        Glide.with(mCtx2)
                .load(rSahabat.getFoto_shbt())
                .into(holder.gambar);

        holder.namasahabat.setText(rSahabat.getNama_shbt());
        holder.desksahabat.setText(rSahabat.getDeskripsi_shbt());

        holder.layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(mCtx2, DetailMakanan.class);
//                intent.putExtra("idprod", String.valueOf(rSahabat.getIdprod()));
//                intent.putExtra("Namasahabat", rSahabat.getJudul());
//                intent.putExtra("Hargasahabat", String.valueOf(rSahabat.getHarga()));
//                intent.putExtra("Statussahabat", rSahabat.getStatus());
//                intent.putExtra("Gambar",rSahabat.getFoto());
//                intent.putExtra("jaraksahabat",rSahabat.getJarak());
//                mCtx2.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount(){ return SahabatList.size();}
}
