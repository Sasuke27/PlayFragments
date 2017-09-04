package com.hyperdev.playfragments.fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hyperdev.playfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {


    private View mColorView;

    public ColorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_color, container, false);

        mColorView = view.findViewById(R.id.colorView);

        return view;
    }

    public void changeColor(int color) {
        mColorView.setBackgroundColor(color);
    }
}
