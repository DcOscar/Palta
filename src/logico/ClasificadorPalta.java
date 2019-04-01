package logico;

import datos.*;
import java.util.*;

/**
 *
 * @author Oscar
 */
public class ClasificadorPalta {

    private ArrayList<Palta> paltas;
    private ArrayList<String[]> datosPaltas;

    public ClasificadorPalta() {
        Lector lector = new Lector();
        this.datosPaltas = lector.getDatos();
        this.paltas = new ArrayList<Palta>();
        this.clasificarPaltas();
    }

    private void clasificarPaltas() {
        for (int i = 0; i < this.datosPaltas.size(); i++) {
            String[] date = this.datosPaltas.get(i)[1].split("-");
            int[] fechas = {Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2])};
            Date fecha = new Date(fechas[0] - 1900, fechas[1] - 1, fechas[2]);
            double averagePrice = Double.parseDouble(this.datosPaltas.get(i)[2]);
            double totalVolume = Double.parseDouble(this.datosPaltas.get(i)[3]);
            double plu4046 = Double.parseDouble(this.datosPaltas.get(i)[4]);
            double plu4225 = Double.parseDouble(this.datosPaltas.get(i)[5]);
            double plu4770 = Double.parseDouble(this.datosPaltas.get(i)[6]);
            double totalBags = Double.parseDouble(this.datosPaltas.get(i)[7]);
            double smallBags = Double.parseDouble(this.datosPaltas.get(i)[8]);
            double largeBags = Double.parseDouble(this.datosPaltas.get(i)[9]);
            double xLargeBags = Double.parseDouble(this.datosPaltas.get(i)[10]);
            String type = this.datosPaltas.get(i)[11];
            int year = Integer.parseInt(this.datosPaltas.get(i)[12]);
            String region = this.datosPaltas.get(i)[13];
            this.paltas.add(new Palta(fecha, averagePrice, totalVolume, plu4046, plu4225, plu4770, totalBags, smallBags, largeBags, xLargeBags, type, year, region));

        }

    }

    public void mostrarEstadisticasPaltas(int cantidad) {
        if (cantidad > this.paltas.size()) {
            cantidad = this.paltas.size();
        }
        String titulo = "  Date                         Average Price  Total volume   plu4046    plu4225   plu4770 Total Bags Small Bags  Large Bags  xLarge Bags       Type       Year   Region";
        System.out.println(titulo);
        for (int i = 0; i < cantidad; i++) {
            this.paltas.get(i).mostrarEstadisticas();
        }
    }

}
