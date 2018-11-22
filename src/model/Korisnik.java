package model;

import db.Connection;
import db.Database;

import javax.xml.crypto.Data;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Korisnik implements model {
    private int id;
    private String ime;
    private String prezime;
    private String jmbg;
    private String email;

    private Korisnik () {}

    public Korisnik(int id, String ime, String prezime, String jmbg, String email) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void create() {
        try {
            PreparedStatement stmnt = Database.CONNECTION.prepareStatement(
                    "INSERT INTO korisnik VALUES (null, ?, ?, ?, ?)"
            );
            stmnt.setString(1, this.ime);
            stmnt.setString(2, this.prezime);
            stmnt.setString(3, this.jmbg);
            stmnt.setString(4, this.email);
            stmnt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Greska prilikom stvaranja korisnika u bazi:"
                    + e.getMessage());
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public List<Object> readAll() {
        return null;
    }
}
