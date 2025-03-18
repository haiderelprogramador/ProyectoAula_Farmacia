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

public class Entrega {
    private int idEntrega;
    private Recibo recibo;
    private Paciente paciente;
    private List<Medicamento> medicamentosEntregados;
    private Date fechaEntrega;

    public Entrega(int idEntrega, Recibo recibo, Paciente paciente, List<Medicamento> medicamentosEntregados, Date fechaEntrega) {
        this.idEntrega = idEntrega;
        this.recibo = recibo;
        this.paciente = paciente;
        this.medicamentosEntregados = medicamentosEntregados;
        this.fechaEntrega = fechaEntrega;
    }

    public void registrarEntrega() {
        // Lógica para registrar una entrega
    }

    // Getters y Setters
    public int getIdEntrega() {
        return idEntrega;
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public List<Medicamento> getMedicamentosEntregados() {
        return medicamentosEntregados;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }
}
