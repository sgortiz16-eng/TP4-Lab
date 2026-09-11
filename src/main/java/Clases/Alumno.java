/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.HashSet;

/**
 *
 * @author sgort
 */
public class Alumno {

    int legajo;
    String apellido;
    String nombre;
    HashSet<Materia> materias =  new HashSet<Materia>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
       
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
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

    public void agregarMateria(Materia materia) {
        boolean x = materias.add(materia);
        if (x) {
            System.out.println("Alumno inscripto con extito en :"+ materia.getNombre());
        }else{
            System.out.println("El alumno "+ this.nombre + " "+ this.apellido+" ya se encuentra inscripto en la materia: "+ materia.getNombre());
        }
    }

    @Override
    public String toString() {
        return  nombre + apellido ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return this.legajo == other.legajo;
    }

    public int cantidadMaterias() {
        return materias.size();
    }
   
    
}
