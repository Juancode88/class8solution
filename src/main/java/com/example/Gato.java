package com.example;

public class Gato extends Mascota{

    public Gato(String nombre, String especie, String raza, int edad, Float tamano, String color, String estadoDeSalud) {
        super(nombre, especie, raza, edad, tamano, color, estadoDeSalud);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("Miau");
    }

    @Override
    public void alimentar(){
        System.out.println("El gato se alimenta de atún.");
    }

    @Override
    public  void  cuidar(){
        System.out.println("El gato necesita juguetes para activarlo");
    }
}
