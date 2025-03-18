import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private int idPaciente;
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;
    private List<HistorialMedico> historialMedico;

    public Paciente(int idPaciente, String nombre, int edad, String direccion, String telefono) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.historialMedico = new ArrayList<>();
    }

    public void agregarHistorialMedico(HistorialMedico historial) {
        this.historialMedico.add(historial);
    }

    // Getters y Setters
    public int getIdPaciente() {
        return idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<HistorialMedico> getHistorialMedico() {
        return historialMedico;
    }
}