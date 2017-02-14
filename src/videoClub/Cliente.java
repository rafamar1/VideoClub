package videoClub;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Cliente {

    private String nombreCliente;

    private HashMap <String, ArrayList<Copia>>  peliculasAlquiladas;

    public Cliente(String nombre) {
       this.nombreCliente = nombre;
       peliculasAlquiladas = new HashMap();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public HashMap<String, ArrayList<Copia>> getPeliculasAlquiladas() {
        return peliculasAlquiladas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nombreCliente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nombreCliente, other.nombreCliente)) {
            return false;
        }
        return true;
    }
    
    
    
    public void alquila(DVD pelicula) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public DVD devuelve(String titulo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
