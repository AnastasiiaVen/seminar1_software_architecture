package ru.geekbrains.seminar1.modelelements;

import java.util.Collection;

public class Flash {

    private Point3D location;
    private Angle3D angle;
    private Color color;
    private Float power;


    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }


    public Flash(Point3D location, Angle3D angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public static void Rotate(Angle3D angle3D){
        this.angle = angle3D;
    }

    public static void Move(Point3D point3D){
        this.location = point3D;
    }

}
