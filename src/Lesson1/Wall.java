package Lesson1;

import HW1.Obstacles;

public class Wall implements Obstacles {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean toRun(int maxLength) {
        return false;
    }

    @Override
    public boolean toJump(int maxHeight) {
        return (maxHeight >= height);
    }

    @Override
    public String toString() {
        return "Стена высотой" + height + "м";
    }
}
