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

public class Recibo {
    private int idRecibo;
    private Date fechaEntrega;
    private Reclamo reclamo;
    private List<Medicamento> medicamentosEntregados;
    private List<Medicamento> medicamentosPendientes;
    private float total;

    public Recibo(int idRecibo, Date fechaEntrega, Reclamo reclamo, List<Medicamento> medicamentosEntregados, List<Medicamento> medicamentosPendientes, float total) {
        this.idRecibo = idRecibo;
        this.fechaEntrega = fechaEntrega;
        this.reclamo = reclamo;
        this.medicamentosEntregados = medicamentosEntregados;
        this.medicamentosPendientes = medicamentosPendientes;
        this.total = total;
    }

    public void generarRecibo() {
        // Lógica para generar un recibo
    }

    // Getters y Setters
    public int getIdRecibo() {
        return idRecibo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public Reclamo getReclamo() {
        return reclamo;
    }

    public List<Medicamento> getMedicamentosEntregados() {
        return medicamentosEntregados;
    }

    public List<Medicamento> getMedicamentosPendientes() {
        return medicamentosPendientes;
    }

    public float getTotal() {
        return total;
    }
}