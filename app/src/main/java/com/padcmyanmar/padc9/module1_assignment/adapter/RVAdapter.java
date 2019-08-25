package com.padcmyanmar.padc9.module1_assignment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.padcmyanmar.padc9.module1_assignment.R;
import com.padcmyanmar.padc9.module1_assignment.views.holders.TypeOneViewHolder;
import com.padcmyanmar.padc9.module1_assignment.views.holders.TypeThreeViewHolder;
import com.padcmyanmar.padc9.module1_assignment.views.holders.TypeTwoViewHolder;

public class RVAdapter extends RecyclerView.Adapter {
    public static final int VT_FIRST = 0;
    public static final int VT_SECOND = 1;
    public static final int VT_THIRD = 2;
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        int layoutRes;
        switch (viewType){
            case VT_FIRST:
                layoutRes = R.layout.view_type_one;
                View view = layoutInflater.inflate(layoutRes,parent,false);
                return new TypeOneViewHolder(view);
            case VT_SECOND:
                layoutRes = R.layout.view_type_two;
                View viewTwo = layoutInflater.inflate(layoutRes,parent,false);
                return new TypeTwoViewHolder(viewTwo);

            case VT_THIRD:
                layoutRes = R.layout.view_type_three;
                View viewThree = layoutInflater.inflate(layoutRes,parent,false);
                return new TypeThreeViewHolder(viewThree);

            default:
                layoutRes = R.layout.view_type_one;
                View defaultView = layoutInflater.inflate(layoutRes,parent,false);
                return new TypeOneViewHolder(defaultView);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    @Override
    public int getItemViewType(int position) {
        int itemViewType = 2;
        if(position == 0)
            return itemViewType = VT_FIRST;
        else if (position == 1)
            return  itemViewType = VT_SECOND;
        return itemViewType;
    }
}
