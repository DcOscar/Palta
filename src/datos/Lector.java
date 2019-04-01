package datos;

import java.util.*;
import java.io.*;

/**
 *
 * @author Oscar
 */
public class Lector {

    private ArrayList<String[]> datos;

    public Lector() {
        this.datos = new ArrayList<String[]>();
        leerDatos();
    }

    private void leerDatos() {
        try {
            String cadena;
            FileReader f = new FileReader("PrecioPaltas.csv");
            BufferedReader b = new BufferedReader(f);
            b.readLine();
            while ((cadena = b.readLine()) != null) {
                String[] datos = cadena.split(",");
                this.datos.add(datos);
            }
            b.close();

        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public ArrayList getDatos() {
        return this.datos;
    }
}
