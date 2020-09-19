package ru.mirea.inbo_05_19.Kuznetsov.Ball;

public class TestBall {
    public static void main(String args[]){
        Ball first,second;
        first=new Ball(25,37);
        second=new Ball(77,32);
        second.setXY(44,44);
        System.out.println(first.toString());
        System.out.println(second.toString());
    }
}