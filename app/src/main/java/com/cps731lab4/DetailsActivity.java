package com.cps731lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {
    ImageView recipePic;
    TextView desc;
    String ingredients;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        recipePic = findViewById(R.id.recipeImage);
        desc = findViewById(R.id.recipeIngredients);

        getData();
        setData();
    }

    private void getData(){
        if(getIntent().hasExtra("picture") && getIntent().hasExtra("ingredients")){
            ingredients = getIntent().getStringExtra("ingredients");
            image = getIntent().getIntExtra("picture", 1);
        }
    }

    private void setData(){
        desc.setText(ingredients);
        recipePic.setImageResource(image);
    }
}
