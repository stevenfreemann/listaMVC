/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Wilson Steven Rodriguez
 * @author Jhony Rojas
 * Inicio del programa completo creando los objetos de modelo y vista.
 */
public class Main {
     public static void main(String arf[]) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciarVista();
    }
}
