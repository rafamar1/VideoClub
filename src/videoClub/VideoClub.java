package videoClub;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class VideoClub {

    private HashMap listaClientes;

    private TreeSet listaPeliculas;

    private HashMap<String, ArrayList<Copia>> copiasDisponibles;

    public VideoClub(String clientes, String peliculas) throws IOException {
        this.listaClientes = new HashMap();
        this.listaPeliculas = new TreeSet();
        this.copiasDisponibles = new HashMap();
        cargaClientesDeFichero(clientes);
        cargaPeliculasDeFichero(peliculas);
    }

    public Set<Copia> copias(String titulo) {
        /*IDEA - NO SERIA MEJOR QUE DEVOLVIERA UN ARRAYLIST Y NO UN SET????*/
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Cliente cliente(String nombre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void alquila(String nombre, String titulo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void devuelve(String nombre, String titulo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String disponibles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String alquiladas(String nombreCliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void cargaClientesDeFichero(String nombreFichero) throws FileNotFoundException, IOException {

        FileReader fileReader;
        BufferedReader bufferedReader = null;
        String linea;
        try {

            fileReader = new FileReader(nombreFichero);
            bufferedReader = new BufferedReader(fileReader);

            while ((linea = bufferedReader.readLine()) != null) {

                Cliente cliente = new Cliente(linea);
                /*Si el metodo fuera estatico la siguiente linea daria error, ya que hemos definido
                  el atributo lineaClientes como no-estatico*/
                listaClientes.put(cliente.getNombreCliente(), cliente);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error en el fichero -> " + nombreFichero + " no se puede abrir");
        } finally {
            bufferedReader.close();
        }
    }

    private void cargaPeliculasDeFichero(String nombreFichero) throws FileNotFoundException, IOException {

        FileReader fileReader;
        BufferedReader bufferedReader = null;
        String linea;
        try {

            fileReader = new FileReader(nombreFichero);
            bufferedReader = new BufferedReader(fileReader);
            DVD pelicula;
            while ((linea = bufferedReader.readLine()) != null) {
                /*Split va añadiendo cada separacion por "*" a una nueva posicion del array*/
                String[] datosPelicula = linea.split("\\*");/*El asterisco es un caracter especial
                                                                y debe tratarse con la doble "\\"*/
                String[]arrayActores = datosPelicula[3].split(",");
                ArrayList actores = new ArrayList();
                    for (String actor : arrayActores) {
                        actores.add(actor);
                    }
                pelicula = new DVD(datosPelicula[0], datosPelicula[1], datosPelicula[2], actores);
                listaPeliculas.add(pelicula);
                int numeroDeCopias = Integer.parseInt(datosPelicula[4]);
                Copia copiaNumeroX;
                ArrayList<Copia> copias = new ArrayList();
                    for (int i = 0; i < numeroDeCopias; i++) {
                        copiaNumeroX= new Copia(i+1,pelicula.getCodigo());
                        copias.add(copiaNumeroX);
                    }
                copiasDisponibles.put(pelicula.getTitulo(), copias);
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error en el fichero -> " + nombreFichero + " no se puede abrir");
        } 
    }
    
}
