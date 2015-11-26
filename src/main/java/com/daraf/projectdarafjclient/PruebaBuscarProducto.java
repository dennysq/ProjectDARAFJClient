/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daraf.projectdarafjclient;


import com.daraf.projectdarafprotocol.model.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandra Ponce
 */
public class PruebaBuscarProducto {

    public static void main(String[] args) {

        String idProducto;
        idProducto = "1";

        Producto producto = Communication.retrieveProducto(idProducto);
        if (producto != null) {
            JOptionPane.showMessageDialog(null, "Producto encontrado: \n"+
                    "Id: "+producto.getId()+"\n"+
                    "Nombre: "+producto.getNombre()+"\n"+
                    "Precio: "+producto.getPrecio()+"\n"+
                    "Cantidad: "+producto.getCantidad()+"\n");
        } else {
            JOptionPane.showMessageDialog(null, "Id producto no se encontro en la base de datos");
        }
    }

}
