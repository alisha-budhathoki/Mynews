package com.example.androidlibraies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HoroscopeAdapter extends RecyclerView.Adapter<HoroscopeAdapter.MyViewHolder>{
    List<HoroscopeDatamodel> data;
    private Context mContext;

    public HoroscopeAdapter(Context context, List<HoroscopeDatamodel> data) {
        this.mContext = context;
        this.data = data;
    }
    @NonNull
    @Override
    public HoroscopeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_horoscope, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HoroscopeAdapter.MyViewHolder holder, int position) {
        final HoroscopeDatamodel horoscope = (HoroscopeDatamodel) data.get(position);
        try {
//            Glide
//                    .with((mContext) )
//                    .load("https://www.aahakhabar.com/files/horoscopes/" +horoscope.getFilename())
//                    .centerCrop()
//                    .into(holder.image);

//            Picasso.with(mContext).load("https://www.aahakhabar.com/files/horoscopes/" + horoscope.getFilename()).fit().centerCrop().into(holder.image);
            holder.description.setText(horoscope.getDescription());
            holder.title.setText(horoscope.getName());
            System.out.println("jdsdhhd");
            System.out.println(horoscope.getFilename());
//            holder.h_id.setText(String.valueOf(horoscope.getId()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return data.size();    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title, description, h_id;
        ImageView image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.txt_title);
            description = (TextView) itemView.findViewById(R.id.txt_body);
            image = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
