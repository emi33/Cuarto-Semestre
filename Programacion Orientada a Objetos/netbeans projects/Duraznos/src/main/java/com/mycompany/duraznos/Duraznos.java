package com.mycompany.duraznos;

public class Duraznos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Fabrica miFabrica = new Fabrica();
        miFabrica.setPIDC(0);
        miFabrica.ingresarDurazno(new Durazno(1,100, "10cm", "A"));
        miFabrica.ingresarDurazno(new Durazno(2,200, "14cm", "C"));
        miFabrica.ingresarDurazno(new Durazno(3,300, "16cm", "B"));
        System.out.println("    Inventario inicial de productos terminados(deberia ser cero):");
        miFabrica.mostrarInventario();
        System.out.println("    Ejemplo PROCESAR DURAZNOS EN MERMELADAS:");
        miFabrica.procesarDuraznos("Mermeladas");
        miFabrica.mostrarInventario();
        System.out.println("    SEGUNDO INVENTARIO INICIAL:");
        miFabrica.ingresarDurazno(new Durazno(4,300, "20cm", "C"));
        miFabrica.ingresarDurazno(new Durazno(5,300, "20cm", "C"));
        miFabrica.ingresarDurazno(new Durazno(6,300, "24cm", "C"));
        System.out.println("    Ejemplo PROCESAR DURAZNOS EN CONSERVAS:");
        System.out.println("    SEGUNDO Inventario inicial de productos terminados(deberia ser cero):");
        miFabrica.procesarDuraznos("Conservas");
        miFabrica.mostrarInventario();
        System.out.println("    Cantidad de productos procesados: "+miFabrica.getPIDC());
        
        
    }
}
