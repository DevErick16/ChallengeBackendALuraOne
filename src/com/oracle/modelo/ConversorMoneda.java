/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oracle.modelo;

import static com.oracle.modelo.ConversionUtil.mostrarResultado;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ConversorMoneda {
    private static Map<String, Double> listaConversiones = new HashMap<>();
    static{
        //lista pesos
        listaConversiones.put("PesoDolar", 0.060);
        listaConversiones.put("PesoEuro", 0.053);
        listaConversiones.put("PesoLibra", 0.046);
        listaConversiones.put("PesoYenes", 8.29);
        listaConversiones.put("PesoPeso", 1.0);
        
        //lista Dolares
        listaConversiones.put("DolarPeso", 16.75);
        listaConversiones.put("DolarEuro", 0.89);
        listaConversiones.put("DolarLibra", 0.77);
        listaConversiones.put("DolarYenes", 138.93);
        listaConversiones.put("DolarDolar", 1.0);
        
        //lista Euro
        listaConversiones.put("EuroPeso", 18.82);
        listaConversiones.put("EuroEuro", 1.0);
        listaConversiones.put("EuroLibra", 0.86);
        listaConversiones.put("EuroYenes", 156.00);
        listaConversiones.put("EuroDolar", 1.12);
        
        //lista libra
        listaConversiones.put("LibraPeso", 21.84);
        listaConversiones.put("LibraEuro", 1.16);
        listaConversiones.put("LibraLibra", 1.0);
        listaConversiones.put("LibraYenes", 181.07);
        listaConversiones.put("LibraDolar", 1.30);
        
        
        //lista Yenes
        listaConversiones.put("YenesPeso", 0.12);
        listaConversiones.put("YenesEuro", 0.0064);
        listaConversiones.put("YenesLibra", 0.0055);
        listaConversiones.put("YenesYenes", 1.0);
        listaConversiones.put("YenesDolar", 0.0072);
        
    }
    public static void obtenerDatos(JComboBox<String> monedaSeleccion, JComboBox<String> monedaConversion, JTextField txtMonto, JLabel labelResultado){
        Double montoUsuario = Double.parseDouble(txtMonto.getText().toString());
        String monedaSeleccionada = monedaSeleccion.getSelectedItem().toString();
        String monedaDeConversion = monedaConversion.getSelectedItem().toString();
        double resultado = realizarCambio(monedaSeleccionada, monedaDeConversion, montoUsuario);
        mostrarResultado(resultado, labelResultado);
        
    }

    public static Double realizarCambio(String monedaSeleccionada, String monedaDeConversion, Double montoUsuario){
        String key= monedaSeleccionada + monedaDeConversion;
        
        if (listaConversiones.containsKey(key)) {
            double datoConversion = listaConversiones.get(key);
            return datoConversion * montoUsuario;
        }
        return 0.0;
        
    }
    
}
