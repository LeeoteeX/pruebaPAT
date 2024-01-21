/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejerBasquet.basquet.repository;

import com.ejerBasquet.basquet.model.Jugador;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leandro
 */
@Repository
public class JugadoresRepository implements IJugadorRepository {
    
    List<Jugador> listaJugadores = new ArrayList<Jugador> ();

    @Override
    public List<Jugador> traerJugadores(List<Jugador> listaJugadores) {
        List<Jugador> lista = new ArrayList<Jugador>();
        
        for (Jugador jugador : listaJugadores) {
            Jugador juga = new Jugador();
            juga.setDni(jugador.getDni());
            juga.setEdad(jugador.getEdad());
            juga.setEstatura(jugador.getEstatura());
            juga.setId(jugador.getId());
            juga.setNombre(jugador.getNombre());
            juga.setApellido(jugador.getApellido());
            juga.setPeso(jugador.getPeso());
            lista.add(juga);
        }
        return lista;
    }

    @Override
    public double promedioEstatura(List<Jugador> jugadores) {
        
        int cant = jugadores.size();
        double estatura=0;
        for (Jugador jugador : jugadores) {
            estatura+= jugador.getEstatura();
        }
        double result =estatura/cant;
        DecimalFormat format = new DecimalFormat("#.##");
        String resultadoFormateado = format.format(result);
        result = Double.parseDouble(resultadoFormateado);
        return result;
    }
    
            
}
