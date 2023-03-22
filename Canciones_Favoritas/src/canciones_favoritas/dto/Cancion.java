package canciones_favoritas.dto;

import java.util.List;

/**
 *
 * @author mi
 */
public class Cancion {
    
    private int id;
    private String Compositor;
    private double Duracion;
    private List  <Persona> Artistas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompositor() {
        return Compositor;
    }

    public void setCompositor(String Compositor) {
        this.Compositor = Compositor;
    }

    public double getDuracion() {
        return Duracion;
    }

    public void setDuracion(double Duracion) {
        this.Duracion = Duracion;
    }

    public List<Persona> getArtistas() {
        return Artistas;
    }

    public void setArtistas(List<Persona> Artistas) {
        this.Artistas = Artistas;
    }

    @Override
    public String toString() {
        return "Cancion{" + "id=" + id + ", Compositor=" + Compositor + ", Duracion=" + Duracion + ", Artistas=" + Artistas + '}';
    }
    
    
}
