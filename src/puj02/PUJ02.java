/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puj02;

import java.sql.Connection;
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
            Connection connection = new db.Connection().getConnection();

            //Statement query = connection.createStatement();
            //query.executeUpdate("INSERT INTO korisnik VALUES(null, 'Daniel', 'Vasic', '1234567891222', 'daniel.vasic@fpmoz.sum.ba')");

            Statement query = connection.createStatement();
            String sql = "UPDATE korisnik SET email='dvasic1@gmail.com' WHERE id=1";
            query.executeUpdate(sql);

        } catch (Exception ex) {
            System.out.println("Greska: " + ex.getMessage());
        }
    }
}
