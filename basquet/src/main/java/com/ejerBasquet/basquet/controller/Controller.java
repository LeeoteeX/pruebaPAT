/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejerBasquet.basquet.controller;

import com.ejerBasquet.basquet.model.Jugador;
import com.ejerBasquet.basquet.repository.IJugadorRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Leandro
 */
@RestController

public class Controller {

    @Autowired
    IJugadorRepository juga;

    @PostMapping("/jugadores")
    private String traerJugadores(@RequestBody List<Jugador> jugadores) {

        for (Jugador jugadore : jugadores) {
            System.out.println(jugadore);
        }
        double estatura = juga.promedioEstatura(jugadores);
        return "El promedio de estatura de los jugadores es : " + estatura + " mts";

    }

}
