/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Random;

/**
 *
 * @author jorge
 */
public class UtilesLaberinto {

    // Atributos de clase
    private static Random aleatorio = new Random();

    // Método para generar el laberinto
    protected static char[][] generadorLaberinto(int n) {
        // Declaro e inicializo las constantes
        final int VALOR_MAXIMO = 10, VALOR_MINIMO = 3;

        // Si no cumple el rango lanzo la excepcion
        if (n > VALOR_MAXIMO || n < VALOR_MINIMO) {
            throw new IllegalArgumentException("N No esta en el rango.");
        } // Si cumple el rango genero el laberinto
        // Inicializo la matriz NxN
        char[][] laberinto = new char[n][n];
        // Relleno el laberinto
        rellenarMatriz(laberinto);
        return laberinto;
    }

    // Método auxiliar para rellenar la matriz laberinto
    private static char[][] rellenarMatriz(char[][] laberinto) {
        // Declaro e inicializo las constantes
        final int TIPOS_MAXIMOS = 2;
        final int TIPO_BOSQUE = 0;

        // Recorro toda la matriz
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                // Establezco el valor de cada elemento de manera aleatorio
                if (aleatorio.nextInt(TIPOS_MAXIMOS) == TIPO_BOSQUE) {
                    laberinto[i][j] = 'b';
                } else {
                    laberinto[i][j] = 'c';
                }
            }
        }
        // Devuelvo la matriz rellenada
        return laberinto;
    }

    // Método para intercambiar el laberinto de char a casillas
    protected static Casilla[][] generadorLaberintoCasillas(char[][] laberintoIni) {
        // Creo el laberinto final (de casillas), como es cuadrado uso el length normal
        // en las dos
        Casilla[][] laberintoFin = new Casilla[laberintoIni.length][laberintoIni.length];

        // Relleno el laberinto de casillas a partir del inicial
        rellenarCasillas(laberintoIni, laberintoFin);

        return laberintoFin;
    }

    // Método auxiliar para rellenar el laberinto de casillas
    private static Casilla[][] rellenarCasillas(char[][] laberintoIni, Casilla[][] laberintoFin) {
        // Recorro el laberinto final para rellenarlo con el inicial 
        // (tienen las mismas dimensiones)
        for (int i = 0; i < laberintoFin.length; i++) {
            for (int j = 0; j < laberintoFin[i].length; j++) {
                // Relleno el final con su tipo correspondiente a partir del inicial
                if (laberintoIni[i][j] == 'b') {
                    laberintoFin[i][j] = new Casilla(i, j, TipoCasilla.BOSQUE);
                } else {
                    laberintoFin[i][j] = new Casilla(i, j, TipoCasilla.CAMINO);
                }
            }
        }
        return laberintoFin;
    }

    // Método para imprimir el laberinto de char
    protected static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Salto de linea
        }
    }
    
    // Método para imprimir el laberinto de Casillas
    protected static void imprimirMatriz(Casilla[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Salto de linea
        }
    }
}
