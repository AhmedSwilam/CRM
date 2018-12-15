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
 * Created by Ahmed on 6/8/2018.
 */

public class GetRequestsRecyclerAdapter extends RecyclerView.Adapter<GetRequestsRecyclerAdapter.RecyclerViewHolder> {

    private Context mContext;
    public ArrayList<DatumGetAllRequests> getAllComplaint;

    public GetRequestsRecyclerAdapter(Context context, ArrayList<DatumGetAllRequests> getAllComplaintResponseCrm) {
        mContext = context;
        getAllComplaint = getAllComplaintResponseCrm;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.activity_my_requests_recycler_data, parent, false);
        return new  RecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        DatumGetAllRequests currentItem = getAllComplaint.get(position);
        String ComplaintNumber = currentItem.getClientIdName();
        String ComplaintDate= currentItem.getDate();
        String deviceName = currentItem.getDeviceIdName();
        holder.txtComplaintNumber.setText(ComplaintNumber);
        holder.txtComplaintDate.setText(ComplaintDate);
        holder.txtDeviceName.setText(deviceName);
    }

    @Override
    public int getItemCount() {
        return getAllComplaint.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.txt_complaint_number)
        TextView txtComplaintNumber;
        @BindView(R.id.txt_complaint_date)
        TextView txtComplaintDate;
        @BindView(R.id.txt_device_name)
        TextView txtDeviceName;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
