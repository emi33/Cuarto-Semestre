package com.mycompany.duraznos;
import java.util.ArrayList;
public class Inventario {
    ArrayList<Producto> productos;
    public Inventario(){
        productos= new ArrayList<>();
    }
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public void listarProductos(){
        for (Producto producto : productos) {
            producto.mostrarDetalles();
        }
    }
    public void buscarProducto(int id){
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == id){
                productos.get(id).mostrarDetalles();
            }
        }
    }
}
