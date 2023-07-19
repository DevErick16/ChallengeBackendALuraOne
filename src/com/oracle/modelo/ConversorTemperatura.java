/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oracle.modelo;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author Administrator
 */
public class ConversorTemperatura {
    private static Map<String, Double> unidadesDeTemperatura = new HashMap<>();
    static{
        //lista Celsius
        unidadesDeTemperatura.put("CelsiusFahrenheit", 1.8);
        unidadesDeTemperatura.put("CelsiusKelvin", 1.0);
       
        
        //lista Fahrenheit
        unidadesDeTemperatura.put("FahrenheitCelsius", 0.5555555555555556);
        unidadesDeTemperatura.put("FahrenheitKelvin", 0.5555555555555556);
        
        
         //listaKelvin
        unidadesDeTemperatura.put("KelvinCelsius", 1.0);
        unidadesDeTemperatura.put("KelvinFahrenheit", 1.8);
       
    }
    public static void obtenerDatos (JComboBox<String> cajaSeleccion, JComboBox<String> cajaConversion, double temperatura, JLabel labelResultado){
        String datoSeleccion = cajaSeleccion.getSelectedItem().toString();
        String datoConversion= cajaConversion.getSelectedItem().toString();
        
        double resultadoConversion = realizarConversion(datoSeleccion,datoConversion, temperatura);
        mostrarResultado(resultadoConversion, labelResultado);
        
    }
    public static void mostrarResultado(Double resultado, JLabel labelResultado){
        labelResultado.setText("El resultado de la conversion es: " + resultado);
    }
    
    public static double realizarConversion(String datoSeleccion, String datoConversion, Double temperatura){
        String key = datoSeleccion + datoConversion;
        System.out.println(key);
        if(unidadesDeTemperatura.containsKey(key)){
            double datoTemperatura = unidadesDeTemperatura.get(key);
            System.out.println(datoTemperatura);
            System.out.println(temperatura);
            
            return temperatura * datoTemperatura;
        }
        return 0.0;
    }
    
}
