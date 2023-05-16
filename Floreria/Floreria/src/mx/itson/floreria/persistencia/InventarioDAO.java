/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.floreria.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
            ResultSet resultSet = statement.executeQuery("SELECT f.nombre, i.cantidadExistente FROM inventario i INNER JOIN flores f ON i.idFlores = f.id");
            while (resultSet.next()) {
                Inventario i = new Inventario();
                //i.setId(resultSet.getInt(1));
                Flores fr = new Flores();
                fr.setNombre(resultSet.getString(1));
                i.setCantidadExistente(resultSet.getInt(2));
                i.setFlores(fr);
                inventario.add(i);
            }
        } catch (Exception ex) {
            System.err.println("Ocurrio un error " + ex.getMessage());
        }
        return inventario;
    }
    
    public static boolean editar(int id , int idFlores, int cantidadExistente) {
        boolean resultado = false;

        try {

            Connection connection = Conexion.obtener();
            String consulta = "UPDATE inventario SET idFlores=?, cantidadExistente=? WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setInt(1, id);
            statement.setInt(2, cantidadExistente);
            
            statement.executeUpdate();
            resultado = statement.getUpdateCount() == 1;
        } catch (Exception ex) {
            System.err.println("Ocurrio un error " + ex.getMessage());
        }
        return resultado;

    }
    
}
