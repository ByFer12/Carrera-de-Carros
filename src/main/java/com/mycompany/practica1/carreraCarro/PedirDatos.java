

package com.mycompany.practica1.carreraCarro;

import java.util.Scanner;


public class PedirDatos {
     Jugador jugador;
    
    public void pedirDatos() {
        Scanner ent = new Scanner(System.in);
        String nombre;
        String nickname;
        int edad;
        System.out.println("Para continuar debe llenar sus daotos: ");
        System.out.println("Registre su Nombre: ");
        nombre = ent.nextLine();
        System.out.println("Registre su Nickname: ");
        nickname = ent.nextLine();
        System.out.println("Registre su edad: ");
        edad = ent.nextInt();
        Jugador jugador = new Jugador();
        jugador.setNombre(nombre);
        jugador.getNickname();
        jugador.setEdad(edad);
    }
}
