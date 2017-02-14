package videoClub;

import java.util.ArrayList;
import java.util.Iterator;
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
        
        pintaMenu(generaListMenuPrincipal());
        /*do {
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

        } while (opcion != 7);*/
    }
    
    private static void pintaMenu(ArrayList<String> menu){
        
        int i=1;
        for (String posicion : menu){
            System.out.println(i+".- " + posicion);
            i++;    
        }
    }
    
    private static ArrayList<String> generaListMenuPrincipal() {
       
        ArrayList<String> menuPrincipal = new ArrayList();
            menuPrincipal.add("Alta Cliente");
            menuPrincipal.add("Listar Clientes");
            menuPrincipal.add("Listar Peliculas");
            menuPrincipal.add("Listar Peliculas Disponibles");
            menuPrincipal.add("Listar Peliculas Alquiladas");
            menuPrincipal.add("Alquila DVD");
            menuPrincipal.add("Devuelve DVD");
            menuPrincipal.add("Salir");

        return menuPrincipal;
    }

}
