/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puj02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author daniel
 */
public class PUJ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionString = "jdbc:mysql://localhost/fsre-puj?user=root&password=csdigital&useSSL=false";
            Connection connection = DriverManager.getConnection(connectionString);
            
            Statement query = connection.createStatement();
            query.executeUpdate("INSERT INTO korisnik VALUES(null, 'Daniel', 'Vasic', '1234567891222', 'daniel.vasic@fpmoz.sum.ba')");
        
        } catch (ClassNotFoundException ex) {
            System.out.println("Nisam našao klasu...");
        } catch (SQLException ex) {
            System.out.println("Greska: " + ex.getMessage());
        }
    }
    
}
