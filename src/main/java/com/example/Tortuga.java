package com.example;

public class Tortuga extends Mascota{

    public Tortuga(String nombre, String especie, String raza, int edad, Float tamano, String color, String estadoDeSalud) {
        super(nombre, especie, raza, edad, tamano, color, estadoDeSalud);
    }

    @Override
    public void hacerSonido(){
        System.out.println("AAAhh");
    }

    @Override
    public void alimentar(){
        System.out.println("La tortuga se alimenta con algas");
    }
    @Override
    public  void  cuidar(){
        System.out.println("La tortugaba debe de nadar en el estanque una vez al día");
    }
}
