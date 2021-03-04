

package com.mycompany.practica1.carreraCarro;


public class Pista {
    private static final int tamañoTierra = 80;
    private static final int tamañoArena = 90;
    private static final int tamañoConcreto = 100;
    private static final int coeficienteTierra=4;
    private static final int coeficienteArena=2;
    private static final int coeficienteConcreto=6;
    private static final int gasolinaTierra=80;
    private static final int gasolinaArena=90;
     private static final int gasolinaConcreto=100;
    Menu menu = new Menu();
    PedirDatos datos=new PedirDatos();
    Jugador jugador = new Jugador();
    public void todos() {
        System.out.println("Nombre: "+jugador.getNombre()+"    Monedas de Oro:......"+jugador.getMonedasOro()+"    Gemas:......"+jugador.getGemas());
        System.out.println("\t\033[33m\nPISTAS DISPONIBLES PARA LA COMPETENCIA:\n");
        tierra();
        arena();
        cemento();
        menu.detener();
    }

    public static void tierra() {

        System.out.println("PISTA DE TIERRA, TAMAÑO:......."+tamañoTierra+"      COEFICIENTE:......."+coeficienteTierra+"\n");
        for (int i = 0; i < tamañoTierra; i++) {
            String camino = "\033[31m-";

            System.out.print(camino);
        }
        System.out.println("\n\n\n\n");
    }

    public static void arena() {
         System.out.println("PISTA DE ARENA, TAMAÑO:..........."+tamañoArena+"      COEFICIENTE:..........."+coeficienteArena+"\n");
        for (int i = 0; i < tamañoArena; i++) {
            String camino = "\033[33m-";

            System.out.print(camino);
        }
        System.out.println("\n\n\n\n");

    }

    public static void cemento() {
        System.out.println("PISTA DE ARENA, TAMAÑO:..........."+tamañoConcreto+"      COEFICIENTE:..........."+coeficienteConcreto+"\n");
        for (int i = 0; i < tamañoConcreto; i++) {
            String camino = "\u001B[0m-";

            System.out.print(camino);
        }
        System.out.println("\n\n\n\n");
    }
    public void gasolinaPorPista(){
        System.out.println("Nombre: "+jugador.getNombre()+"    Monedas de Oro:......"+jugador.getMonedasOro()+"    Gemas:......"+jugador.getGemas());
        System.out.println("\t\033[33m\nGASOLINA POR PISTA:\n");
        gasolinaTierra();
        gasolinaArena();
        gasolinaConcreto();
        menu.detener();
     
    
    }
        public static void gasolinaTierra() {

        System.out.println("PISTA DE TIERRA, TAMAÑO:......."+tamañoTierra+"      REQUIERE DE:......."+gasolinaTierra+" Galones\n");
        for (int i = 0; i < tamañoTierra; i++) {
            String camino = "\033[31m-";

            System.out.print(camino);
        }
        System.out.println("\n\n\n\n");
    }
        public static void gasolinaArena() {

        System.out.println("PISTA DE TIERRA, TAMAÑO:......."+tamañoArena+"      REQUIERE DE:......."+gasolinaArena+" Galones\n");
        for (int i = 0; i < tamañoArena; i++) {
            String camino = "\033[31m-";

            System.out.print(camino);
        }
        System.out.println("\n\n\n\n");
    }
        public static void gasolinaConcreto() {

        System.out.println("PISTA DE TIERRA, TAMAÑO:......."+tamañoConcreto+"      REQUIERE DE:......."+gasolinaConcreto+" Galones\n");
        for (int i = 0; i < tamañoConcreto; i++) {
            String camino = "\033[31m-";

            System.out.print(camino);
        }
        System.out.println("\n\n\n\n");
    }

}
