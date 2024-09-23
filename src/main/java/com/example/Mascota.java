package com.example;

abstract class Mascota {
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private Float tamano;
    private String color;
    private String estadoDeSalud;

    public Mascota(String nombre, String especie, String raza, int edad, Float tamano, String color, String estadoDeSalud) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        this.color = color;
        this.estadoDeSalud = estadoDeSalud;
    }

    

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public Float getTamano() {
        return tamano;
    }

    public String getColor() {
        return color;
    }

    public String getEstadoDeSalud() {
        return estadoDeSalud;
    }

    public abstract void hacerSonido();
    public abstract void alimentar();
    public abstract void cuidar();

    public void mostrarInformacion() {
        System.out.println("Nombre de la mascota: "+ nombre );
        System.out.println("Especie: " + especie);
        System.out.println("raza: "+raza);
        System.out.println("edad(años): "+ edad);
        System.out.println("Tamaño(Cm): "+tamano);
        System.out.println("Color: "+ color);
        System.out.println("Estado de salud: "+ estadoDeSalud);
    }
}   

