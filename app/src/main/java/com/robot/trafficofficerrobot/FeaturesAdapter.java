package com.robot.trafficofficerrobot;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class FeaturesAdapter extends RecyclerView.Adapter<FeaturesAdapter.ViewHolder> {

    private Context mContext;
    private List<Feature> featureList;
    public FeaturesAdapter(Context context, List<Feature> features){
        mContext=context;
        featureList=features;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card,viewGroup,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.description.setText(featureList.get(i).getDescription());
        viewHolder.title.setText(featureList.get(i).getTitle());
    }

    @Override
    public int getItemCount() {
        return featureList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView title,description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.tvTitle);
            description=itemView.findViewById(R.id.tvDescription);
        }
    }
}
