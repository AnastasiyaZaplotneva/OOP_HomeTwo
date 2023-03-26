package org.example;

public class Wall extends SportsFacility{
    double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public double getInfo() {
        return height;
    }
}
