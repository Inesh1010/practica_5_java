package com.MovableObjects;

public class Main {

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2, 2, 15, 7);
        MovableCircle movableCircle = new MovableCircle(8, 8, 1, 5, 8);
        System.out.println(movablePoint);
        System.out.println(movableCircle);
        movablePoint.moveDown();
        movablePoint.moveLeft();
        movableCircle.moveRight();
        movableCircle.moveUp();
        System.out.println(movablePoint);
        System.out.println(movableCircle);
    }
}
