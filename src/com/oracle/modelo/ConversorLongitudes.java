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
public class ConversorLongitudes {
    public static Map<String, Double> listaConversionLongitud = new HashMap<>();
    static {
        // lista centimetro
        listaConversionLongitud.put("CentimetroMetro",0.01);
        listaConversionLongitud.put("CentimetroKilometro",0.000005);
        listaConversionLongitud.put("CentimetroMilla",0.00000621);
        listaConversionLongitud.put("CentimetroPies",0.0328083887992);
        listaConversionLongitud.put("CentimetroCentimetro",1.0);
        //lista metro
        listaConversionLongitud.put("MetroCentimetro", 100.0);
        listaConversionLongitud.put("MetroKilometro", 0.001);
        listaConversionLongitud.put("MetroMilla", 0.000621371);
        listaConversionLongitud.put("MetroPies", 3.28084);
        listaConversionLongitud.put("MetroMetro", 1.0);
        //lista kilometro
        listaConversionLongitud.put("KilometroCentimetro", 100000.0);
        listaConversionLongitud.put("KilometroMetro", 1000.0);
        listaConversionLongitud.put("KilometroMilla", 0.621371);
        listaConversionLongitud.put("KilometroPies", 3280.84);
        listaConversionLongitud.put("KilometroKilometro", 1.0);
        //lista milla 
        listaConversionLongitud.put("MillaCentimetro", 160934.0);
        listaConversionLongitud.put("MillaMetro", 1609.34);
        listaConversionLongitud.put("MillaKilometro", 1.60934);
        listaConversionLongitud.put("MillaPies", 5280.0);
        listaConversionLongitud.put("MillaMilla", 1.0);
        //lista pies
        listaConversionLongitud.put("PiesCentimetro", 30.48);
        listaConversionLongitud.put("PiesMetro", 0.3048);
        listaConversionLongitud.put("PiesKilometro", 0.0003048);
        listaConversionLongitud.put("PiesMilla", 0.000189394);
        listaConversionLongitud.put("PiesPies", 1.0);
    }
    
    public static void obtenerDatos(JComboBox<String> cbdatoSeleccion, JComboBox<String> cbdatoconversion, JTextField txtLongitud, JLabel labelResultado){
        Double datoLongitud = Double.parseDouble(txtLongitud.getText().toString());
        String datoSeleccion = cbdatoSeleccion.getSelectedItem().toString();
        String datoConversion = cbdatoconversion.getSelectedItem().toString();
        Double resultado = realizarConversion(datoSeleccion, datoConversion, datoLongitud);
        mostrarResultado(resultado, labelResultado);
    }
    public static void mostrarResultado(Double resultado, JLabel labelResultado){
        labelResultado.setText("El resultado de la conversion es: " + resultado);
    }
    
    public static Double realizarConversion(String datoSeleccion, String datoConversion, Double datoLongitud){
        String key = datoSeleccion + datoConversion;
        if(listaConversionLongitud.containsKey(key)){
            Double conversion = listaConversionLongitud.get(key);
            return conversion * datoLongitud;
        }
       return 0.0;
    }
}
