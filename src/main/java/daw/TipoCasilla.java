/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw;

/**
 *
 * @author jorge
 */
public enum TipoCasilla {
    // Enums
    CAMINO("Camino"), BOSQUE("Bosque");
    
    // Atributos
    private String nombre;
    
    // Constructor privado
    private TipoCasilla(String nombre){
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }
    
    // Método toString
    @Override
    public String toString() {
        return this.nombre;
    }
    
}
