package com.comedeli;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {


    RestaurantAdapter(MainActivity context, ArrayList<Restaurant> restaurants){
        super(context,0,restaurants);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup){
        Restaurant restaurant = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view_restaurant, viewGroup,false);
        }
        TextView textViewName = (TextView) convertView.findViewById(R.id.textViewName);
        TextView textViewDirection = (TextView) convertView.findViewById(R.id.textViewDirection);

        textViewName.setText(restaurant.name);
        textViewDirection.setText(restaurant.direction);

        return convertView;
    }
}
