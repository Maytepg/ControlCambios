/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.venancio.daw.respaso;

/**
 *
 * @author Mayte
 */
public class Cajablanca {

    public static void main(String[] args) {
        System.out.println (contarLetra("Mayte", 'd'));
    }
static int contarLetra(String cadena, char letra){
    int n= 0, contador = 0, lon;
    lon = cadena.length();
    if (lon > 0) {
        do {
            if (cadena.charAt(contador) ==letra){
                n++;
            }
            contador++;
            lon--;
        }while (lon > 0);
    }
    return n;
}
}
