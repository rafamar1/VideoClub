package videoClub;


import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeMap;

public class DVD implements Comparable {

    private String codigo;

    private String titulo;

    private String director;

    private ArrayList listaActores;

    public DVD(String titulo, String codigo, String director, ArrayList listaActores) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public ArrayList getListaActores() {
        return listaActores;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.titulo);
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
        final DVD other = (DVD) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }

    

    public boolean equals() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "Titulo de la Pelicula= " + titulo + "Codigo= " + codigo + "Director= " +
                                        director + "Lista de Actores=" + listaActores ;
    }

    
    
    @Override
    public int CompareTo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
