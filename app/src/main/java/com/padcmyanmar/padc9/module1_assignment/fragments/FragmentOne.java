package com.padcmyanmar.padc9.module1_assignment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.padcmyanmar.padc9.module1_assignment.R;
import com.padcmyanmar.padc9.module1_assignment.adapter.RVAdapter;

public class FragmentOne extends Fragment {
    public static FragmentOne newInstance(){
        Bundle args= new Bundle();
        FragmentOne fragment = new FragmentOne();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.nearby_fragment,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rvEvents = view.findViewById(R.id.rvEvents);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false);
        RVAdapter adapter = new RVAdapter();
        rvEvents.setLayoutManager(linearLayoutManager);
        rvEvents.setAdapter(adapter);


    }
}
