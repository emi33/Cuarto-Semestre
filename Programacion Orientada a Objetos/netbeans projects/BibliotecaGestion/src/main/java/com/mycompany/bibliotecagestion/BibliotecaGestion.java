package com.mycompany.bibliotecagestion;

public class BibliotecaGestion {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Magazine revista = new Magazine("La Guerra de las Galaxias", "Jeffrey Brown", 1983, 143);
        System.out.println(revista.getDetails());
        Book book = new Book("Novela","El jugador" , "Fyodor Dostoevsky", 1866);
        System.out.println(book.getDetails());
        DigitalMedia digitalMedia = new DigitalMedia("PDF", "JSON cursos", "John Newman", 2024);
        System.out.println(digitalMedia.getDetails());
    }
}
