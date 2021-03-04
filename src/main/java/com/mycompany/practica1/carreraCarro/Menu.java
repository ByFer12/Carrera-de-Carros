

package com.mycompany.practica1.carreraCarro;

import java.util.Scanner;

public class Menu {
     Scanner ent = new Scanner(System.in);
    Jugador jugador = new Jugador();
     Vehiculo vehiculo = new Vehiculo();

   
    public void terminos() {
        char termino;
        PedirDatos datos= new PedirDatos();
        System.out.println("************************************************************");
        System.out.println("Para continuar debe aceptar los terminos y condiciones...  *");
        System.out.println("<< S >> para aceptar                                       *");
        System.out.println("<< N >> para no aceptar                                    *");
        System.out.println("************************************************************");
        termino = ent.next().charAt(0);
        if (termino == 's' || termino == 'S') {
            datos.pedirDatos();
            elegirCarro();
            detener();
           
        } else if (termino == 'N' || termino == 'n') {
            System.out.println("No has aceptado los terminos y condiciones y has terminado automaticamente el juego");
                detener();
        } else {
            System.err.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("Incorrecto, intentalo de nuevo !!! ");
            System.err.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            
            terminos();
        }
    }

    public void menu() {
        Scanner ent = new Scanner(System.in);
        int desicion = 0, opcion;
        do {
            System.out.println("Nombre: "+jugador.getNombre()+"    Monedas de Oro:......"+jugador.getMonedasOro()+"    Gemas:......"+jugador.getGemas());
            System.out.println("************************************");
            System.out.println("\t\033[33m.:MENU:.                 *");
            System.out.println("1)....Competir:                    *");
            System.out.println("2)....Ruleta:                      *");
            System.out.println("3)....Garage:                      *");
            System.out.println("4)....Pistas:                      *");
            System.out.println("5)....Estadisticas y Reportes:     *");
            System.out.println("6)....Salir                        *");
            System.out.println("ELIGE UNA OPCION                   *");
            System.out.println("************************************");
            opcion = ent.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    Ruleta ruleta=new Ruleta();
                    ruleta.ruleta();
                    break;
                case 3:
                    break;
                case 4:
                    menuPistas();
                    break;
                case 5:
                    break;
                case 6:
                    desicion=1;
                    break;
                default:
                    System.out.println("Intentalo de nuevo:");

                }
           

        } while (desicion != 1);
    }

  

    public void detener() {
       
        String entrada = "";
        do {
            System.out.println("Precione enter para continuar...");
            entrada = ent.nextLine();
            System.out.println(entrada);
        } while (!entrada.equals(""));
        System.out.println("ADIOS :(");
    }
    public void menuPistas(){
         Pista pista = new Pista();
        int desicion=0,opcion;
        do{
            System.out.println("Nombre: "+jugador.getNombre()+"    Monedas de Oro:......"+jugador.getMonedasOro()+"    Gemas:......"+jugador.getGemas());
            System.out.println("****************************************************");
            System.out.println("Opciones:                                          *");
            System.out.println("1) Ver la gasolina necesaria para cada pista:      *");
            System.out.println("2) Ver pistas:                                     *");
            System.out.println("3) Volver al menu principal:                       *");
            System.out.println("Elige una de las opciones                          *");
            System.out.println("****************************************************");
            opcion=ent.nextInt();
            switch(opcion){
                case 1:
                    pista.gasolinaPorPista();
                    break;
                case 2:
                    pista.todos();
                    break;
                case 3:
                    desicion=1;
                    break;
                default:
                    System.out.println("Ingrese una de las tres opciones");
                    menuPistas();
            
            }
        }while(desicion!=1);
        menu();
    }
    public void elegirCarro(){
        int opcion,desicion=0;
        do{
            vehiculo.todosVehiculos();
            
            opcion=ent.nextInt();
            switch(opcion){
                case 1:
                    menu();
                    break;
                case 2:
                    menu();
                    break;
                case 3:
                    menu();
                    break;
                default :
                    elegirCarro();
            
            }
            
        }while(desicion!=1);
    }
    public void menuCompetir(){
    
    }
    public void menuGarage(){
    
    }
    public void menuEstadisticas(){
    
    }
    
    
  

}
