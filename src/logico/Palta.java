/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logico;

import java.util.*;

/**
 *
 * @author Oscar
 */
public class Palta {

    private double averagePrice, totalVolume, plu4046, plu4225, plu4770, totalBags, smallBags, largeBags, xLargeBags;
    private String type, region;
    private Date fecha;
    private int year;

    public Palta(Date fecha, double averagePrice, double totalVolume, double plu4046, double plu4225, double plu4770, double totalBags, double smallBags, double largeBags, double xLargeBags, String type, int year, String region) {
        this.fecha = fecha;
        this.averagePrice = averagePrice;
        this.totalVolume = totalVolume;
        this.plu4046 = plu4046;
        this.plu4225 = plu4225;
        this.plu4770 = plu4770;
        this.totalBags = totalBags;
        this.smallBags = smallBags;
        this.largeBags = largeBags;
        this.xLargeBags = xLargeBags;
        this.type = type;
        this.year = year;
        this.region = region;
    }

    public void mostrarEstadisticas() {
        System.out.println("|" + this.fecha + "| " + this.averagePrice + "        |  " + this.totalVolume + "    | " + this.plu4046 + "  | " + this.plu4225 + " | " + this.plu4770 + " | " + this.totalBags + "  |  " + this.smallBags + "  |  " + this.largeBags + "  |    " + this.xLargeBags + "       | " + this.type + " | " + this.year + " | " + this.region);

    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public double getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(double totalVolume) {
        this.totalVolume = totalVolume;
    }

    public double getPlu4046() {
        return plu4046;
    }

    public void setPlu4046(double plu4046) {
        this.plu4046 = plu4046;
    }

    public double getPlu4225() {
        return plu4225;
    }

    public void setPlu4225(double plu4225) {
        this.plu4225 = plu4225;
    }

    public double getPlu4770() {
        return plu4770;
    }

    public void setPlu4770(double plu4770) {
        this.plu4770 = plu4770;
    }

    public double getTotalBags() {
        return totalBags;
    }

    public void setTotalBags(double totalBags) {
        this.totalBags = totalBags;
    }

    public double getSmallBags() {
        return smallBags;
    }

    public void setSmallBags(double smallBags) {
        this.smallBags = smallBags;
    }

    public double getLargeBags() {
        return largeBags;
    }

    public void setLargeBags(double largeBags) {
        this.largeBags = largeBags;
    }

    public double getxLargeBags() {
        return xLargeBags;
    }

    public void setxLargeBags(double xLargeBags) {
        this.xLargeBags = xLargeBags;
    }

    public Date getDate() {
        return fecha;
    }

    public void setDate(Date fecha) {
        this.fecha = fecha;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
