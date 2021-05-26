package Lesson1;

import HW1.Cat;
import HW1.Human;
import HW1.Obstacles;
import HW1.Party;
import HW1.Robot;
import HW1.RunningTrack;
import HW1.Wall;

public class Event {
    public static void main(String[] args) {
        HW1.Party[] members = {
                new Cat(1, 2, "Fluffy"),
                new Human(2, 4, "Dima"),
                new Robot(1, 3, "ВАЛЛ-И")
        };

        HW1.Obstacles[] obstacles = {
                new RunningTrack(5),
                new Wall(4)
        };

        for (Party member : members) {
            System.out.println("К прохождению приступает" + member);
            boolean winner = true;
            for (Obstacles obstacles1 : obstacles) {
                System.out.println(member + "пытается пройти" + obstacles1);
                if (obstacles1.toJump(member.getMaxHeight()) ||
                        obstacles1.toRun(member.getMaxLength())) {
                    System.out.println("Успешно");
                } else {
                    winner = false;
                    System.out.println("Успешно");
                }
            }
            if(winner) {
                System.out.println(member + "");
            } else {
                System.out.println(member + "");
            }
            System.out.println();
        }
    }
}
