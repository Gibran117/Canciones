package canciones_favoritas.dto;

import java.util.List;

/**
 *
 * @author mi
 */
public class Grupo {
    
    private int id;
    private String NombreGrupo;
    private List <Artista> Integrantes;
    private List <Album> Albunes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreGrupo() {
        return NombreGrupo;
    }

    public void setNombreGrupo(String NombreGrupo) {
        this.NombreGrupo = NombreGrupo;
    }

    public List<Artista> getIntegrantes() {
        return Integrantes;
    }

    public void setIntegrantes(List<Artista> Integrantes) {
        this.Integrantes = Integrantes;
    }

    public List<Album> getAlbunes() {
        return Albunes;
    }

    public void setAlbunes(List<Album> Albunes) {
        this.Albunes = Albunes;
    }

    @Override
    public String toString() {
        return "Grupo{" + "id=" + id + ", NombreGrupo=" + NombreGrupo + ", Integrantes=" + Integrantes + ", Albunes=" + Albunes + '}';
    }
    
    
    
}
