/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.floreria.entidades;

/**
 *
 * @author taisa
 */
public class Descuento {
    private int id;
    private double porcentaje;
    private RegistroVentas registroV;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public RegistroVentas getRegistroV() {
        return registroV;
    }

    public void setRegistroV(RegistroVentas registroV) {
        this.registroV = registroV;
    }
    
    
    
}
