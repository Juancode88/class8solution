package com.example;

public class Perro extends Mascota{

    public Perro(String nombre, String especie, String raza, int edad, Float tamano, String color, String estadoDeSalud) {
        super(nombre, especie, raza, edad, tamano, color, estadoDeSalud);
    }

    @Override
    public void hacerSonido(){
        System.out.println("Gauu.");
    }

    @Override
    public void alimentar(){
        System.out.println("El perro se alimenta de croquetas.");
    }

    @Override
    public  void  cuidar(){
        System.out.println("El perro necesita paseos diarios y un baño semanal.");
    }
}
