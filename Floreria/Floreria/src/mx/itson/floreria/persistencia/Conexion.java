
package mx.itson.floreria.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Axel G. valverde
 */
public class Conexion {
    
    public static Connection obtener() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/floresdb?user=root&password=soliban020917");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conexion;

    }
    
}
