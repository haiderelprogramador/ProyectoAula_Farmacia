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

public class Factura {
    private int idFactura;
    private Recibo recibo;
    private Date fechaFactura;
    private String detalle;
    private float total;

    public Factura(int idFactura, Recibo recibo, Date fechaFactura, String detalle, float total) {
        this.idFactura = idFactura;
        this.recibo = recibo;
        this.fechaFactura = fechaFactura;
        this.detalle = detalle;
        this.total = total;
    }

    public void generarFactura() {
        // Lógica para generar una factura
    }

    // Getters y Setters
    public int getIdFactura() {
        return idFactura;
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public String getDetalle() {
        return detalle;
    }

    public float getTotal() {
        return total;
    }
}
