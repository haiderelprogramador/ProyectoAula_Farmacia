package Model;

import java.util.ArrayList;
import java.util.List;

public class Medico {
    private int idMedico;
    private String nombre;
    private String especialidad;
    private List<Paciente> pacientesAtendidos;

    public Medico(int idMedico, String nombre, String especialidad) {
        this.idMedico = idMedico;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.pacientesAtendidos = new ArrayList<>();
    }

    public OrdenMedica crearOrdenMedica(Paciente paciente, List<Medicamento> medicamentos) {
        return new OrdenMedica(1, new Date(), this, paciente, medicamentos); // Ejemplo simplificado
    }

    // Getters y Setters
    public int getIdMedico() {
        return idMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Paciente> getPacientesAtendidos() {
        return pacientesAtendidos;
    }
}