/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatugas1;

import java.util.Scanner;
/**
 *
 * @author Windows
 */
public class Balok extends Main{
    double volume, luasPermukaan, p, l, t;
    
    double volume(){
        return volume = p * l * t;
    }
    
    double luasPermukaan() {
        return luasPermukaan = 2 * (p * l + l * t + p * t);
    }
}
