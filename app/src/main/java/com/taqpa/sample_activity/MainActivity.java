package com.taqpa.sample_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] vehicleName = {"BMW", "VOLVO", "TESLA", "TOYOTA", "BOLAN"};
    String[] speed = {"240km/h", "300km/h", "320km/h", "120km/h", "80km/h"};
    int[] images = {R.drawable.bmw, R.drawable.lambo, R.drawable.trruck, R.drawable.rover, R.drawable.vorvette};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        CustomAdapter adapter=new CustomAdapter(this,vehicleName,speed,images);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String posTitle=vehicleName[position];
                String posSpeed=speed[position];
                int posImages=images[position];

                Intent intent=new Intent(MainActivity.this,NewActivity.class);
                intent.putExtra("title",posTitle);
                intent.putExtra("speed",posSpeed);
                intent.putExtra("img",posImages);

                startActivity(intent);


            }
        });

    }
}