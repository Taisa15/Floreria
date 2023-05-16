
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
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/floresbd?user=root&password=Cr7711xd");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conexion;

    }
    
}
