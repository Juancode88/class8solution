package com.example;

public class Pajaro extends Mascota{

    public Pajaro(String nombre, String especie, String raza, int edad, Float tamano, String color, String estadoDeSalud) {
        super(nombre, especie, raza, edad, tamano, color, estadoDeSalud);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("Trinar");
    }

    @Override
    public void alimentar(){
        System.out.println("El pajaro se alimenta de alpiste");
    }
    @Override
    public  void  cuidar(){
        System.out.println("El pajaro debe de salir de su jaula una vez al dia");
    }
}

