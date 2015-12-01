/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daraf.projectdarafjclient;

import com.daraf.projectdarafprotocol.model.DetalleFacturaAppRQ;
import com.daraf.projectdarafprotocol.model.Producto;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandra Ponce
 */
public class PruebaInsertFactura {

    public static void main(String[] args) {

        List<DetalleFacturaAppRQ> detalles = new ArrayList<>();
        detalles.add(new DetalleFacturaAppRQ("1", "3"));
        detalles.add(new DetalleFacturaAppRQ("1", "1"));
        String result = Communication.registrarFactura("1", "1000000000", Calendar.getInstance().getTime(), 200.20f, detalles);
        System.out.println("" + result);
        //1 correcto
        //2 algun producto sobrepasa el stock
        //3 codigo de factura repetido
        //4 talvez no se construyo bien el mensaje
        JOptionPane.showMessageDialog(null, "Mensaje del servidor: " + result);

    }

}
