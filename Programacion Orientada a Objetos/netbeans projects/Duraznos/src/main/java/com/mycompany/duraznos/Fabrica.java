package com.mycompany.duraznos;
import java.util.ArrayList;
public class Fabrica {
    ArrayList<Durazno> duraznos;
    Inventario inventario;
    int productoIdCounter;
    
    public Fabrica(){
        duraznos= new ArrayList<>();
        inventario= new Inventario();
    }
    public void ingresarDurazno(Durazno durazno){
        duraznos.add(durazno);
    }
    public void setPIDC(int id){
        this.productoIdCounter=id;
    }
    public int getPIDC(){
        return productoIdCounter;
    }
    public void procesarDuraznos(String tipoProducto){
        double precioTotal=0;
        int pesoTotal=0;
        for(Durazno duraznitos : duraznos){
            pesoTotal+=duraznitos.getPeso();
            switch (tipoProducto){
                case "Mermeladas" -> precioTotal+=duraznitos.getCosto()*1.2;
                case "Conservas" -> precioTotal+=duraznitos.getCosto()*1.3;
                case "Jugos" -> precioTotal+=duraznitos.getCosto()*1.4;
                default -> System.out.printf("Error");
            }
            productoIdCounter++;    
        }
         Producto productos=new Producto(productoIdCounter,
                    tipoProducto, 
                    pesoTotal, 
                    precioTotal);        
            inventario.agregarProducto(productos);
        //duraznos.clear();
        for (int i = duraznos.size()-1; i >=0 ; i--){
           duraznos.remove(i);
        }
    }
    public void mostrarInventario(){
        inventario.listarProductos();
    }
}
