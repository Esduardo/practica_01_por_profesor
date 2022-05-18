package com.upchiapas.practica_01_por_profesor;

public class ListaEstudiante {
    private Estudiante[] listaEstudiante;
    private byte numeroEstudiantes;

    public ListaEstudiante(byte numeroEstudiantes){
        listaEstudiante=new Estudiante[numeroEstudiantes];
        this.numeroEstudiantes=numeroEstudiantes;
    }

    public boolean addEstudiante(Estudiante estudiante){
        byte indice=0;
        boolean estado = false;
        while (indice<numeroEstudiantes &&
                listaEstudiante[indice] != null)
            indice++;
        if (indice<numeroEstudiantes) {
            listaEstudiante[indice] = estudiante;
            estado = true;
        }
        return estado;

    }

    public byte getPromedioEdad(){
        int indice=0;
        int sumaEdades = 0;

        while ( indice<numeroEstudiantes &&
                listaEstudiante[indice] != null) {
            sumaEdades = sumaEdades + listaEstudiante[indice].getEdad();
            indice++;
        }
        return (byte)(sumaEdades / indice);
    }

    public Estudiante getMenorEdad(){
        byte menorEdad = 100;
        int indice=0;
        byte indicemenor = -1;
        while (indice < numeroEstudiantes &&
                listaEstudiante[indice] != null) {
            if (listaEstudiante[indice].getEdad() < menorEdad) {
                menorEdad = listaEstudiante[indice].getEdad();
                indicemenor = (byte)indice;
            }
            indice++;
        }
        return listaEstudiante[indicemenor];
    }

//    public Estudiante getMayorEdad(){
//
//    }
}
