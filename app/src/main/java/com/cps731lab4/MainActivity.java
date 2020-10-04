package com.cps731lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String[] recipeStr, descriptionStr, ingredientsStr;
    int[] images = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5,
                    R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9, R.drawable.img10,
                    R.drawable.img11, R.drawable.img12, R.drawable.img13};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recipeStr = getResources().getStringArray(R.array.recipes);
        descriptionStr = getResources().getStringArray(R.array.description);
        ingredientsStr = getResources().getStringArray(R.array.ingredients);

        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, recipeStr, descriptionStr, ingredientsStr, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}