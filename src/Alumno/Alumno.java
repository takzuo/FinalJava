package Alumno;

import Asignatura.Asignatura;

public class Alumno {
    private String nombre;
    private int edad;
    private Asignatura[] asignaturas;
    private int contadorAsignaturas;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.asignaturas = new Asignatura[4];
        this.contadorAsignaturas = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        if (contadorAsignaturas == 0) {
            return 0;
        }

        double sumatoriaNotas = 0;
        for (int i = 0; i < contadorAsignaturas; i++) {
            sumatoriaNotas += asignaturas[i].getNota();
        }

        return sumatoriaNotas / contadorAsignaturas;
    }

    public void agregarAsignatura(Asignatura asignatura) {
        boolean asignaturaYaExiste = false;
        for (int i = 0; i < contadorAsignaturas; i++) {
            if (asignaturas[i].getNombre().equals(asignatura.getNombre())) {
                asignaturaYaExiste = true;
                break;
            }
        }

        if (!asignaturaYaExiste && contadorAsignaturas < 4) {
            asignaturas[contadorAsignaturas] = asignatura;
            contadorAsignaturas++;
        }
    }

    public void imprimirInformacion() {
        System.out.println("Nombre del alumno: " + nombre);
        System.out.println("Edad: " + edad);

        System.out.println("Asignaturas que cursó:");
        for (int i = 0; i < contadorAsignaturas; i++) {
            System.out.println("- " + asignaturas[i].getNombre() + " (nota: " + asignaturas[i].getNota() + ", estado: " + asignaturas[i].getEstado() + ")");
        }

        System.out.println("Promedio del alumno: " + getPromedio());
    }
}