/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daraf.projectdarafjclient;

import com.daraf.projectdarafprotocol.AppClient;
import com.daraf.projectdarafprotocol.Mensaje;
import com.daraf.projectdarafprotocol.clienteapp.MensajeRQ;
import com.daraf.projectdarafprotocol.clienteapp.MensajeRS;
import com.daraf.projectdarafprotocol.clienteapp.consultas.ConsultaClienteRQ;
import com.daraf.projectdarafprotocol.clienteapp.consultas.ConsultaClienteRS;
import com.daraf.projectdarafprotocol.clienteapp.ingresos.IngresoClienteRQ;
import com.daraf.projectdarafprotocol.clienteapp.ingresos.IngresoClienteRS;
import com.daraf.projectdarafprotocol.clienteapp.ingresos.IngresoFacturaRQ;
import com.daraf.projectdarafprotocol.clienteapp.ingresos.IngresoFacturaRS;
import com.daraf.projectdarafprotocol.clienteapp.seguridades.AutenticacionEmpresaRQ;
import com.daraf.projectdarafprotocol.clienteapp.seguridades.AutenticacionEmpresaRS;
import com.daraf.projectdarafprotocol.model.DetalleFacturaAppRQ;
import com.daraf.projectdarafprotocol.model.Empresa;
import com.daraf.projectdarafutil.NetUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dennys
 */
public class Communication {

    public static final String OK_RESPONSE = "OK";
    public static final String BAD_RESPONSE = "BAD";
    public static final String NULL_PARAMETERS = "Uno de los campos usados para el metodo es nulo";

    /**
     *
     * @param usuario
     * @param password
     * @return nulo si no se ha encontrado la empresa en el sistema caso
     * contratio trae el objeto empresa
     */
    public static Empresa retrieveEmpresa(String usuario, String password) {
        if (usuario != null && password != null) {
            AppClient appClient = new AppClient();
            AutenticacionEmpresaRQ aerq = new AutenticacionEmpresaRQ();

            aerq.setPassword(password);
            aerq.setUserId(usuario);

            MensajeRQ mensajeRQ = new MensajeRQ("dennys", Mensaje.ID_MENSAJE_AUTENTICACIONCLIENTE);
            mensajeRQ.setCuerpo(aerq);
            MensajeRS mensajeRS = appClient.sendRequest(mensajeRQ);
            if (mensajeRS != null) {
                AutenticacionEmpresaRS aers = (AutenticacionEmpresaRS) mensajeRS.getCuerpo();
                if (aers.getResultado().equals("1")) {
                    System.out.println("" + aers.getEmpresa());
                    return aers.getEmpresa();
                }
            }
        }
        return null;
    }

    public static boolean insertcliente(String id, String nombre, String direccion, String telefono) {
        if (nombre != null && telefono != null && direccion != null && id.length() == 10) {
            AppClient appClient = new AppClient();
            IngresoClienteRQ ing = new IngresoClienteRQ();
            ing.setId(id);
            ing.setNombre(nombre);
            ing.setDireccion(direccion);
            ing.setTelefono(telefono);

            MensajeRQ mensajeRQ = new MensajeRQ("freddy", Mensaje.ID_MENSAJE_INGRESOCLIENTE);
            mensajeRQ.setCuerpo(ing);
            MensajeRS mensajeRS = appClient.sendRequest(mensajeRQ);
            if (mensajeRS != null) {
                IngresoClienteRS ingrs = (IngresoClienteRS) mensajeRS.getCuerpo();
                if (ingrs.getResultado().equals("1")) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static String registrarFactura(String identificacionCliente, Date fecha, float totalFactura, List<DetalleFacturaAppRQ> detalles) {

        if (identificacionCliente != null && fecha != null && detalles != null) {
            IngresoFacturaRQ ingresoFacturaRQ = new IngresoFacturaRQ();
            AppClient appClient = new AppClient();

            ingresoFacturaRQ.setDetalles(detalles);

            ingresoFacturaRQ.setIdentificacion(identificacionCliente);
            ingresoFacturaRQ.setNumeroDetalles(String.valueOf(detalles.size()));
            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
            ingresoFacturaRQ.setFecha(sdf.format(fecha));
            BigDecimal total = new BigDecimal(totalFactura).setScale(2, RoundingMode.HALF_UP);
            ingresoFacturaRQ.setTotal(total.toPlainString());
            MensajeRQ mensajeRQ = new MensajeRQ(NetUtil.getLocalIPAddress(), Mensaje.ID_MENSAJE_INGRESOFACTURA);
            mensajeRQ.setCuerpo(ingresoFacturaRQ);
            MensajeRS mensajeRS = appClient.sendRequest(mensajeRQ);
            if (mensajeRS != null) {
                IngresoFacturaRS ingresoFacturaRS = (IngresoFacturaRS) mensajeRS.getCuerpo();
                if (ingresoFacturaRS.getResultado().equals("1")) {
                    return OK_RESPONSE;
                } else {
                    return BAD_RESPONSE;
                }
            }
            return BAD_RESPONSE;
        } else {
            return NULL_PARAMETERS;
        }

    }

    public static boolean buscarcliente(String identificacion) {
        if (identificacion != null && identificacion.length() == 10) {
            AppClient appClient = new AppClient();
            ConsultaClienteRQ cliRQ = new ConsultaClienteRQ();
            cliRQ.setIdentificacion(identificacion);

            MensajeRQ mensajeRQ = new MensajeRQ("CONSULTACL", Mensaje.ID_MENSAJE_CONSULTACLIENTE);
            mensajeRQ.setCuerpo(cliRQ);
            MensajeRS mensajeRS = appClient.sendRequest(mensajeRQ);
            ConsultaClienteRS cliRS = (ConsultaClienteRS) mensajeRS.getCuerpo();

        }
        return false;
    }

}
