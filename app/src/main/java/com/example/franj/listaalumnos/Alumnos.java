package com.example.franj.listaalumnos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Alumnos extends AppCompatActivity {
    private ListView lstAlumnos;
    private Alumno[] datos =
            new Alumno[]{
                    new Alumno("Juan", "Perez Perez", "1º", "DAM", "H"),
                    new Alumno("Pedro", "Lopez Lopez", "2º", "DAM", "H"),
                    new Alumno("Laura", "Montilla Li", "1º", "DAM", "M"),
                    new Alumno("Eva", "Martín Chung", "2º", "DAM", "M"),
                    new Alumno("Carlos", "Perez Sanchez", "1º", "Bachillerato", "H"),
                    new Alumno("Luis", "Da Sousa", "2º", "Bachillerato", "H"),
                    new Alumno("Antonio", "Rodriguez Martinez", "1º", "Bachillerato", "H"),
                    new Alumno("Ana", "Alonso Martinez", "2º", "Bachillerato", "M"),
                    new Alumno("Cristina", "Franco Montes", "1º", "DAM", "M"),
                    new Alumno("Lucas", "Perico Cuadrado", "2º", "DAM", "H"),
                    new Alumno("Juan", "Perez Perez", "1º", "DAM", "H"),
                    new Alumno("Pedro", "Lopez Lopez", "2º", "DAM", "H"),
                    new Alumno("Laura", "Montilla Li", "1º", "DAM", "M"),
                    new Alumno("Eva", "Martín Chung", "2º", "DAM", "M"),
                    new Alumno("Carlos", "Perez Sanchez", "1º", "Bachillerato", "H"),
                    new Alumno("Luis", "Da Sousa", "2º", "Bachillerato", "H"),
                    new Alumno("Antonio", "Rodriguez Martinez", "1º", "Bachillerato", "H"),
                    new Alumno("Ana", "Alonso Martinez", "2º", "Bachillerato", "M"),
                    new Alumno("Cristina", "Franco Montes", "1º", "DAM", "M"),
                    new Alumno("Lucas", "Perico Cuadrado", "2º", "DAM", "H"),
                    new Alumno("Juan", "Perez Perez", "1º", "DAM", "H"),
                    new Alumno("Pedro", "Lopez Lopez", "2º", "DAM", "H"),
                    new Alumno("Laura", "Montilla Li", "1º", "DAM", "M"),
                    new Alumno("Eva", "Martín Chung", "2º", "DAM", "M"),
                    new Alumno("Carlos", "Perez Sanchez", "1º", "Bachillerato", "H"),
                    new Alumno("Luis", "Da Sousa", "2º", "Bachillerato", "H"),
                    new Alumno("Antonio", "Rodriguez Martinez", "1º", "Bachillerato", "H"),
                    new Alumno("Ana", "Alonso Martinez", "2º", "Bachillerato", "M"),
                    new Alumno("Cristina", "Franco Montes", "1º", "DAM", "M"),
                    new Alumno("Lucas", "Perico Cuadrado", "2º", "DAM", "H"),
                    new Alumno("Juan", "Perez Perez", "1º", "DAM", "H"),
                    new Alumno("Pedro", "Lopez Lopez", "2º", "DAM", "H"),
                    new Alumno("Laura", "Montilla Li", "1º", "DAM", "M"),
                    new Alumno("Eva", "Martín Chung", "2º", "DAM", "M"),
                    new Alumno("Carlos", "Perez Sanchez", "1º", "Bachillerato", "H"),
                    new Alumno("Luis", "Da Sousa", "2º", "Bachillerato", "H"),
                    new Alumno("Antonio", "Rodriguez Martinez", "1º", "Bachillerato", "H"),
                    new Alumno("Ana", "Alonso Martinez", "2º", "Bachillerato", "M"),
                    new Alumno("Cristina", "Franco Montes", "1º", "DAM", "M"),
                    new Alumno("Lucas", "Perico Cuadrado", "2º", "DAM", "H")
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alumnos);
        AdaptadorAlumnos adaptador = new AdaptadorAlumnos(this, datos);
        lstAlumnos = (ListView) findViewById(R.id.LstOpciones);
        lstAlumnos.setAdapter(adaptador);
    }
    private class ViewHolder{
        TextView ApelNom;
        TextView ClasNiv;
        ImageView Imagen;
    }

    public class AdaptadorAlumnos extends ArrayAdapter<Alumno> {

        public AdaptadorAlumnos(Context context, Alumno[] datos) {
            super(context, R.layout.alumno_layout, datos);
        }

        public void setImg(ImageView img, int position){
            if (datos[position].getSerso().equals("H")){
                img.setImageResource(R.mipmap.ic_hombre);
            }
            if (datos[position].getSerso().equals("M")){
                img.setImageResource(R.mipmap.ic_mujer);
            }

        }

        public View getView(int position, View convertView, ViewGroup parent) {
            View item = convertView;
            ViewHolder holder;

            if (item == null){
                LayoutInflater inflater = LayoutInflater.from(getContext());
                item = inflater.inflate(R.layout.alumno_layout, null);

                holder = new ViewHolder();
                holder.ApelNom = (TextView)item.findViewById(R.id.LblTitulo);
                holder.ClasNiv = (TextView)item.findViewById(R.id.LblSubTitulo);
                holder.Imagen = (ImageView)item.findViewById(R.id.image);

                item.setTag(holder);
            }else {
                holder = (ViewHolder)item.getTag();
            }

            setImg(holder.Imagen, position);

            holder.ApelNom.setText(datos[position].getApellNomb());

            holder.ClasNiv.setText(datos[position].getClasNivel());

            return(item);
        }
    }
}
