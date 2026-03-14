package com.drone2Receiver.drone2Receiver;

import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafde
 */
public class Bericht {
    public Bericht(java.lang.String bericht, LocalDate datum) {
        this.bericht = bericht;
        this.datum = datum;
    }
    private LocalDate datum;
    private final String bericht;

    public LocalDate getDatum() {
        return datum;
    }

    public String getBericht() {
        return bericht;
    }
    
    
}
