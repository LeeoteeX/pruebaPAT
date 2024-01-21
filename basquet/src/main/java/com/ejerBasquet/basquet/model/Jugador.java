/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejerBasquet.basquet.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Leandro
 */
@Getter @Setter
public class Jugador {
    
    
     // id, dni, nombre, apellido, edad, peso y estatura
    
    private long id;
    private long dni;
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double estatura;

    public Jugador() {
    }

    public Jugador(long id, long dni, String nombre, String apellido, int edad, double peso, double estatura) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

   
    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", peso=" + peso + ", estatura=" + estatura + '}';
    }
}
