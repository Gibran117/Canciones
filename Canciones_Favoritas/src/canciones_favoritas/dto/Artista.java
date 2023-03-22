package canciones_favoritas.dto;

/**
 *
 * @author mi
 */
public class Artista extends Persona {
    
    private int id;
    private String NombreArtista;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getNombreArtista() {
        return NombreArtista;
    }

    public void setNombreArtista(String NombreArtista) {
        this.NombreArtista = NombreArtista;
    }
    
    
    
}
