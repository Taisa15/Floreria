/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.floreria.entidades;

import java.util.Date;

/**
 *
 * @author taisa
 */
public class Venta {

    private int id;
    private Date fecha;
    private int cantidadVendida;
    private double precio;
    private Flores flores;
    private Usuario usuario;
    private double descuento;
    private double precioTotal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Flores getFlores() {
        return flores;
    }

    public void setFlores(Flores flores) {
        this.flores = flores;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

  
    public Venta(int id, Date fecha, int cantidadVendida, double precio, Flores flores, double descuento, double precioTotal) {
    this.id = id;
    this.fecha = fecha;
    this.cantidadVendida = cantidadVendida;
    this.precio = precio;
    this.flores = flores;
    this.descuento = descuento;
    this.precioTotal = precioTotal;
    }
    
    
}
