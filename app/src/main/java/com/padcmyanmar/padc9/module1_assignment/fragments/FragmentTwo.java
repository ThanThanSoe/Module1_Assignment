package com.padcmyanmar.padc9.module1_assignment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.padcmyanmar.padc9.module1_assignment.R;
import com.padcmyanmar.padc9.module1_assignment.adapter.HVAdapter;

public class FragmentTwo extends Fragment {
    private BottomSheetBehavior sheetBehavior;
    private LinearLayout bottom_sheet;

    public static FragmentTwo newInstance(){
        Bundle args = new Bundle();
        FragmentTwo fragment = new FragmentTwo();
        fragment.setArguments(args);
        return  fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.popular_fragment,container,false);
        Button search = view.findViewById(R.id.btn_search);
        search.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                View view1 = getLayoutInflater().inflate(R.layout.buttom_sheet_one,null);
                BottomSheetDialog dialogFragment = new BottomSheetDialog(getActivity());
                dialogFragment.setContentView(view1);
                dialogFragment.show();

            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rvEventTwo = view.findViewById(R.id.rvEventTwo);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL,false);
        HVAdapter adapter = new HVAdapter();
        rvEventTwo.setLayoutManager(linearLayoutManager);
        rvEventTwo.setAdapter(adapter);



    }

}
