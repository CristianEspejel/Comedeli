package com.comedeli;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayList<Restaurant> restaurantArrayList = new ArrayList<>();

        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(this, restaurantArrayList);

        restaurantAdapter.add(new Restaurant("McDonald's","lorem ipsu"));
        restaurantAdapter.add(new Restaurant("Pizza Hut","jhjfxusafxaf  eue e"));
        restaurantAdapter.add(new Restaurant("Starbucks","sggwtedfededed 23"));

        listView.setAdapter(restaurantAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(MainActivity.this,Menu.class));
                }else if (position == 1){
                    startActivity(new Intent(MainActivity.this,Menu2.class));
                }else if (position == 2)
                    startActivity(new Intent(MainActivity.this,Menu3.class));
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menutoolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}