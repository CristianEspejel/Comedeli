package com.comedeli;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductAdapter extends ArrayAdapter<Product> {

    ProductAdapter(Context context, ArrayList<Product> products){
        super(context,0,products);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup){
        Product product = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view_product, viewGroup,false);
        }
        TextView textViewProduct = (TextView) convertView.findViewById(R.id.textViewProduct);
        TextView textViewPrecious = (TextView) convertView.findViewById(R.id.textViewPrecious);

        textViewProduct.setText(product.product);
        textViewPrecious.setText(product.precious);

        return convertView;
    }
}
