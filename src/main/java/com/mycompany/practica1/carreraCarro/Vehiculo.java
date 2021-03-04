

package com.mycompany.practica1.carreraCarro;


public class Vehiculo {
    private int gasolina;
            private String nombre;
            private String color;
            private int potencia;

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public void primerVehiculo(){
        
        nombre="Porsche 718 ";
        color="\033[36mCyan";
        gasolina=80;
        potencia=4;
        System.out.println("\t\033[33mVEHICULO #1");
        System.out.println("Nombre: "+nombre+"    Color  "+color);
        System.out.println("Gasolina: "+gasolina+"     Potenccia  "+potencia);
        
        String carro1="\033[36m->";
        System.out.println(carro1);
    }
    public void segundoVehiculo(){
        nombre="BMW";
        color="\033[32mVerde";
        gasolina=90;
        potencia=5;
        System.out.println("\t\033[33mVEHICULO #2");
        System.out.println("Nombre: "+nombre+"    Color  "+color);
        System.out.println("Gasolina: "+gasolina+"     Potenccia  "+potencia);
        
        String carro2="\033[32m=>";
        System.out.println(carro2);
    }
    public void tercerVehiculo(){
        nombre="Ford";
        color="\033[34mAzul";
        gasolina=100;
        potencia=8;
        System.out.println("\t\033[33mVEHICULO #3");
        System.out.println("Nombre: "+nombre+"    Color  "+color);
        System.out.println("Gasolina: "+gasolina+"     Potenccia  "+potencia);
        
        String carro3="\033[34m=0>";
        System.out.println(carro3);
    }
    public void todosVehiculos(){
        System.out.println("Opciones");
        primerVehiculo();
        segundoVehiculo();
        tercerVehiculo();
        System.out.println("Elige uno de los tres vehiculos");
    }
            
            
}
