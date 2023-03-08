/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatugas1;

/**
 *
 * @author Windows
 */
public class Tabung extends Main {
    double PI, t, r, v, volume, luasPermukaan;
    
    double volume(){
        return v = (PI * r * r) * t;
    }        
    
    double luasPermukaan(){
        return luasPermukaan = PI * r * (r +  t);
    }
}