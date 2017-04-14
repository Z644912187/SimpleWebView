package com.sjtu.charles.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sjtu.charles.model.SampleModel;
import com.sjtu.charles.simplewebview2.R;

import java.util.ArrayList;

/**
 * [description]
 * author: yifei
 * created at 17/4/7 下午4:07
 */
public class SampleRecyclerAdapter  extends RecyclerView.Adapter<SampleRecyclerAdapter.ViewHolder> {

    private ArrayList<SampleModel> sampleData = new ArrayList<>();

    public SampleRecyclerAdapter(ArrayList<SampleModel> sampleData) {
        this.sampleData = sampleData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parentViewGroup, int i) {
        View rowView = LayoutInflater.from (parentViewGroup.getContext())
                .inflate(R.layout.list_basic_item, parentViewGroup, false);
        return new ViewHolder (rowView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        SampleModel rowData = sampleData.get(position);
        viewHolder.textViewSample.setText(rowData.getSampleText());
        Log.d("SampleRecyclerAdapter", "xxx " + rowData.getSampleText());
        viewHolder.itemView.setVisibility(View.VISIBLE);
    }


    @Override
    public int getItemCount() {
        return sampleData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textViewSample;
        public ViewHolder(View itemView) {
            super(itemView);

            textViewSample = (TextView) itemView.findViewById(
                    R.id.textViewSample);
        }
    }

}


