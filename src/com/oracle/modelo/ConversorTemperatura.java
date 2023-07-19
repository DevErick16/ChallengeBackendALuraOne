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
public class ConversorTemperatura {
    public static void obtenerDatos(JComboBox<String> cbDatoSeleccion, JComboBox<String> cbDatoConversion, JTextField txtTemperatura, JLabel labelResultado) {
        Double datoTemperatura = Double.parseDouble(txtTemperatura.getText());
        String datoSeleccion = cbDatoSeleccion.getSelectedItem().toString();
        String datoConversion = cbDatoConversion.getSelectedItem().toString();
        Double resultado = realizarConversion(datoSeleccion, datoConversion, datoTemperatura);
        mostrarResultado(resultado, labelResultado);
    }
    
    public static void mostrarResultado(Double resultado, JLabel labelResultado) {
        labelResultado.setText("El resultado de la conversión es: " + resultado);
    }
    
    public static Double realizarConversion(String datoSeleccion, String datoConversion, Double datoTemperatura) {
        Double temperaturaConvertida = 0.0;
        
        switch (datoSeleccion) {
            case "Celsius":
                switch (datoConversion) {
                    case "Celsius":
                        temperaturaConvertida = datoTemperatura;
                        break;
                    case "Fahrenheit":
                        temperaturaConvertida = celsiusAFahrenheit(datoTemperatura);
                        break;
                    case "Kelvin":
                        temperaturaConvertida = celsiusAKelvin(datoTemperatura);
                        break;
                }
                break;
            case "Fahrenheit":
                switch (datoConversion) {
                    case "Celsius":
                        temperaturaConvertida = fahrenheitACelsius(datoTemperatura);
                        break;
                    case "Fahrenheit":
                        temperaturaConvertida = datoTemperatura;
                        break;
                    case "Kelvin":
                        temperaturaConvertida = fahrenheitAKelvin(datoTemperatura);
                        break;
                }
                break;
            case "Kelvin":
                switch (datoConversion) {
                    case "Celsius":
                        temperaturaConvertida = kelvinACelsius(datoTemperatura);
                        break;
                    case "Fahrenheit":
                        temperaturaConvertida = kelvinAFahrenheit(datoTemperatura);
                        break;
                    case "Kelvin":
                        temperaturaConvertida = datoTemperatura;
                        break;
                }
                break;
        }
        
        return temperaturaConvertida;
    }
    
    private static Double celsiusAFahrenheit(Double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    private static Double celsiusAKelvin(Double celsius) {
        return celsius + 273.15;
    }
    
    private static Double fahrenheitACelsius(Double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    private static Double fahrenheitAKelvin(Double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }
    
    private static Double kelvinACelsius(Double kelvin) {
        return kelvin - 273.15;
    }
    
    private static Double kelvinAFahrenheit(Double kelvin) {
        return kelvin * 9 / 5 - 459.67;
    }
}