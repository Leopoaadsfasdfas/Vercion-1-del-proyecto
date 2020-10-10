
package Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductosDAO implements ListaPord{
        Conexion cn=new Conexion();
//se crean las variable que se van a utilizar para consulta
PreparedStatement ps;
ResultSet rs;
Connection con;//creo una variable conexion
Conexion conex=new Conexion();

    @Override
    public List listar(String producto) {//traer productos por medio de su nombre
List<Productos> datos=new ArrayList();
String sql="select c.nombre_categoria,pr.nombre_proveedor,p.nombre_producto,p.descripcion_producto,p.precio_unidad,p.precio_oferta,p.precio_liquidacion ,p.precio_mayoreo,p.estado,p.existencia_producto,p.Marca_producto,p.imagen_producto from productos p\n" +
"inner join categoria c\n" +
"on id_categoria=id_categoria1\n" +
"INNER JOIN proveedores pr\n" +
"on id_proveedor1=id_proveedor\n" +
"where nombre_producto like '%"+producto+"%' or c.nombre_categoria like '%"+producto+"%'"
        + " or p.Marca_producto like '%"+producto+"%';";
        try {
            con=conex.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){//Mientras aya datos  que se extraigan
                Productos u=new Productos();
                u.setCategoria(rs.getString(1));
                u.setProveedor(rs.getString(2));
                u.setNombre_producto(rs.getString(3));
                u.setDescripcion_producto(rs.getString(4));
                u.setPrecio_unidad(rs.getString(5));
                u.setPrecio_oferta(rs.getString(6));
                u.setPrecio_liquidacion(rs.getString(7));
                u.setPrecio_mayoreo(rs.getString(8));
                u.setEstado(rs.getString(9));
                u.setExistencia(rs.getString(10));
                u.setMarca(rs.getString(11));
                u.setImagen(rs.getString(12));
                datos.add(u);
            }
        } catch (Exception e) {
        }
        return datos;
    }


    
   
}
