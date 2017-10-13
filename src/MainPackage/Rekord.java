/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

/**
 *
 * @author admin
 */
public class Rekord {
    int id;
    String date; // ??
    double distance;
    double timeHours;
    double timeMins;
    double vAvg; // wyliczeniowy
    double vMax;
    public Rekord(int id, String date, double distance, double timeHours, double timeMins, double vMax)
    {
        this.id = id;
        this.date = date;
        this.distance = distance;
        this.timeHours = timeHours;
        this.timeMins = timeMins;
        this.vMax = vMax;
        this.vAvg = countAvg();
    }

    private double countAvg() {
        double x = distance / (timeHours + (timeMins/60));
        return x;
    }

    void showData() {
        System.out.println("ID: " + id);
        System.out.println("Distance: " + distance);
        System.out.println("Time: " + timeHours + ":" + timeMins);
        System.out.println("V avg: " + vAvg);
        System.out.println("V max: " + vMax);  
    }

}
