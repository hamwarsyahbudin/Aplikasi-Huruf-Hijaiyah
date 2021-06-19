package com.syahbudin.hijaiyahhuruf.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.syahbudin.hijaiyahhuruf.R;

public class FragmentDhammah extends Fragment {
    public FragmentDhammah(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dhammah, container, false);

        return view;
    }
}