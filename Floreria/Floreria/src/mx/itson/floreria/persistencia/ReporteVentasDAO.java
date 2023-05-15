
package mx.itson.floreria.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.floreria.entidades.Venta;
import mx.itson.floreria.entidades.ReporteVentas;

/**
 *
 * @author Axel G. valverde
 */
public class ReporteVentasDAO {
    
    public static List<ReporteVentas> obtenerTodos() {
        List<ReporteVentas> reporteVentas = new ArrayList<>();

        try {
            Connection connection = Conexion.obtener();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, idRegistroVentas, total FROM reporte_ventas");
            while (resultSet.next()) {
                ReporteVentas reporteV = new ReporteVentas();
                reporteV.setId(resultSet.getInt(1));
                Venta rv = new Venta();
                rv.setId(resultSet.getInt(2));
                reporteV.setRegistroVen(rv);
                reporteV.setTotal(resultSet.getDouble(3));
                reporteVentas.add(reporteV);
            }
        } catch (Exception ex) {
            System.err.println("Ocurrio un error " + ex.getMessage());
        }
        return reporteVentas;
    }
    
}
