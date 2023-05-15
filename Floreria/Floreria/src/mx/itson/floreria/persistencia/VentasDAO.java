
package mx.itson.floreria.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.floreria.entidades.Flores;

import mx.itson.floreria.entidades.Venta;
import mx.itson.floreria.entidades.Usuario;

/**
 *
 * @author Axel G. valverde
 */
public class VentasDAO {
    
    public static List<Venta> obtenerTodos() {
        List<Venta> registroVentas = new ArrayList<>();

        try {
            Connection connection = Conexion.obtener();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, fecha, cantidadVendida, precio, idFlores, idUsuario, descuento FROM registro_ventas");
            while (resultSet.next()) {
                Venta rv = new Venta();
                rv.setId(resultSet.getInt(1));
                rv.setFecha(resultSet.getDate(2));
                rv.setCantidadVendida(resultSet.getInt(3));
                rv.setPrecio(resultSet.getDouble(4));
                Flores f = new Flores();
                f.setId(resultSet.getInt(5));
                rv.setFlores(f);
                Usuario u = new Usuario();
                u.setId(resultSet.getInt(6));
                rv.setUsuario(u);
                rv.setDescuento(resultSet.getDouble(7));
                registroVentas.add(rv);
            }
        } catch (Exception ex) {
            System.err.println("Ocurrio un error " + ex.getMessage());
        }
        return registroVentas;
    }
    
    
    
    
}
