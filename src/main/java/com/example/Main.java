package com.example;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Max", "Canino", "Labrador", 3, 140f, "Dorado", "Saludable");
        Gato gato = new Gato("Mina", "Felino", "Siames", 2, 90f, "Gris", "Saludable");
        Pajaro pajaro = new Pajaro("Loro", "Ave", "Loro", 1, 30f, "Verde", "Saludable");
        Tortuga tortuga = new Tortuga("Toby", "Reptil", "Tortuga", 5, 40f, "Marrón", "Saludable");

        System.out.println("Perro:");
        perro.hacerSonido();
        perro.alimentar();
        perro.cuidar();
        perro.mostrarInformacion();

        System.out.println("\nGato:");
        gato.hacerSonido();
        gato.alimentar();
        gato.cuidar();
        gato.mostrarInformacion();

        System.out.println("\nPájaro:");
        pajaro.hacerSonido();
        pajaro.alimentar();
        pajaro.cuidar();
        pajaro.mostrarInformacion();

        System.out.println("\nTortuga:");
        tortuga.hacerSonido();
        tortuga.alimentar();
        tortuga.cuidar();
        tortuga.mostrarInformacion();
    }
}