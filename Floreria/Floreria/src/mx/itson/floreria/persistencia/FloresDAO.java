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


public class FloresDAO {
    
    public static List<Flores> obtenerTodos() {
        List<Flores> flores = new ArrayList<>();

        try {
            Connection connection = Conexion.obtener();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, codigo, nombre, precio, cantidad FROM flores");
            while (resultSet.next()) {
                Flores f = new Flores();
                f.setId(resultSet.getInt(1));
                f.setCodigo(resultSet.getString(2));
                f.setNombre(resultSet.getString(3));
                f.setPrecio(resultSet.getDouble(4));
                f.setCantidad(resultSet.getInt(5));
                flores.add(f);
            }
        } catch (Exception ex) {
            System.err.println("Ocurrio un error " + ex.getMessage());
        }
        return flores;
    }
        public static boolean guardar(String codigo, String nombre, double precio, int cantidad) {
        boolean resultado = false;
 
    
        try {
            Connection connection = Conexion.obtener();
            String consulta = "INSERT INTO flores (codigo, nombre, precio, cantidad) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setString(1, codigo);
            statement.setString(2, nombre);
            statement.setDouble(3, precio);
            statement.setInt(4, cantidad);
            statement.execute();

            resultado = statement.getUpdateCount() == 1;
        } catch (Exception ex) {
            System.err.println("Ocurrio un error " + ex.getMessage());
        }
        return resultado;
    }
        
         public static boolean editar(int id , String codigo, String nombre, double precio, int cantidad) {
        boolean resultado = false;

        try {

            Connection connection = Conexion.obtener();
            String consulta = "UPDATE flores SET codigo=?, nombre=?, precio=?, cantidad=? WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setString(1, codigo);
            statement.setString(2, nombre);
            statement.setDouble(3, precio);
            statement.setInt(4, cantidad);
            
            statement.executeUpdate();
            resultado = statement.getUpdateCount() == 1;
        } catch (Exception ex) {
            System.err.println("Ocurrio un error " + ex.getMessage());
        }
        return resultado;

    }
         
          public static boolean eliminar(int id) {
        boolean resultado = false;
        try {
            Connection connection = Conexion.obtener();
            String consulta = "DELETE FROM flores WHERE Id = ?";
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (Exception ex) {
            System.err.println("Ocurrio un error " + ex.getMessage());
        }
        return resultado;
    }
        
        


    }
    

