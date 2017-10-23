package com.example.franj.listaalumnos;

/**
 * Created by franj on 09/10/2017.
 */

public class Alumno {
    private String Nombre;
    private String Apellidos;
    private String Clase;
    private String Nivel;
    private String Serso;

    public Alumno(String nomb, String apell, String clase, String niv, String sex){
        Nombre = nomb;
        Apellidos = apell;
        Clase = clase;
        Nivel = niv;
        Serso = sex;
    }


    public String getApellNomb(){
        return Apellidos + ", " + Nombre;
    }

    public String getSerso(){
        return Serso;
    }

    public void setNombre(String nombre) {
        Nombre += nombre;
    }

    public String getClasNivel(){
        return Clase + "-" + Nivel;
    }
}