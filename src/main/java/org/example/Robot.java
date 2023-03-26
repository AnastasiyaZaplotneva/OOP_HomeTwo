package org.example;

public class Robot implements SportCompetitions {
    private String name;
    private double maxHeight;
    private double maxDistance;

    public Robot(String name, double maxHeight, double maxDistance) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }

    @Override
    public String introduce() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public double getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(double maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public boolean run(double distance) {
        if(maxDistance >= distance) {
            System.out.println(name + " преодолел дистанцию в " + distance);
            return true;
        }
        else {
            System.out.println(name + " не смог преодолеть дистанцию " + distance);
            return false;
        }
    }

    @Override
    public boolean jump(double height) {
        if(maxHeight >= height) {
            System.out.println(name + " преодолел стену высотой " + height);
            return true;
        }
        else {
            System.out.println(name + " не смог преодолеть стену высотой " + height);
            return false;
        }
    }
}
