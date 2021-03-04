

package com.mycompany.practica1.carreraCarro;


public class Jugador {
  private String nombre;
    private String nickname;
    private int edad;
    private  int gemas=30;
    private Vehiculo vehiculo;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Jugador(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setGemas(int gemas) {
        this.gemas = gemas;
    }

    public void setMonedasOro(int monedasOro) {
        this.monedasOro = monedasOro;
    }
    private  int monedasOro=50;

    public Jugador() {
        String nombre;
        this.nickname = nickname;
        this.edad = edad;
    }


    public  int getGemas() {
        return gemas;
    }

    public int getMonedasOro() {
        return monedasOro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


   

    public String getNombre() {
        return nombre;
    }

 

    public String getNickname() {
        return nickname;
    }

  

    public int getEdad() {
        return edad;
    }

   


}


