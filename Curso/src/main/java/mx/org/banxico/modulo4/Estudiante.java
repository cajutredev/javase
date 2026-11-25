package mx.org.banxico.modulo4;

import java.util.Scanner;

public class Estudiante {

    private String nombre;
    private String primerApellido;
    private int edad;
    private int calificacion;

    public Estudiante() {
    }

    public Estudiante(String nombre, String primerApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
    }

    public Estudiante(String nombre, String primerApellido, int edad, int calificacion) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    public int calcularCalificacion(int numeroExamenes, int sumaTotalCalificacion) {
        setCalificacion(sumaTotalCalificacion / numeroExamenes);
        return getCalificacion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", primerApellido=" + primerApellido + ", edad=" + edad
                + ", calificacion=" + calificacion + "]";
    }

   
}
