package com.wow_it.myfavouriteplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSaintmartin,btnIIUC;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSaintmartin=(Button)findViewById(R.id.btnSaintmartin);
        btnIIUC=(Button)findViewById(R.id.btnIIUC);

        btnSaintmartin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PlaceDetailsActivity.class);
                intent.putExtra("placeName","Saintmartin");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Saintmartin", Toast.LENGTH_SHORT).show();

            }
        });




        btnIIUC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PlaceDetailsActivity.class);
                intent.putExtra("placeName","IIUC");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "IIUC", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
