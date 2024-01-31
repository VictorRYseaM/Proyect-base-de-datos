/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author VictorY
 */
public class Conexion {
    public static Connection con;
    private static final String driver ="com.mysql.cj.jdbc.Driver";
    
    public Connection conectar(){
        con=null;
        try {
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/historias", "root", "");
            if (con!=null) {
                
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
}
