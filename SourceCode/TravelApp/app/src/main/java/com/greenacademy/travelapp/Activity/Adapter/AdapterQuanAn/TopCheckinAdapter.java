package com.greenacademy.travelapp.Activity.Adapter.AdapterQuanAn;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.greenacademy.travelapp.Activity.Model.QuanAnChiTiet;
import com.greenacademy.travelapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by User on 1/17/2017.
 */

public class TopCheckinAdapter extends RecyclerView.Adapter<TopCheckinAdapter.LoaiQuanViewHolder> {
    private ArrayList<QuanAnChiTiet> listData = new ArrayList<QuanAnChiTiet>();
    private Context context;
    public TopCheckinAdapter(ArrayList<QuanAnChiTiet> listData, Context context) {
        this.listData = listData;
        this.context = context;
    }

    @Override
    public LoaiQuanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.dong_top_checkin, parent, false);
        return new LoaiQuanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LoaiQuanViewHolder holder, int position) {
        Picasso.with(context).load(listData.get(position).getLinkAnh()).into(holder.imgHinhLoaiQuan);
        holder.txtTenNhanHangTop.setText(listData.get(position).getTenQuanAn());
        holder.txtLuotDanhGiaTop.setText("Lượt đánh giá: " + listData.get(position).getDanhGia());
        holder.txtMotaTop.setText(listData.get(position).getMoTa());
        holder.txtLuotCheckinTop.setText("Lượt check in: " + listData.get(position).getCheckIn());
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class LoaiQuanViewHolder extends RecyclerView.ViewHolder{
        ImageView imgHinhLoaiQuan;
        TextView txtTenNhanHangTop, txtLuotDanhGiaTop, txtMotaTop, txtLuotCheckinTop;

        public LoaiQuanViewHolder(View itemView) {
            super(itemView);
            imgHinhLoaiQuan = (ImageView) itemView.findViewById(R.id.imageViewTatca);
            txtTenNhanHangTop = (TextView) itemView.findViewById(R.id.textViewTenNhaHangTop);
            txtLuotDanhGiaTop = (TextView) itemView.findViewById(R.id.textViewLuotDanhGiaTop);
            txtMotaTop = (TextView) itemView.findViewById(R.id.textViewMotaTop);
            txtLuotCheckinTop = (TextView) itemView.findViewById(R.id.textViewLuotCheckinTop);
        }
    }
}
