/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labpractico4;

/**
 *
 * @author patri
 */
public class LabPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Alumno lopez= new Alumno(1001,"Lopez","Martin");
       Alumno martinez= new Alumno (1002,"Martinez","Brenda");
       
       Materia laboratorio= new Materia("Laboratorio 1",100,1 );
       Materia matematicas= new Materia("Matematicas",102,1);
       Materia web= new Materia("Web 2",104,2);
       
       lopez.agregarMateria(matematicas);
       lopez.agregarMateria(laboratorio);
       lopez.agregarMateria(web);
       martinez.agregarMateria(matematicas);
       martinez.agregarMateria(laboratorio);
       martinez.agregarMateria(web);
       martinez.agregarMateria(laboratorio);   
       
       lopez.cantidadMaterias();
       martinez.cantidadMaterias();
    }
    
}
