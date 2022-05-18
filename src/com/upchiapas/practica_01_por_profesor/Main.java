package com.upchiapas.practica_01_por_profesor;

import com.upchiapas.practica_01_por_profesor.ListaEstudiante;
import com.upchiapas.practica_01_por_profesor.Estudiante;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args){
        ListaEstudiante estudiantes = new ListaEstudiante((byte)3);


        Estudiante veronica = new Estudiante( 221224,
                "Veronica",
                'F',
                "Tuxtla Gutierrez",
                LocalDate.of(2003, 12, 4));

        Estudiante eduardo = new Estudiante(221214,
                "Eduardo",
                'M',
                "Tapachula",
                LocalDate.of(2004,1,8));

        if (estudiantes.addEstudiante(veronica))
            System.out.println("El objeto fue añadido exitosamente");
        if (estudiantes.addEstudiante(eduardo))
            System.out.println("Añadido exitosamente");
        else
            System.out.println("Hubo un error al intentar agregar el objeto");
        System.out.println(estudiantes.getMenorEdad());


    }

}
