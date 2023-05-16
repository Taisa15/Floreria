
package mx.itson.floreria.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.floreria.entidades.Catalogo;
import mx.itson.floreria.entidades.Flores;

/**
 *
 * @author Axel G. valverde
 */
public class CatalogoDAO {
    
    public static List<Catalogo> obtenerTodos() {
        List<Catalogo> flores = new ArrayList<>();

        try {
            Connection connection = Conexion.obtener();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, idFlores FROM catalago");
            while (resultSet.next()) {
                Catalogo c = new Catalogo();
                c.setId(resultSet.getInt(1));
                Flores fr = new Flores();
                fr.setId(resultSet.getInt(2));
                c.setFlor(fr);
                flores.add(c);
            }
        } catch (Exception ex) {
            System.err.println("Ocurrio un error " + ex.getMessage());
        }
        return flores;
    }
    
    public static boolean guardar(String nombre, int idFlores) {
        boolean resultado = false;
 
    
        try {
            Connection connection = Conexion.obtener();
            String consulta = "INSERT INTO catalogo (idFlores) VALUES (?)";
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setInt(1, idFlores);
            statement.execute();

            resultado = statement.getUpdateCount() == 1;
        } catch (Exception ex) {
            System.err.println("Ocurrio un error " + ex.getMessage());
        }
        return resultado;
    }
    
    
    
    
    
    
    
}
