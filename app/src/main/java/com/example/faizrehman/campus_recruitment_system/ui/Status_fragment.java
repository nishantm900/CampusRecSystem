package com.example.faizrehman.campus_recruitment_system.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.faizrehman.campus_recruitment_system.R;

/**
 * Created by faizrehman on 1/25/17.
 */

public class Status_fragment extends android.support.v4.app.Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.status_view,null);
        super.onCreateView(inflater, container, savedInstanceState);

        return view;
    }
}
