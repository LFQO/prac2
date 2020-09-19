package ru.mirea.inbo_05_19.Kuznetsov.Ball;

public class Ball {
    private double x;
    private double y;
    public Ball(){}
    public Ball(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x=x;
    }

    public void setY(double y) {
        this.y=y;
    }
    public void setXY(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }
    public String toString(){
        return ("Ball (x: "+this.x+", y: "+this.y+").");
    }
}