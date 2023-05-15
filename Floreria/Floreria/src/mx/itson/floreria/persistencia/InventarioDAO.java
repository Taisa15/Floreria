/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.floreria.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.floreria.entidades.Flores;
import mx.itson.floreria.entidades.Inventario;


public class InventarioDAO {
    
    public static List<Inventario> obtenerTodos() {
        List<Inventario> inventario = new ArrayList<>();

        try {
            Connection connection = Conexion.obtener();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, idFlores, cantidadExistente FROM inventario");
            while (resultSet.next()) {
                Inventario i = new Inventario();
                i.setId(resultSet.getInt(1));
                Flores fr = new Flores();
                fr.setId(resultSet.getInt(2));
                i.setCantidadExistente(resultSet.getInt(3));
                i.setFlores(fr);
                inventario.add(i);
            }
        } catch (Exception ex) {
            System.err.println("Ocurrio un error " + ex.getMessage());
        }
        return inventario;
    }
    
}
