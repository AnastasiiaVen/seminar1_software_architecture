package ru.geekbrains.seminar1.modelelements;

import java.util.Collection;

public class Camera {

    private Point3D location;
    private Angle3D angle;

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
    public Camera(Point3D point3D, Angle3D angle3D) {
        this.location = point3D;
        this.angle = angle3D;
    }

    public static void Rotate(Angle3D angle3D){
        this.angle = angle3D;
    }

    public static void Move(Point3D point3D){
        this.location = point3D;
    }


}
