/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Wilson Steven Rodriguez Gonzalez
 * @author Jhony Rojas
 * Capa que se encarga de controlar el modelo y la vista.
 */
public class Controlador implements ActionListener {
    public Modelo modelo;
    public Vista vista;
    private String palabra;
    private String let;
    DefaultListModel def_lista;
    private ArrayList<String> l;
    
/**
 * COnstructor donde se recibe el modelo y la vista y aparte se inicia los eventros de el boton
 * y se crea un array list temporal.
 * @param modelo
 * @param vista 
 */
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.ingresar.addActionListener(this);
        def_lista = new DefaultListModel();  
        l = new ArrayList<>();
         
    }
    
    /**
     * Metodo que se encarga de capturar algun evento en la parte grafica
     * Aqui se almacena de forma temporal los datos que estan en el modelo
     * para luego enviarlos a la vista.
     * @param evento 
     */
    public void actionPerformed(ActionEvent evento) {
        if (!"".equals(vista.campoTexto.getText())) {
           
            def_lista.clear();
            vista.lista.setModel(def_lista);
            palabra=vista.campoTexto.getText();
            modelo.agregarPalabra(palabra);
             vista.campoTexto.setText("");
            l = modelo.getPalabras();
            
            for (String temp : l) {
                def_lista.addElement(temp);       
            }
            vista.lista.setModel(def_lista);
            vista.lista.setBackground(Color.GREEN);
        }
    
    /**
     * metodo que inicia la vista
     * le agregamos el titulo
     */
    
    }
     public void iniciarVista() {
        vista.setTitle("MVC");
        vista.pack();
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
     /**
      * Getters y Setters de la clase.
      * @return 
      */

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    
}
