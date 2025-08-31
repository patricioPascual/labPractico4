/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpractico4;

import java.util.HashSet;

/**
 *
 * @author patri
 */
public class Alumno {

    private int nroLegajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    public Alumno(int nroLegajo, String apellido, String nombre) {
        this.nroLegajo = nroLegajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<Materia>();

    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Lo converti en boolean para que no se repitan las materias y que funcione bien la inscripcion
    public boolean agregarMateria(Materia materia) {
    if (!materias.contains(materia)) {
        materias.add(materia);
        return true; 
    }
    return false;
}

    public void cantidadMaterias() {
        int contador = 0;
        for (Materia aux : materias) {
            contador++;

        }
        System.out.println("Alumno " + this.apellido +" "+  this.nombre + " Inscripto  en " + contador + " Materias");
        for (Materia aux : materias) {
            System.out.println(aux.toString());
        }
    }
    
    @Override
    public String toString() {
        return apellido + " " + nombre;
    }
}
