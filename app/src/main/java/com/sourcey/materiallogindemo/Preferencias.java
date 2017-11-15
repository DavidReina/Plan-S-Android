package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class Preferencias extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias);





        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] valores = {"uno","dos","tres","cuatro","cinco","seis", "siete", "ocho"};
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // vacio

            }
        });





    }




    public void seccion0(MenuItem item){
        Intent intent = new Intent(this, Preferencias.class);
        startActivity(intent);
        //MainActivity.this.finish();
    }

    public void seccion1(MenuItem item){
        Intent intent = new Intent(this, CrearPlan.class);
        startActivity(intent);
        //MainActivity.this.finish();
    }

    public void seccion2(MenuItem item){
        Intent intent = new Intent(this, MejoresPlanes.class);
        startActivity(intent);
        //MainActivity.this.finish();
    }

    public void seccion3(MenuItem item){
        Intent intent = new Intent(this, MisPlanes.class);
        startActivity(intent);
        //MainActivity.this.finish();
    }

    public void seccion4(MenuItem item){
        Intent intent = new Intent(this, BuscarPlan.class);
        startActivity(intent);
        //MainActivity.this.finish();
    }

    public void seccion5(MenuItem item){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
