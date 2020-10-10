/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WerService;

import Modelo.Productos;
import Modelo.ProductosDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author leo
 */
@WebService(serviceName = "Servicios")
public class Servicios {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listar")
    public List<Productos> listar(@WebParam(name = "name") String txt) {
        ProductosDAO dao=new ProductosDAO();
      List datos=dao.listar(txt);
      return datos;
    }
   
   
}
