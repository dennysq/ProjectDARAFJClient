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
import com.daraf.projectdarafprotocol.clienteapp.ingresos.IngresoClienteRQ;
import com.daraf.projectdarafprotocol.clienteapp.ingresos.IngresoClienteRS;
import com.daraf.projectdarafprotocol.clienteapp.seguridades.AutenticacionEmpresaRQ;
import com.daraf.projectdarafprotocol.clienteapp.seguridades.AutenticacionEmpresaRS;
import com.daraf.projectdarafprotocol.model.Empresa;

/**
 *
 * @author Dennys
 */
public class Communication {
/**
 * 
 * @param usuario
 * @param password
 * @return nulo si no se ha encontrado la empresa en el sistema caso contratio trae el objeto empresa
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
            AutenticacionEmpresaRS aers = (AutenticacionEmpresaRS) mensajeRS.getCuerpo();
            if (aers.getResultado().equals("1")) {
                System.out.println(""+aers.getEmpresa());
                return aers.getEmpresa();
            }
        }
        return null;
    }
    public static boolean insertcliente(String id, String nombre, String direccion, String telefono)
    {
                if(nombre!=null && telefono!=null && direccion!=null && id.length()==10)
                {
                    AppClient appClient = new AppClient();
                    IngresoClienteRQ ing= new IngresoClienteRQ();
                    ing.setId(id);
                    ing.setNombre(nombre);
                    ing.setDireccion(direccion);
                    ing.setTelefono(telefono);
                    
                    MensajeRQ mensajeRQ =new MensajeRQ("freddy", Mensaje.ID_MENSAJE_INGRESOCLIENTE);
                    mensajeRQ.setCuerpo(ing);
                    MensajeRS mensajeRS = appClient.sendRequest(mensajeRQ);
                    IngresoClienteRS ingrs=(IngresoClienteRS)mensajeRS.getCuerpo();
                    if (ingrs.getResultado().equals("1")) {
                      return true;
                    }
                      else{
                              return false;
                          }
            }
                return false;
    }
}

