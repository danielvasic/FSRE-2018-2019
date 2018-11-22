/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puj02;

import model.Korisnik;

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
        Korisnik k = new Korisnik(
                0,
                "Pero",
                "Perić",
                "1234567891221",
                "pero@gmail.com");
        k.create();

        Korisnik k1 = new Korisnik(
                0,
                "Ivo",
                "Ivić",
                "1234567891232",
                "ivo@gmail.com");
        k1.create();
    }
}
