package org.example;

public class Main {
    public static void main(String[] args) {
        SportsFacility[] obstacleCourse = {
                new Wall(0.5),
                new Wall(0.9),
                new Treadmill(50.0),
                new Wall(1.3),
                new Treadmill(160.0),
                new Wall(2.8),
                new Treadmill(250.0),
                new Wall(1.9)
        };

        SportCompetitions[] listOfParticipants = {
                new Human("Vasya Botanik", 1.5, 200.0),
                new Cat("Murzik", 3.0, 220.0),
                new Human("Elena Isinbaeva", 5.0, 500.0),
                new Robot("R2D2", 0.2, 1000.0),
                new Robot("BambleBee", 10.0, 3000.0),
                new Cat("Dusya", 2.8, 300.0)
        };

        for (SportCompetitions s : listOfParticipants) {
            System.out.println("На полосу препятствий выходит " + s.introduce());
            for (SportsFacility o : obstacleCourse) {
                if (o instanceof Wall) {
                   if(!s.jump(o.getInfo())) break;
                }
                else {
                    if(!s.run(o.getInfo())) break;
                }
            }
            System.out.println();
        }
    }
}