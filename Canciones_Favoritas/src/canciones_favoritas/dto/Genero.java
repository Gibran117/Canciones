package canciones_favoritas.dto;

/**
 *
 * @author mi
 */
public class Genero extends Cancion {
    
    private int id;
    private String Genero;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return "Genero{" + "id=" + id + ", Genero=" + Genero + '}';
    }
    
    
    
}
