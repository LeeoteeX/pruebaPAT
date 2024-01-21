/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejerBasquet.basquet.repository;

import com.ejerBasquet.basquet.model.Jugador;
import java.util.List;

/**
 *
 * @author Leandro
 */
public interface IJugadorRepository {
    
    public List<Jugador> traerJugadores(List<Jugador> jugadores);
    public double promedioEstatura(List<Jugador> jugadores);
    
}
