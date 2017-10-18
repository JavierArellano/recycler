package com.example.franj.listaalumnos;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by franj on 18/10/2017.
 */

public class AdaptadorAlumnosLista extends RecyclerView.Adapter<AdaptadorAlumnosLista.AlumnosListaViewHolder>{

    private ArrayList<Alumno> datos;

    public static class AlumnosListaViewHolder
            extends RecyclerView.ViewHolder {

        private TextView txtApelNom;
        private TextView txtCurso;
        private ImageView image;

        public AlumnosListaViewHolder(View itemView) {
            super(itemView);

            txtApelNom = (TextView)itemView.findViewById(R.id.LblTitulo);
            txtCurso = (TextView)itemView.findViewById(R.id.LblSubTitulo);
            image = (ImageView)itemView.findViewById(R.id.image);
        }

        public void bindTitular(Alumno a) {
            txtApelNom.setText(a.getApellNomb());
            txtCurso.setText(a.getClasNivel());
            setImg(a);
        }
        public void setImg(Alumno a){
            if (a.getSerso().equals("H")){
                image.setImageResource(R.mipmap.ic_hombre);
            }
            if (a.getSerso().equals("M")){
                image.setImageResource(R.mipmap.ic_mujer);
            }
        }
    }

    public AdaptadorAlumnosLista(ArrayList<Alumno> datos) {
        this.datos = datos;
    }
    @Override
    public void onBindViewHolder(AlumnosListaViewHolder viewHolder, int pos) {
        Alumno item = datos.get(pos);

        viewHolder.bindTitular(item);
    }
    @Override
    public int getItemCount() {
        return datos.size();
    }
    @Override
    public AlumnosListaViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.alumno_layout, viewGroup, false);


        AlumnosListaViewHolder tvh = new AlumnosListaViewHolder(itemView);

        return tvh;
    }
}
