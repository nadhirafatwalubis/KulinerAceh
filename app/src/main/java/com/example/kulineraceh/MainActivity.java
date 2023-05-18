package com.example.kulineraceh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView rMenu = findViewById(R.id.rMenu);
        ArrayList<Makanan> Makanans = new ArrayList<>();
        rMenu.setAdapter(new Adapter(Makanans, this));
        Makanans.add(new Makanan( "Gulai Kambing", "Rate: 4.7", R.drawable.gulaikambing ));
        Makanans.add(new Makanan( "Ikan Asam Keueng", "Rate: 4.9", R.drawable.ikanasamkeueng ));
        Makanans.add(new Makanan( "Itiek Kala", "Rate: 4.8", R.drawable.itiekkala ));
        Makanans.add(new Makanan( "Kuah Beulangong", "Rate: 5.0", R.drawable.kuahbeulangong ));
        Makanans.add(new Makanan( "Kuah Pliek U", "Rate: 4.8", R.drawable.kuahplieku ));
        Makanans.add(new Makanan( "Mie Aceh", "Rate: 4.8", R.drawable.mieaceh ));
        Makanans.add(new Makanan( "Sie Reuboh", "Rate: 4.9", R.drawable.siereuboh ));

        rMenu.setLayoutManager(new GridLayoutManager(this, 2));
    }
        };

