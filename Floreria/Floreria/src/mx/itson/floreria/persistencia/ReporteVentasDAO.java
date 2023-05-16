
package mx.itson.floreria.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.floreria.entidades.Flores;
import mx.itson.floreria.entidades.Venta;
import mx.itson.floreria.entidades.ReporteVentas;

/**
 *
 * @author Axel G. valverde
 */
public class ReporteVentasDAO {
    
    /*
    public static List<ReporteVentas> obtenerTodos() {
        List<ReporteVentas> reporteVentas = new ArrayList<>();

        try {
            Connection connection = Conexion.obtener();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT rv.idVentas, f.nombre, v.cantidadVendida, v.fecha, rv.total FROM reporte_ventas rv INNER JOIN ventas v ON rv.idVentas = v.id INNER JOIN flores f ON v.idFLores = f.id");
            while (resultSet.next()) {
                
                ReporteVentas reporteV = new ReporteVentas();
                reporteV.setId(resultSet.getInt(1));
                
                Flores f = new Flores();
                f.setNombre(resultSet.getString(2));
                
                Venta v = new Venta();
                v.setCantidadVendida(resultSet.getInt(3));
                v.setFecha(resultSet.getDate(4));
                
                reporteV.setTotal(resultSet.getDouble(5));
                reporteVentas.add(reporteV);
            }
        } catch (Exception ex) {
            System.err.println("Ocurrio un error " + ex.getMessage());
        }
        return reporteVentas;
    }
    */
}
