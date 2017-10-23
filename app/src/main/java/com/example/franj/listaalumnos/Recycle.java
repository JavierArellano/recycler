package com.example.franj.listaalumnos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Recycle extends AppCompatActivity {
    private ArrayList<Alumno> datos;
    private RecyclerView recView;

    public void meterDatos(ArrayList<Alumno> lista){
        lista.add (new Alumno("Juan", "Perez Perez", "1º", "DAM", "H"));
        lista.add (new Alumno("Pedro", "Lopez Lopez", "2º", "DAM", "H"));
        lista.add (new Alumno("Laura", "Montilla Li", "1º", "DAM", "M"));
        lista.add (new Alumno("Eva", "Martín Chung", "2º", "DAM", "M"));
        lista.add (new Alumno("Carlos", "Perez Sanchez", "1º", "Bachillerato", "H"));
        lista.add (new Alumno("Luis", "Da Sousa", "2º", "Bachillerato", "H"));
        lista.add (new Alumno("Antonio", "Rodriguez Martinez", "1º", "Bachillerato", "H"));
        lista.add (new Alumno("Ana", "Alonso Martinez", "2º", "Bachillerato", "M"));
        lista.add (new Alumno("Cristina", "Franco Montes", "1º", "DAM", "M"));
        lista.add (new Alumno("Lucas", "Perico Cuadrado", "2º", "DAM", "H"));
        lista.add (new Alumno("Juan", "Perez Perez", "1º", "DAM", "H"));
        lista.add (new Alumno("Pedro", "Lopez Lopez", "2º", "DAM", "H"));
        lista.add (new Alumno("Laura", "Montilla Li", "1º", "DAM", "M"));
        lista.add (new Alumno("Eva", "Martín Chung", "2º", "DAM", "M"));
        lista.add (new Alumno("Carlos", "Perez Sanchez", "1º", "Bachillerato", "H"));
        lista.add (new Alumno("Luis", "Da Sousa", "2º", "Bachillerato", "H"));
        lista.add (new Alumno("Antonio", "Rodriguez Martinez", "1º", "Bachillerato", "H"));
        lista.add (new Alumno("Ana", "Alonso Martinez", "2º", "Bachillerato", "M"));
        lista.add (new Alumno("Cristina", "Franco Montes", "1º", "DAM", "M"));
        lista.add (new Alumno("Lucas", "Perico Cuadrado", "2º", "DAM", "H"));
        lista.add (new Alumno("Juan", "Perez Perez", "1º", "DAM", "H"));
        lista.add (new Alumno("Pedro", "Lopez Lopez", "2º", "DAM", "H"));
        lista.add (new Alumno("Laura", "Montilla Li", "1º", "DAM", "M"));
        lista.add (new Alumno("Eva", "Martín Chung", "2º", "DAM", "M"));
        lista.add (new Alumno("Carlos", "Perez Sanchez", "1º", "Bachillerato", "H"));
        lista.add (new Alumno("Luis", "Da Sousa", "2º", "Bachillerato", "H"));
        lista.add (new Alumno("Antonio", "Rodriguez Martinez", "1º", "Bachillerato", "H"));
        lista.add (new Alumno("Ana", "Alonso Martinez", "2º", "Bachillerato", "M"));
        lista.add (new Alumno("Cristina", "Franco Montes", "1º", "DAM", "M"));
        lista.add (new Alumno("Lucas", "Perico Cuadrado", "2º", "DAM", "H"));
        lista.add (new Alumno("Juan", "Perez Perez", "1º", "DAM", "H"));
        lista.add (new Alumno("Pedro", "Lopez Lopez", "2º", "DAM", "H"));
        lista.add (new Alumno("Laura", "Montilla Li", "1º", "DAM", "M"));
        lista.add (new Alumno("Eva", "Martín Chung", "2º", "DAM", "M"));
        lista.add (new Alumno("Carlos", "Perez Sanchez", "1º", "Bachillerato", "H"));
        lista.add (new Alumno("Luis", "Da Sousa", "2º", "Bachillerato", "H"));
        lista.add (new Alumno("Antonio", "Rodriguez Martinez", "1º", "Bachillerato", "H"));
        lista.add (new Alumno("Ana", "Alonso Martinez", "2º", "Bachillerato", "M"));
        lista.add (new Alumno("Cristina", "Franco Montes", "1º", "DAM", "M"));
        lista.add (new Alumno("Lucas", "Perico Cuadrado", "2º", "DAM", "H"));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        datos = new ArrayList<Alumno>();
        meterDatos(datos);

        recView = (RecyclerView) findViewById(R.id.RecView);
        recView.setHasFixedSize(true);

        final AdaptadorAlumnosLista adaptador = new AdaptadorAlumnosLista(datos);

        adaptador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Prueba", "Pulsado el " + recView.getChildAdapterPosition(v));
                datos.get(recView.getChildAdapterPosition(v)).setNombre(" (Has pulsado este)");
                recView.setAdapter(adaptador);
            }
        });

        recView.setAdapter(adaptador);
        recView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}

