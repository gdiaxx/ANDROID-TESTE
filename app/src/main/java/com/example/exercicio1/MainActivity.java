package com.example.exercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView ListaClubesView;
        ListaClubesView = findViewById(R.id.listViewClubes);

        List<Clubes> lista = retornaListaClubes();

        final ArrayAdapter<Clubes> adapterListaClubes;
        adapterListaClubes = new ArrayAdapter<Clubes>(this, android.R.layout.simple_expandable_list_item_1, lista);
        ListaClubesView.setAdapter(adapterListaClubes);
        ListaClubesView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Teste do Toast" + position, Toast.LENGTH_LONG).show();

                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.activity_dialog);
                dialog.setTitle("CLUBE");
                    ImageView image = dialog.findViewById(R.id.imageView3);
                    image.setImageResource(R.drawable.fpf);
                    dialog.show();

                Button botaoFechar = (Button) dialog.findViewById(R.id.button);
                botaoFechar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
            }
        });

    }

    private List<Clubes> retornaListaClubes(){

        List<Clubes> listaClubes = new ArrayList<Clubes>();
        listaClubes.add(new Clubes("SC Corinthians Paulista", 1910 , 54));
        listaClubes.add(new Clubes("Sociedade Esportiva Palmeiras", 1914 , 54));
        listaClubes.add(new Clubes("Santos Futebol Clube", 1912 , 47));
        listaClubes.add(new Clubes("São Paulo Futebol Clube", 1930 , 52));
        return listaClubes;
    }
}