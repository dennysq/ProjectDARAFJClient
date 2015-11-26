/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daraf.projectdarafjclient;

import com.daraf.projectdarafprotocol.model.Cliente;

/**
 *
 * @author Alejandra Ponce
 */
public class PruebaBusquedaCliente {

    public static void main(String[] args) {
        String buscar;
        Cliente cliente = new Cliente();

        cliente = Communication.buscarcliente("0000000000");
        if (cliente != null) {
            System.out.print(cliente.asTexto());
        } else {
            System.err.println("No encontrado");
        }
    }

}
