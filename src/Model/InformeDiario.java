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

public class InformeDiario {
    private int idInforme;
    private Date fecha;
    private List<Entrega> entregas;

    public InformeDiario(int idInforme, Date fecha, List<Entrega> entregas) {
        this.idInforme = idInforme;
        this.fecha = fecha;
        this.entregas = entregas;
    }

    public void generarInforme() {
       
    }

    public int getIdInforme() {
        return idInforme;
    }

    public Date getFecha() {
        return fecha;
    }

    public List<Entrega> getEntregas() {
        return entregas;
    }
}
