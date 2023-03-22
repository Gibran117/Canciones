package canciones_favoritas.dto;

/**
 *
 * @author mi
 */
public class Persona {
    
    private int id;
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private int FechaNacimiento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public int getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(int FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", Nombre=" + Nombre + ", ApellidoP=" + ApellidoP + ", ApellidoM=" + ApellidoM + ", FechaNacimiento=" + FechaNacimiento + '}';
    }
    
    
}
