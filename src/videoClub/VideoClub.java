package videoClub;


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class VideoClub {

    private HashMap listaClientes;

    private TreeSet listaPeliculas;
    
    private HashMap <String, ArrayList<Copia>>  copiasDisponibles;

    public VideoClub(File clientes, File peliculas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Set<Copia> copias(String titulo) {
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
}
