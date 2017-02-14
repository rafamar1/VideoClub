package videoClub;

public class Copia {

    private int numCopia;
    
    private String codigoPelicula;

    public Copia(int numCopia, String codigo) {
        this.numCopia = numCopia;
        this.codigoPelicula=codigo;
    }

    public int getNumCopia() {
        return numCopia;
    }

    public String getCodigoPelicula() {
        return codigoPelicula;
    }

    @Override
    public String toString() {
        return "Numero de Copia=" + numCopia + "Codigo de Pelicula=" + codigoPelicula;
    }
    
}
