package videoClub;

import utilidades67.ES.ES;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author RafaMar
 */
public class VideoClubUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        do {
            menu();
                    
           opcion = ES.leeN("Introduzca una opcion: ");        
        
        switch (opcion) {

                case 1:
                    
                    break;

                case 2:
                    
                    break;

                case 3:
                    
                    break;

                case 4:
                    
                    break;

                case 5:
                    break;

                case 6:
                   
                    break;

                case 7:
                    break;
                default:
                    
                    break;
            }

        } while (opcion != 7);
    }
    
    
    private static void menu() {
        System.out.println("1.- Alta Cliente");
        System.out.println("2.- Listar Clientes");
        System.out.println("3.- Listar Peliculas");
        System.out.println("4.- Listar Peliculas Disponibles");
        System.out.println("5.- Listar Peliculas Alquiladas");
        System.out.println("6.- Alquila DVD");
        System.out.println("7.- Devuelve DVD");
        System.out.println("8.- Salir");
    }

}
   