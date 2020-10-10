/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Productos {

String Categoria;
String Proveedor;
String Nombre_producto;
String Descripcion_producto;
String Precio_unidad;
String Precio_oferta;
String Precio_liquidacion;
String Precio_mayoreo;
String Estado;
String Existencia;
String Marca;
String Imagen;

public Productos(){
}
 public String getDescripcion_producto() {
        return Descripcion_producto;
    }

    public void setDescripcion_producto(String Descripcion_producto) {
        this.Descripcion_producto = Descripcion_producto;
    }
    
    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public String getNombre_producto() {
        return Nombre_producto;
    }

    public void setNombre_producto(String Nombre_producto) {
        this.Nombre_producto = Nombre_producto;
    }

    public String getPrecio_unidad() {
        return Precio_unidad;
    }

    public void setPrecio_unidad(String Precio_unidad) {
        this.Precio_unidad = Precio_unidad;
    }

    public String getPrecio_oferta() {
        return Precio_oferta;
    }

    public void setPrecio_oferta(String Precio_oferta) {
        this.Precio_oferta = Precio_oferta;
    }

    public String getPrecio_liquidacion() {
        return Precio_liquidacion;
    }

    public void setPrecio_liquidacion(String Precio_liquidacion) {
        this.Precio_liquidacion = Precio_liquidacion;
    }

    public String getPrecio_mayoreo() {
        return Precio_mayoreo;
    }

    public void setPrecio_mayoreo(String Precio_mayoreo) {
        this.Precio_mayoreo = Precio_mayoreo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getExistencia() {
        return Existencia;
    }

    public void setExistencia(String Existencia) {
        this.Existencia = Existencia;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    public Productos(String Categoria, String Proveedor, String Nombre_producto, String Descripcion_producto, String Precio_unidad, String Precio_oferta, String Precio_liquidacion, String Precio_mayoreo, String Estado, String Existencia, String Marca, String Imagen) {
        this.Categoria = Categoria;
        this.Proveedor = Proveedor;
        this.Nombre_producto = Nombre_producto;
        this.Descripcion_producto = Descripcion_producto;
        this.Precio_unidad = Precio_unidad;
        this.Precio_oferta = Precio_oferta;
        this.Precio_liquidacion = Precio_liquidacion;
        this.Precio_mayoreo = Precio_mayoreo;
        this.Estado = Estado;
        this.Existencia = Existencia;
        this.Marca = Marca;
        this.Imagen = Imagen;
    }

 


}
