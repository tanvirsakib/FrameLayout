package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView image1,image2,image3,image4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);

        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.image1){
            image1.setVisibility(View.GONE);
            image2.setVisibility(View.VISIBLE);
        }

        else if (v.getId()==R.id.image2){
            image2.setVisibility(View.GONE);
            image3.setVisibility(View.VISIBLE);
        }

        else if (v.getId()==R.id.image3){
            image3.setVisibility(View.GONE);
            image4.setVisibility(View.VISIBLE);
        }

        else if (v.getId()==R.id.image4){
            image4.setVisibility(View.GONE);
            image1.setVisibility(View.VISIBLE);
        }

    }
}
