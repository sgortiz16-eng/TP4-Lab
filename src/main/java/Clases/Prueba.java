/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author sgort
 */
public class Prueba {

    public static void main(String[] args) {

        Materia matematicas = new Materia(1, "Matematicas", 1);

        Colegio.materias.add(matematicas);

        Alumno pablito = new Alumno(100231, "Ochoa", "Pablito");

        Colegio.alumnos.add(pablito);

        pablito.agregarMateria(matematicas);

        System.out.println("Alumno: " + Colegio.alumnos.size());
        System.out.println("Materias: " + Colegio.materias.size());

        System.out.println("Materias de Pablo: " + pablito.cantidadMaterias());

    }

}
