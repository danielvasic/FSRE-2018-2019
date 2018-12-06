package puj02;

import model.Korisnik;

public class PUJ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (Korisnik korisnik : Korisnik.readAll()) {
            korisnik.delete();
        }
    }
}
