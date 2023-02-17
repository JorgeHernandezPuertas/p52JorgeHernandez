/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {

        // Genero el laberinto de char
        char[][] laberintoChar;
        try {
            laberintoChar = UtilesLaberinto.generadorLaberinto(6);
        } catch (IllegalArgumentException iae) {
            // En caso de excepción genero una matriz que al imprimir dice excepcion
            laberintoChar = new char[][] {{'e','x','c','e','p','c','i','o','n'}};
        }

        // Imprimo el laberinto de char generado
        System.out.println("-------------------------------------------------");
        UtilesLaberinto.imprimirMatriz(laberintoChar);
        System.out.println("-------------------------------------------------");

        // Genero el laberinto de Casillas
        Casilla[][] laberintoCasillas = UtilesLaberinto.
                generadorLaberintoCasillas(laberintoChar);

        // Imprimo el laberinto de casillas
        System.out.println("-------------------------------------------------");
        UtilesLaberinto.imprimirMatriz(laberintoCasillas);
        System.out.println("-------------------------------------------------");
    }
}
