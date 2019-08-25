package com.padcmyanmar.padc9.module1_assignment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.padcmyanmar.padc9.module1_assignment.R;
import com.padcmyanmar.padc9.module1_assignment.views.holders.TypeFiveViewHolder;
import com.padcmyanmar.padc9.module1_assignment.views.holders.TypeFourViewHolder;
import com.padcmyanmar.padc9.module1_assignment.views.holders.TypeSixViewHolder;

public class HVAdapter extends RecyclerView.Adapter {

    public static final int VT_FOUR = 0;
    public static final int VT_FIVE = 1;
    public static final int VT_SIX = 2;
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        int layoutRes;
        switch (viewType){
            case VT_FOUR:
                layoutRes = R.layout.view_type_four;
                View view = layoutInflater.inflate(layoutRes,parent,false);
                return new TypeFourViewHolder(view);
            case VT_FIVE:
                layoutRes = R.layout.view_type_five;
                View viewTwo = layoutInflater.inflate(layoutRes,parent,false);
                return new TypeFiveViewHolder(viewTwo);

            case VT_SIX:
                layoutRes = R.layout.view_type_six;
                View viewThree = layoutInflater.inflate(layoutRes,parent,false);
                return new TypeSixViewHolder(viewThree);

            default:
                layoutRes = R.layout.view_type_four;
                View defaultView = layoutInflater.inflate(layoutRes,parent,false);
                return new TypeFiveViewHolder(defaultView);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
    @Override
    public int getItemViewType(int position) {
        int itemViewType = 2;
        if(position == 0)
            return itemViewType = VT_FOUR;
        else if (position == 1)
            return  itemViewType = VT_FIVE;
        return itemViewType;
    }
}
