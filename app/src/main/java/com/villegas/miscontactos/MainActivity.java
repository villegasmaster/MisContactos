package com.villegas.miscontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactos = new ArrayList<Contacto>();

        contactos.add(new Contacto("Jose Manuel", "666444852" , "jmvillegas@gmail.com"));
        contactos.add(new Contacto("Mercé Somoza", "666258741", "merce@gmail.com"));
        contactos.add(new Contacto("Rumano Rumana", "321456987", "rumano@gmail.com"));
        contactos.add(new Contacto("Andreu Guzman", "100258741", "aguzman@gmail.com"));


        ArrayList<String> nombresContacto = new ArrayList<String>();

        for (Contacto contacto : contactos) {
            nombresContacto.add(contacto.getNombre());
        }


        ListView lstContactos = (ListView) findViewById(R.id.lstContactos);
        lstContactos.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,nombresContacto));

        lstContactos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetalleContacto.class);
                intent.putExtra(getResources().getString(R.string.pnombre) , contactos.get(i).getNombre());
                intent.putExtra(getResources().getString(R.string.ptelefono), contactos.get(i).getTelefono());
                intent.putExtra(getResources().getString(R.string.pemail), contactos.get(i).getEmail());
                startActivity(intent);
                finish();
            }
        });
    }
}
