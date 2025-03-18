/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author usuario
 */
import java.util.Date;
import java.util.List;

public class ordenMedica {
    private int idOrden;
    private Date fecha;
    private Medico medico;
    private Paciente paciente;
    private List<Medicamento> medicamentos;

    public ordenMedica(int idOrden, Date fecha, Medico medico, Paciente paciente, List<Medicamento> medicamentos) {
        this.idOrden = idOrden;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
        this.medicamentos = medicamentos;
    }

    public void enviarReclamo() {
        // Lógica para enviar un reclamo
    }

    // Getters y Setters
    public int getIdOrden() {
        return idOrden;
    }

    public Date getFecha() {
        return fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
}