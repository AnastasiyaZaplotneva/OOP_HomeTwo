package org.example;

public class Treadmill extends SportsFacility{
    private  double distance;

    public Treadmill(double distance) {
        this.distance = distance;
    }

    @Override
    public double getInfo() {
        return distance;
    }
}
