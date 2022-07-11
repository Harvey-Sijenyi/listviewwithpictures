package com.example.listviewwithpictures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] Title = {"Apples", "Blueberries", "grape", "strawberry","tangerines" };
    String[] Description = { "Benefits of apples", "Benefits of Blueberries", "Benefits of grape", "Benefits of strawberry", "Benefits of tangerines"};
    int[] images = {R.drawable.apple,R.drawable.blueberries,R.drawable.grape,R.drawable.strawberry,R.drawable.tangerines};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayList<Fruits> arrayList = new ArrayList<>();

        arrayList.add(new Fruits(R.drawable.apple,"Apples","Benefits of apples"));
        arrayList.add(new Fruits(R.drawable.blueberries,"Blueberries","Benefits of blueberries"));
        arrayList.add(new Fruits(R.drawable.grape,"Grape","Benefits of grape"));
        arrayList.add(new Fruits(R.drawable.strawberry,"strawberry","Benefits of strawberry"));
        arrayList.add(new Fruits(R.drawable.tangerines,"Tangerines","Benefits of tangerines"));

        FruitAdapter fruitAdapter = new FruitAdapter(this,R.layout.list_row,arrayList);

        listView.setAdapter(fruitAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==0)
                {
                    Intent ls = new Intent(getApplicationContext(), apple.class);
                    startActivity(ls);
                }
                if (position ==1)
                {
                    Intent ls = new Intent(getApplicationContext(), blueberries.class);
                    startActivity(ls);
                }

                if (position ==2)
                {
                    Intent ls = new Intent(getApplicationContext(), grape.class);
                    startActivity(ls);
                }

                if (position ==3)
                {
                    Intent ls = new Intent(getApplicationContext(), strawberry.class);
                    startActivity(ls);
                }

                if (position ==4)
                {
                    Intent ls = new Intent(getApplicationContext(), tangerines.class);
                    startActivity(ls);
                }

            }
        });





    }

}