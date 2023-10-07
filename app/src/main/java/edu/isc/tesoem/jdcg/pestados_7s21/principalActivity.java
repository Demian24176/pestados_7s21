package edu.isc.tesoem.jdcg.pestados_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;



import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class principalActivity extends AppCompatActivity {

    Spinner splista;
    ImageView images;
    List<String> Milista = new ArrayList<>(Arrays.asList("","Chiapas", "Puebla", "Zacatecas", "Monterrey", "Acapulco"));
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        splista = findViewById(R.id.splista);
        Milista.add("Estado de Mexico");

        images = findViewById(R.id.imageView4);

        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Milista);
        splista.setAdapter(adaptador);

        splista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private Instant Glide;

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String valor = adapterView.getItemAtPosition(i).toString();
                if (i == 1) {
                    Toast.makeText(principalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(images).load("https://drive.google.com/drive/u/0/folders/1glc7GOyBk2AUHE7xVuG5siuTrJ0ByVHs").into(images);
                } else if (i == 2) {
                    Toast.makeText(principalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(images).load("https://drive.google.com/drive/u/0/folders/1glc7GOyBk2AUHE7xVuG5siuTrJ0ByVHs").into(images);
                } else if (i == 3) {
                    Toast.makeText(principalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(images).load("https://drive.google.com/drive/u/0/folders/1glc7GOyBk2AUHE7xVuG5siuTrJ0ByVHs").into(images);
                } else if (i == 4) {
                    Toast.makeText(principalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(images).load("https://drive.google.com/drive/u/0/folders/1glc7GOyBk2AUHE7xVuG5siuTrJ0ByVHs").into(images);
                } else if (i == 5) {
                    Toast.makeText(principalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(images).load("https://drive.google.com/drive/u/0/folders/1glc7GOyBk2AUHE7xVuG5siuTrJ0ByVHs").into(images);
                } else if (i == 6) {
                    Toast.makeText(principalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(images).load("https://drive.google.com/drive/u/0/folders/1glc7GOyBk2AUHE7xVuG5siuTrJ0ByVHs").into(images);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}