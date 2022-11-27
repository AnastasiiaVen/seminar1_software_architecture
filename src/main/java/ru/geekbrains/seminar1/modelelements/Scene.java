package ru.geekbrains.seminar1.modelelements;

import java.util.Collection;

public class Scene {

    static int counter = 0;
    private int id;
    private Collection<PoligonalModel> models;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;

    public int getId() {
        return id;
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    {
        id = ++counter;
    }

    public Scene(Collection<PoligonalModel> models, Collection<Flash> flashes, Collection<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Scene() {

    }

    public static Scene changeScene(Scene scene){
        //TODO: действия по изменению сцены
        return scene;
    }

    public static Scene moveScene(Point3D point3D, Angle3D angle3D){
        Scene scene = new Scene();
        //TODO: дуйствия по изменению направления камеры или света
        return scene;
    }
}
