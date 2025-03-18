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

public class Inventario {
    private int idInventario;
    private Medicamento medicamento;
    private String lote;
    private Date fechaVencimiento;
    private int cantidadDisponible;
    private String estado;

    public Inventario(int idInventario, Medicamento medicamento, String lote, Date fechaVencimiento, int cantidadDisponible, String estado) {
        this.idInventario = idInventario;
        this.medicamento = medicamento;
        this.lote = lote;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidadDisponible = cantidadDisponible;
        this.estado = estado;
    }

    public void actualizarCantidad(int cantidad) {
        this.cantidadDisponible = cantidad;
    }

    public boolean verificarVencimiento() {
        return new Date().before(fechaVencimiento);
    }

    // Getters y Setters
    public int getIdInventario() {
        return idInventario;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public String getLote() {
        return lote;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public String getEstado() {
        return estado;
    }
}