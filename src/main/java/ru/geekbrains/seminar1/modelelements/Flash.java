package ru.geekbrains.seminar1.modelelements;

import java.util.Collection;

public class Flash {

    private Collection<Point3D> location;
    private Collection<Angle3D> angle;
    private Color color;
    private Float power;

    public Collection<Point3D> getLocation() {
        return location;
    }

    public Collection<Angle3D> getAngle() {
        return angle;
    }

    public Color getColor() {
        return color;
    }

    public Float getPower() {
        return power;
    }

    public Flash(Collection<Point3D> location, Collection<Angle3D> angle, Color color, Float power) {
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
