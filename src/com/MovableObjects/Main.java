package com.MovableObjects;

public class Main {

    public static void main(String[] args) {

        MovablePoint movPoint = new MovablePoint(0,0);

        movPoint.move(5,10);

        System.out.println("This point moved to position (" + movPoint.getX() + ", " + movPoint.getY() + ")");



        MovableCircle movCircle = new MovableCircle(5,0,0);

        movCircle.move(5,10);


        // checking if it's correct moving.
        // if length of radius is the same then it moved correctly.
        // radiusLength computes length of radius by Pythagorean theorem.
        System.out.println("New circle's coordinates: (" + movCircle.getCentralX() + ", " + movCircle.getCentralY() + ")");
        System.out.println("Circle's radius after moving: " + movCircle.radiusLength());

    }

}
