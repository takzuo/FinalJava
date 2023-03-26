package Aplicacion;

import Alumno.Alumno;
import Asignatura.Asignatura;

public class Aplicacion {
    public static void main(String[] args) {
        // Crear tres instancias de la clase Alumno
        Alumno alumno1 = new Alumno("Juan", 20);
        Alumno alumno2 = new Alumno("María", 21);
        Alumno alumno3 = new Alumno("Pedro", 19);

        // Agregar asignaturas a cada alumno
        alumno1.agregarAsignatura(new Asignatura("Programación", 4.5));
        alumno1.agregarAsignatura(new Asignatura("Base de datos", 3.0));
        alumno2.agregarAsignatura(new Asignatura("Programación", 3.8));
        alumno2.agregarAsignatura(new Asignatura("Redes", 2.5));
        alumno3.agregarAsignatura(new Asignatura("Programación", 3.2));
        alumno3.agregarAsignatura(new Asignatura("Redes", 4.0));

        // Imprimir la información de cada alumno
        System.out.println("Información del alumno 1:");
        alumno1.imprimirInformacion();
        System.out.println();

        System.out.println("Información del alumno 2:");
        alumno2.imprimirInformacion();
        System.out.println();

        System.out.println("Información del alumno 3:");
        alumno3.imprimirInformacion();
    }
}
