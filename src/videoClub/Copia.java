package videoClub;

public class Copia {

    private int numeroCopia;
    
    private String codigo;

    public Copia(int numCopia, String codigo) {
        this.numeroCopia = numCopia;
        this.codigo=codigo;
    }

    public int getNumeroCopia() {
        return numeroCopia;
    }

    public String getCodigoPelicula() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Numero de Copia=" + numeroCopia + "Codigo de Pelicula=" + codigo;
    }
    
}
