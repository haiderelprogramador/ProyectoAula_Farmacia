/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

public class Medicamento {
    private int idMedicamento;
    private String nombre;
    private String dosis;
    private int cantidad;
    private String lote;
    private Date fechaVencimiento;
    private Inventario inventario;

    public Medicamento(int idMedicamento, String nombre, String dosis, int cantidad, String lote, Date fechaVencimiento, Inventario inventario) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.dosis = dosis;
        this.cantidad = cantidad;
        this.lote = lote;
        this.fechaVencimiento = fechaVencimiento;
        this.inventario = inventario;
    }

    public boolean verificarDisponibilidad() {
        return inventario.getCantidadDisponible() >= cantidad;
    }

    public boolean verificarVencimiento() {
        return new Date().before(fechaVencimiento);
    }

    // Getters y Setters
    public int getIdMedicamento() {
        return idMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDosis() {
        return dosis;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getLote() {
        return lote;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Inventario getInventario() {
        return inventario;
    }
}
