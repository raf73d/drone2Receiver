/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.drone2Receiver.drone2Receiver;

import java.time.LocalDate;

/**
 *
 * @author rafde
 */
public class BerichtGemaakt {
    private String berichtString;
    private LocalDate datum;
    public BerichtGemaakt() {}

    public String getBerichtString() { return berichtString; }
    public void setBerichtString(String berichtString) { this.berichtString = berichtString; }

    public LocalDate getDatum() { return datum; }
    public void setDatum(LocalDate datum) { this.datum = datum; }
}