
package mx.itson.floreria.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.floreria.entidades.Usuario;


public class UsuarioDAO {
    
    public static List<Usuario> obtenerTodos() {
        List<Usuario> usuarios = new ArrayList<>();

        try {
            Connection connection = Conexion.obtener();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, nombre FROM usuario");
            while (resultSet.next()) {
                Usuario u = new Usuario();
                u.setId(resultSet.getInt(1));
                u.setNombre(resultSet.getString(2));
                usuarios.add(u);
            }
        } catch (Exception ex) {
            System.err.println("Ocurrio un error " + ex.getMessage());
        }
        return usuarios;
    }
    
    public static boolean guardar(String nombre) {
        boolean resultado = false;
 
    
        try {
            Connection connection = Conexion.obtener();
            String consulta = "INSERT INTO usuario (nombre) VALUES (?)";
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setString(1, nombre);
            statement.execute();

            resultado = statement.getUpdateCount() == 1;
        } catch (Exception ex) {
            System.err.println("Ocurrio un error " + ex.getMessage());
        }
        return resultado;
    }
    
     public static boolean editar(int id , String nombre) {
        boolean resultado = false;

        try {

            Connection connection = Conexion.obtener();
            String consulta = "UPDATE usuario SET nombre=? WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setString(1, nombre);
            
           
            
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
            String consulta = "DELETE FROM usuario WHERE Id = ?";
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
