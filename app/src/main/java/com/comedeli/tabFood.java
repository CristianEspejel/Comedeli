package com.comedeli;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link tabFood} factory method to
 * create an instance of this fragment.
 */
public class tabFood extends Fragment {
    RecyclerView recyvlerView;
    ListView listView;

    public tabFood() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab_food,container,false);
        // Inflate the layout for this fragment

        ListView listView = (ListView) view.findViewById(R.id.listView);


        return view;
    }
}