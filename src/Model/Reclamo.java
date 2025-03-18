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

public class Reclamo {
    private int idReclamo;
    private ordenMedica ordenMedica;
    private String estado;
    private Date fechaReclamo;

    public Reclamo(int idReclamo, ordenMedica ordenMedica, String estado, Date fechaReclamo) {
        this.idReclamo = idReclamo;
        this.ordenMedica = ordenMedica;
        this.estado = estado;
        this.fechaReclamo = fechaReclamo;
    }

    public void actualizarEstado(String estado) {
        this.estado = estado;
    }

    // Getters y Setters
    public int getIdReclamo() {
        return idReclamo;
    }

    public ordenMedica getOrdenMedica() {
        return ordenMedica;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFechaReclamo() {
        return fechaReclamo;
    }
}
