package canciones_favoritas.dto;

import java.util.List;

/**
 *
 * @author mi
 */
public class Album {
    
    private int id;
    private String NobreAlbum;
    private int FechaLanzamiento;
    private String Grupo;
    private List <Cancion> Canciones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNobreAlbum() {
        return NobreAlbum;
    }

    public void setNobreAlbum(String NobreAlbum) {
        this.NobreAlbum = NobreAlbum;
    }

    public int getFechaLanzamiento() {
        return FechaLanzamiento;
    }

    public void setFechaLanzamiento(int FechaLanzamiento) {
        this.FechaLanzamiento = FechaLanzamiento;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public List<Cancion> getCanciones() {
        return Canciones;
    }

    public void setCanciones(List<Cancion> Canciones) {
        this.Canciones = Canciones;
    }

    @Override
    public String toString() {
        return "Album{" + "id=" + id + ", NobreAlbum=" + NobreAlbum + ", FechaLanzamiento=" + FechaLanzamiento + ", Grupo=" + Grupo + ", Canciones=" + Canciones + '}';
    }
    
    
}
