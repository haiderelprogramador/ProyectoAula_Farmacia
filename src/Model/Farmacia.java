/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author usuario
 */
import java.util.List;

public class Farmacia {
    private int idFarmacia;
    private String nombre;
    private List<Medicamento> medicamentosDisponibles;

    public Farmacia(int idFarmacia, String nombre, List<Medicamento> medicamentosDisponibles) {
        this.idFarmacia = idFarmacia;
        this.nombre = nombre;
        this.medicamentosDisponibles = medicamentosDisponibles;
    }

    public void procesarReclamo(Reclamo reclamo) {
        // Lógica para procesar un reclamo
    }

    // Getters y Setters
    public int getIdFarmacia() {
        return idFarmacia;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Medicamento> getMedicamentosDisponibles() {
        return medicamentosDisponibles;
    }
}
