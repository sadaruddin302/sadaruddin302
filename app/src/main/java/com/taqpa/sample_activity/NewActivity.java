package com.taqpa.sample_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    TextView tv1,tv2;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        tv1=findViewById(R.id.name);
        tv2=findViewById(R.id.speed);
        img=findViewById(R.id.profile);


        String Title=getIntent().getStringExtra("title");
        String speed=getIntent().getStringExtra("speed");
        int images=getIntent().getIntExtra("img",0);


        tv1.setText(Title);
        tv2.setText(speed);
        img.setImageResource(images);
    }
}