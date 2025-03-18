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

public class EstadoMedicamento {
    private int idEstado;
    private Medicamento medicamento;
    private String estado;
    private Date fechaEntrega;

    public EstadoMedicamento(int idEstado, Medicamento medicamento, String estado, Date fechaEntrega) {
        this.idEstado = idEstado;
        this.medicamento = medicamento;
        this.estado = estado;
        this.fechaEntrega = fechaEntrega;
    }

    public void actualizarEstado(String estado, Date fechaEntrega) {
        this.estado = estado;
        this.fechaEntrega = fechaEntrega;
    }

    // Getters y Setters
    public int getIdEstado() {
        return idEstado;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }
}
