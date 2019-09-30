/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author WIlson Steven Rodriguez
 * @author Jhony Rojas
 * Capa que se encarga de almacenar y procesar la informacion.
 */
public class Modelo {
    private ArrayList<String> palabras = new ArrayList<>();
    
    /**
     * metodo que nos agrega la palabra a la lista
     * @param palabra 
     */
    public void agregarPalabra(String palabra){
        palabras.add(palabra);
    
    }
/**
 * Getters y Setters de la clase
 * @return 
 */
    public ArrayList<String> getPalabras() {
        return palabras;
    }

    public void setPalabras(ArrayList<String> palabras) {
        this.palabras = palabras;
    }


    
    
    
}
