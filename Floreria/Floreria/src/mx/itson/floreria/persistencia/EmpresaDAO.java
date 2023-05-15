
package mx.itson.floreria.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.floreria.entidades.Empresa;



public class EmpresaDAO {
    
    public static List<Empresa> obtenerTodos() {
        List<Empresa> empresas = new ArrayList<>();

        try {
            Connection connection = Conexion.obtener();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, nombre, direccion, telefono, totalTipo FROM empresa");
            while (resultSet.next()) {
                Empresa e = new Empresa();
                e.setId(resultSet.getInt(1));
                e.setNombre(resultSet.getString(2));
                e.setDireccion(resultSet.getString(3));
                e.setTelefono(resultSet.getString(4));
                e.setTotalTipo(resultSet.getInt(5));
                empresas.add(e);
            }
        } catch (Exception ex) {
            System.err.println("Ocurrio un error " + ex.getMessage());
        }
        return empresas;
    }
    
    public static boolean guardar(String nombre, String direccion, String telefono) {
        boolean resultado = false;
 
    
        try {
            Connection connection = Conexion.obtener();
            String consulta = "INSERT INTO empresa (nombre, direccion, telefono) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setString(1, nombre);
            statement.setString(2, direccion);
            statement.setString(3, telefono);
            statement.execute();

            resultado = statement.getUpdateCount() == 1;
        } catch (Exception ex) {
            System.err.println("Ocurrio un error " + ex.getMessage());
        }
        return resultado;
    }
    
    public static boolean editar(int id , String nombre, String direccion, String telefono) {
        boolean resultado = false;

        try {

            Connection connection = Conexion.obtener();
            String consulta = "UPDATE empresa SET nombre=?, direccion=?, telefono=? WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setString(1, nombre);
            statement.setString(2, direccion);
            statement.setString(3, telefono);
           
            
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
            String consulta = "DELETE FROM empresa WHERE Id = ?";
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
