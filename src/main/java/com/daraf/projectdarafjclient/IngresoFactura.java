/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daraf.projectdarafjclient;

import com.daraf.projectdarafjclient.validation.ValidacionTecladoLenght;
import com.daraf.projectdarafjclient.validation.ValidacionTecladoLetras;
import com.daraf.projectdarafjclient.validation.ValidacionTecladoNum;
import com.daraf.projectdarafprotocol.model.Cliente;
import com.daraf.projectdarafprotocol.model.DetalleFacturaAppRQ;
import com.daraf.projectdarafprotocol.model.Empresa;
import com.daraf.projectdarafprotocol.model.Producto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Freddy
 */
public class IngresoFactura extends javax.swing.JFrame {

    /**
     * Creates new form IngresoFactura
     */
    private Empresa empresa;

    public IngresoFactura() {
        initComponents();
        ValidacionTecladoLenght v = new ValidacionTecladoLenght(10);
        ValidacionTecladoNum va = new ValidacionTecladoNum();
        txtNumFactura.addKeyListener(v);
        txtNumFactura.addKeyListener(va);
        txtcliente.addKeyListener(new ValidacionTecladoNum());
        txtcliente.addKeyListener(new ValidacionTecladoLenght(20));
        txtproducto.addKeyListener(new ValidacionTecladoLenght(10));
        txtcantidad.addKeyListener(new ValidacionTecladoLenght(2));
        txtcantidad.addKeyListener(new ValidacionTecladoNum());
        this.tblpro.setModel(model);
        this.lbldircli.setText("");
        this.lblidencli.setText("");
        this.lblnompro.setText("");
        this.lbltelcli.setText("");
        this.lblprecio.setText("");
        this.lblnombrecli.setText("");
        this.lblidpro.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtproducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcliente = new javax.swing.JTextField();
        btnbuscarcliente = new javax.swing.JButton();
        btnbuscarproducto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtcantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpro = new javax.swing.JTable();
        lblempresa = new javax.swing.JLabel();
        lblruc = new javax.swing.JLabel();
        lblempdir = new javax.swing.JLabel();
        lblemptel = new javax.swing.JLabel();
        lblidencli = new javax.swing.JLabel();
        lblnombrecli = new javax.swing.JLabel();
        lbltelcli = new javax.swing.JLabel();
        lbldircli = new javax.swing.JLabel();
        lblidpro = new javax.swing.JLabel();
        lblnompro = new javax.swing.JLabel();
        lblprecio = new javax.swing.JLabel();
        btnGuardarFactura = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtNumFactura = new javax.swing.JTextField();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INGRESO FACTURA");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("RUC");

        jLabel4.setText("DIRECCION");

        jLabel5.setText("TELEFONO");

        jLabel6.setText("IDENTIFICACION");

        jLabel7.setText("NOMBRE");

        jLabel8.setText("TELEFONO");

        jLabel9.setText("DIRECCION");

        jLabel10.setText("PRODUCTO");

        jLabel11.setText("CLIENTE");

        btnbuscarcliente.setText("BUSCAR CLIENTE");
        btnbuscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarclienteActionPerformed(evt);
            }
        });

        btnbuscarproducto.setText("BUSCAR PRODUCTO");
        btnbuscarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarproductoActionPerformed(evt);
            }
        });

        jLabel12.setText("ID");

        jLabel13.setText("NOMBRE");

        jLabel14.setText("PRECIO");

        jLabel15.setText("CANTIDAD");

        jButton3.setText("AGREGAR PRODUCTO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tblpro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblpro);

        lblempresa.setText("jLabel16");

        lblruc.setText("jLabel17");

        lblempdir.setText("jLabel18");

        lblemptel.setText("jLabel19");

        lblidencli.setText("jLabel20");

        lblnombrecli.setText("jLabel21");

        lbltelcli.setText("jLabel22");

        lbldircli.setText("jLabel23");

        lblidpro.setText("jLabel24");

        lblnompro.setText("jLabel25");

        lblprecio.setText("jLabel26");

        btnGuardarFactura.setText("Guardar Factura");
        btnGuardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFacturaActionPerformed(evt);
            }
        });

        jLabel16.setText("Número de Factura:");

        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(lblidpro)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblnompro)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtcantidad)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblprecio)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(288, 288, 288)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsalir))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(144, 144, 144)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel11))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblidencli)
                                                .addComponent(lblnombrecli))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbltelcli)
                                                .addComponent(lbldircli)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(23, 23, 23)
                                            .addComponent(btnbuscarcliente))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(btnbuscarproducto))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(265, 265, 265)
                                    .addComponent(btnGuardarFactura)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblruc))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(lblempresa)))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblemptel)
                                    .addComponent(lblempdir))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnsalir))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblempresa)
                    .addComponent(jLabel5)
                    .addComponent(lblemptel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblruc)
                    .addComponent(jLabel4)
                    .addComponent(lblempdir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarcliente))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(lblidencli)
                    .addComponent(lbltelcli))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(lblnombrecli)
                    .addComponent(lbldircli))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarproducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(lblidpro)
                            .addComponent(lblnompro)
                            .addComponent(lblprecio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarFactura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarclienteActionPerformed
        // TODO add your handling code here:

        Cliente cliente = new Cliente();
        cliente = Communication.buscarcliente(txtcliente.getText());
        lblidencli.setText(cliente.getIdentificacion());
        lblnombrecli.setText(cliente.getNombre());
        lbltelcli.setText(cliente.getTelefono());
        lbldircli.setText(cliente.getDireccion());

    }//GEN-LAST:event_btnbuscarclienteActionPerformed

    private void btnbuscarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarproductoActionPerformed
        // TODO add your handling code here:
        Producto producto = new Producto();
        producto = Communication.retrieveProducto(txtproducto.getText());
        lblidpro.setText(producto.getId());
        lblnompro.setText(producto.getNombre());
        lblprecio.setText(producto.getPrecio());
    }//GEN-LAST:event_btnbuscarproductoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Producto producto = new Producto();
        producto = Communication.retrieveProducto(txtproducto.getText());
        System.out.print(producto);
        //DefaultTableModel modelo = (DefaultTableModel) tblpro.getModel();
        //producto = new Producto("20", "7", "88888", "hkjhk");
        // modelo.addRow(new String[]{producto.getId(),producto.getNombre(),txtcantidad.getText(),Double.parseDouble(producto.getPrecio())*Double.parseDouble(txtcantidad.getText())});
        if (!txtcantidad.getText().isEmpty()) {
            model.addRow(new String[]{producto.getId(), producto.getNombre(), txtcantidad.getText()});
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese la cantidad primero");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnGuardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFacturaActionPerformed
        List<DetalleFacturaAppRQ> details = new ArrayList<>();
        DetalleFacturaAppRQ detalle = null;
        float total = 0;
        for (int i = 0; i < model.getRowCount(); i++) {

            detalle = new DetalleFacturaAppRQ();
            detalle.setCantidad(model.getValueAt(i, 3).toString());
            detalle.setIdProducto(model.getValueAt(i, 0).toString());
            total += Float.valueOf(model.getValueAt(i, 2).toString()) * Float.valueOf(model.getValueAt(i, 3).toString());

            details.add(detalle);
        }
        String respuesta = Communication.registrarFactura(txtNumFactura.getText(), lblidencli.getText(), new Date(), total, details);
        if (respuesta.equals("1")) {
            JOptionPane.showMessageDialog(null, "Factura ingresada correctamente");
        }
        if (respuesta.equals("2")) {
            JOptionPane.showMessageDialog(null, "No hay stock de los productos");
        }
        //1 correcto
        //2 algun producto sobrepasa el stock
        //3 codigo de factura repetido
        //4 talvez no se construyo bien el mensaje
        if (respuesta.equals("3")) {
            JOptionPane.showMessageDialog(null, "Código de factura repetida");
        }
        if (respuesta.equals("4")) {
            JOptionPane.showMessageDialog(null, "Error Desconocido");
        }

    }//GEN-LAST:event_btnGuardarFacturaActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IngresoFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarFactura;
    private javax.swing.JButton btnbuscarcliente;
    private javax.swing.JButton btnbuscarproducto;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbldircli;
    private javax.swing.JLabel lblempdir;
    private javax.swing.JLabel lblempresa;
    private javax.swing.JLabel lblemptel;
    private javax.swing.JLabel lblidencli;
    private javax.swing.JLabel lblidpro;
    private javax.swing.JLabel lblnombrecli;
    private javax.swing.JLabel lblnompro;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JLabel lblruc;
    private javax.swing.JLabel lbltelcli;
    private javax.swing.JTable tblpro;
    private javax.swing.JTextField txtNumFactura;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtproducto;
    // End of variables declaration//GEN-END:variables

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
        lblempresa.setText(empresa.getNombre());
        lblemptel.setText(empresa.getTelefono());
        lblruc.setText(empresa.getRuc());
        lblempdir.setText(empresa.getDireccion());
    }
    DefaultTableModel model = new DefaultTableModel(new String[]{"Id Producto", "Nombre", "Precio", "Cantidad"}, 0);

}
