/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Objects;

/**
 *
 * @author jorge
 */
public class Casilla {
    
    // Atributos
    private int fila;
    private int columna;
    private TipoCasilla tipo;
    
    // Constructores
    public Casilla(){
        
    }
    
    public Casilla(int fila, int columna, TipoCasilla tipo){
        this.fila = fila;
        this.columna = columna;
        this.tipo = tipo;
    }
    
    // Getters (No pongo setters porque son inmutables)
    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public TipoCasilla getTipo() {
        return tipo;
    }

    // Método equals y hashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.fila;
        hash = 53 * hash + this.columna;
        hash = 53 * hash + Objects.hashCode(this.tipo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Casilla other = (Casilla) obj;
        if (this.fila != other.fila) {
            return false;
        }
        if (this.columna != other.columna) {
            return false;
        }
        return this.tipo == other.tipo;
    }
    
    // Método toString
    @Override
    public String toString() {
        return this.tipo.toString();
    }
    
}
