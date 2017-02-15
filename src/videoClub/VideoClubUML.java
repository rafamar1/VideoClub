package videoClub;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import utilidades67.ES.ES;


/**
 *
 * @author RafaMar
 */
public class VideoClubUML {


    public static void main(String[] args) throws IOException {
        
        pintaMenu(generaListMenuPrincipal());
        
        VideoClub miVideoClub = new VideoClub("src/datos/clientes.txt", "src/datos/peliculas.txt");
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
