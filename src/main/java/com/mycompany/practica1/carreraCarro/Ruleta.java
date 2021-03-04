

package com.mycompany.practica1.carreraCarro;

import java.util.Random;
import java.util.Scanner;

public class Ruleta {
  private final int medianoOro = 75;
    private final int bajoOro = 5;
    private final int altoOro = 2000;
    private final int bajoGemas = 5;
    private final int medianoGemas = 40;
    private final int algoGemas = 2000;
    private final int descuentoJugada = 5;
    private int Oro1 = 0, Oro2 = 0, Oro3 = 0, Gema1 = 0, medinGema = 0, alGema = 0, actual = 0;
    Menu menu = new Menu();
    Random random = new Random();

    public void ruleta() {
        Jugador jugador = new Jugador();
        Scanner ent = new Scanner(System.in);
        Random random = new Random();
        int desicion = 0, opcion;
        do {
            System.out.println("Nombre: " + jugador.getNombre() + "    Monedas de Oro:......" + jugador.getMonedasOro() + "    Gemas:......" + jugador.getGemas());
            System.out.println("************************************************");
            System.out.println("Bienvenido a la Ruleta, espero y lo disfrutes: *");
            System.out.println("\t\033[33m\t\033[33m.:MENU:.                   *");
            System.out.println("1)....Monedas de Oro:                          *");
            System.out.println("2)....Gemas:                                   *");
            System.out.println("3)....Volver al menu principal:                *");
            System.out.println("ELIGE UNA OPCION                               *");
            System.out.println("************************************************");
            opcion = ent.nextInt();
            if ((opcion == 1 || opcion == 2)) {
                actual = jugador.getGemas(); 
                actual-= descuentoJugada;
                jugador.setGemas(actual);

            } 
            switch (opcion) {
                case 1:
                    if (jugador.getGemas() <= 0) {
                        detener();
                        break;
                    }
                    int aleatorio = 0;
                    aleatorio = (int) (Math.random() * 100);
                    System.out.println("Aleatorio: " + aleatorio);
                    if ((aleatorio > 10 && aleatorio <= 35) || aleatorio > 35) {
                        Oro1 = jugador.getMonedasOro();
                        Oro1 += bajoOro;
                        jugador.setMonedasOro(Oro1);
                        System.out.println("Monedas obtenidas: " + bajoOro);
                        System.out.println("Monedas acumuladas: " + jugador.getMonedasOro());

                    } else if (aleatorio > 5 && aleatorio <= 10) {
                        Oro2 = jugador.getMonedasOro();
                        Oro2 = medianoOro;
                        jugador.setMonedasOro(Oro2);
                        System.out.println("Monedas obtenidas: " + medianoOro);
                        System.out.println("Monedas acumuladas: " + jugador.getMonedasOro());

                    } else if (aleatorio <= 5) {

                        Oro3 =jugador.getMonedasOro();
                        Oro3 = altoOro;
                        jugador.setMonedasOro(Oro3);
                        System.out.println("Monedas otenidos: " + altoOro);
                        System.out.println("Monedas acumuladas: " + jugador.getMonedasOro());
                    }

                    break;
                case 2:
                    if (jugador.getGemas() <= 0) {
                        detener();
                        break;
                    }
                    int azar = (int) (Math.random() * 100);
                    System.out.println("Azar: " + azar);
                    if ((azar > 10 && azar <= 30) || azar > 30) {
                        Gema1 = actual;
                        Gema1 += bajoGemas;
                        jugador.setGemas(Gema1);
                        System.out.println("Gemas obtenidas: " + bajoGemas);
                        System.out.println("Gemas acumuladas: " + Gema1);

                    } else if (azar > 5 && azar <= 10) {
                        medinGema = actual;
                        medinGema = medianoGemas;
                        jugador.setGemas(medinGema);
                        System.out.println("Gemas obtenidas: " + medianoGemas);
                        System.out.println("Gemas acumuladas: " + medinGema);

                    } else if (azar <= 5) {
                        alGema = actual;
                        alGema = algoGemas;
                        jugador.setGemas(alGema);
                        System.out.println("Gemas obtenidas: " + algoGemas);
                        System.out.println("Gemas acumuladas: " + jugador.getGemas());
                    }
                    break;
                case 3:
                    desicion = 1;
                    break;

                default:
                    System.out.println("La opcion no es correcta, vuelve a intentar o seleccione <<volver al menu principal>>");

            }

        } while (desicion != 1);
        menu.menu();
    }

    public void detener() {
        Scanner ent = new Scanner(System.in);
        String entrada = "";
        do {
            System.out.println("Te has quedado sin dinero!!     :(   ");
            entrada = ent.nextLine();
            System.out.println(entrada);
        } while (!entrada.equals(""));
        ruleta();
    }

}
