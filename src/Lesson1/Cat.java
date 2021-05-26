package Lesson1;

import HW1.Party;

public class Cat implements Party {
    String name;
    int maxHeight;
    int maxLength;

    public Cat(int maxHeight, int maxLength, String name) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.name = name;
    }
    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Cat jump");
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }

    @Override
    public String toString() {
        return "Кот по кличке " + name;
    }
}
