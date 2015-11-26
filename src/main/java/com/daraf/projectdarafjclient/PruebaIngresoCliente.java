/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daraf.projectdarafjclient;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandra Ponce
 */
public class PruebaIngresoCliente {

    public static void main(String[] args) {
        String identificacion = "0503337909";
        String nombre = "Ana Lucia";
        String telefono = "0993188521";
        String direccion = "Quito";

        if (Communication.insertcliente(identificacion, nombre, telefono, direccion)) {
            JOptionPane.showMessageDialog(null, "Ingreso Correcto");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
        }

    }

}
