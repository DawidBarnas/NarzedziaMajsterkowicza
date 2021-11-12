package com.example.narzdziamajsterkowicza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton MenuTop = findViewById(R.id.MenuTop);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);

    MenuTop.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openMenuAc();
        }
    });

    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openDyktafonAc();
        }
    });

    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openBarometrAc();
        }
    });

    button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openNachylenieAc();
        }
    });
    button4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openAkcelerometrAc();
        }
    });
    button5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openMapsActivity();
        }
    });
    button6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openKompasAc();
        }
    });

    }
    private void openMenuAc() {
        Intent intent = new Intent(this, MenuAc.class);
        Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    private void openDyktafonAc() {
        Intent intent = new Intent(this, DyktafonAc.class);
        Toast.makeText(this, "Dyktafon", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    private void openBarometrAc() {
        Intent intent = new Intent(this, BarometrAc.class);
        Toast.makeText(this, "Barometr", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    private void openNachylenieAc() {
        Intent intent = new Intent(this, NachylenieAc.class);
        Toast.makeText(this, "Nachylenie", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    private void openAkcelerometrAc() {
        Intent intent = new Intent(this, AkcelerometrAc.class);
        Toast.makeText(this, "Akcelerometr", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    private void openMapsActivity() {
        Intent intent = new Intent(this, MapsActivity.class);
        Toast.makeText(this, "Mapa GPS", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    private void openKompasAc() {
        Intent intent = new Intent(this, KompasAc.class);
        Toast.makeText(this, "Kompas", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }



}