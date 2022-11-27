package ru.geekbrains.seminar1.modelelements;

import java.util.Collection;

public class Camera {

    private Collection<Point3D> location;
    private Collection<Angle3D> angle;

    public Collection<Point3D> getLocation() {
        return location;
    }

    public Collection<Angle3D> getAngle() {
        return angle;
    }

    public Camera(Collection<Point3D> location, Collection<Angle3D> angle) {
        this.location = location;
        this.angle = angle;
    }

    public static void Rotate(Angle3D angle3D){}

    public static void Move(Point3D point3D){}


}
