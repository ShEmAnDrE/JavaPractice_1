package com.company;

public class TestBall {

    public static void main(String[] args) {
        Ball b1 = new Ball("Football", "Leather", 100);
        Ball b2 = new Ball("Basketball", "Rubber");
        Ball b3 = new Ball("Volleyball");
        Ball b4 = new Ball();
        System.out.println(b1.getMaterial());
        System.out.println(b2.getPressure());
        System.out.println(b3.getType());
        b4.setPressure(0);
        System.out.println(b1);
        System.out.println(b4);
    }

}
