/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oracle.modelo;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class ConversorPeso {
    public static Map<String, Double> listaConversionesPeso = new HashMap<>();
    static{
        //lista Kilogramo
       listaConversionesPeso.put("kilogramogramo", 1000.00);
       listaConversionesPeso.put("kilogramolibra", 2.20462);
       listaConversionesPeso.put("kilogramotonelada", 0.001);
       listaConversionesPeso.put("kilogramokilogramo", 1.0);
        //lista gramo
       listaConversionesPeso.put("gramogramo", 1.0);
       listaConversionesPeso.put("gramolibra", 0.00220462);
       listaConversionesPeso.put("gramotonelada", 1000000.00);
       listaConversionesPeso.put("gramokilogramo", 0.001);

        //lista libra
       listaConversionesPeso.put("libragramo", 453.592);
       listaConversionesPeso.put("libralibra", 1.0);
       listaConversionesPeso.put("libratonelada", 0.000453592);
       listaConversionesPeso.put("librakilogramo", 0.453592);
       
       //lista tonelada 
       listaConversionesPeso.put("toneladagramo", 1000000.00);
       listaConversionesPeso.put("toneladalibra", 2204.62);
       listaConversionesPeso.put("toneladatonelada", 1.0);
       listaConversionesPeso.put("toneladakilogramo", 1000.00);
    }
    



    
    public static void  obtenerDatos(JComboBox<String> cbDatoSeleccionado, JComboBox<String> cbDatoConversion, JTextField peso, JLabel labelResultado){
        Double datoPeso = Double.parseDouble(peso.getText().toString());
        String datoSeleccionado = cbDatoSeleccionado.getSelectedItem().toString();
        String datoConversion = cbDatoConversion.getSelectedItem().toString();
        Double resultadoConversion = realizarConversion(datoSeleccionado, datoConversion, datoPeso);
        mostrarResultado(resultadoConversion, labelResultado);
    }
    public static void mostrarResultado(Double resultado, JLabel labelResultado){
        labelResultado.setText("el resultado de la conversion es: "+ resultado);
    }
    public static Double realizarConversion(String datoSeleccionado, String datoConversion, Double peso){
        String key = datoSeleccionado + datoConversion;
        if(listaConversionesPeso.containsKey(key)){
            Double conversionSeleccionada = listaConversionesPeso.get(key);
            return conversionSeleccionada * peso;
        }
        return 0.00;
    }
}
