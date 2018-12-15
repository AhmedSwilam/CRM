package com.bartech.crm.sa.data.network.model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bartech.crm.sa.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ahmed on 6/11/2018.
 */

public class GetDevicesRecyclerAdapter extends RecyclerView.Adapter<GetDevicesRecyclerAdapter.RecyclerViewHolder> {

    private Context context;
    public ArrayList<DatumDevices> datumDevices;

    public GetDevicesRecyclerAdapter(Context mContext, ArrayList<DatumDevices> devicesArrayList) {
        context = mContext;
        datumDevices = devicesArrayList;
    }

    @Override
    public GetDevicesRecyclerAdapter.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.activity_recycler_device_data, parent, false);
        return new RecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(GetDevicesRecyclerAdapter.RecyclerViewHolder holder, int position) {
        DatumDevices currentItem = datumDevices.get(position);
        String deviceName = currentItem.getNameAr();
        String deviceDate = currentItem.getDescription();
        String deviceCategory = currentItem.getDescription();
        holder.txtDeviceName.setText(deviceName);
        holder.txtDeviceDate.setText(deviceDate);
        holder.txtCategoryName.setText(deviceCategory);

    }

    @Override
    public int getItemCount() {
        return datumDevices.size();
    }
    public class RecyclerViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.txt_device_name)
        TextView txtDeviceName;
        @BindView(R.id.txt_device_date)
        TextView txtDeviceDate;
        @BindView(R.id.txt_category_name)
        TextView txtCategoryName;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
