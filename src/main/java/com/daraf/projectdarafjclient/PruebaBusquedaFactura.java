/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daraf.projectdarafjclient;

import com.daraf.projectdarafprotocol.model.Cliente;
import com.daraf.projectdarafprotocol.model.Factura;

/**
 *
 * @author Alejandra Ponce
 */
public class PruebaBusquedaFactura {
    
    public static void main(String[] args) {
        String buscar= "0000000005";
        Factura factura = new Factura();

        factura = Communication.buscarFactura(buscar);
        if (factura != null) {
            System.out.print(factura.astexto());
        } else {
            System.err.println("No encontrado");
        }
    }
    
}
