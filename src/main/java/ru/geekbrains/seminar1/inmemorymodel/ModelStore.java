package ru.geekbrains.seminar1.inmemorymodel;

import ru.geekbrains.seminar1.modelelements.Camera;
import ru.geekbrains.seminar1.modelelements.Flash;
import ru.geekbrains.seminar1.modelelements.PoligonalModel;
import ru.geekbrains.seminar1.modelelements.Scene;

import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements ModelChanger {
    private Collection<ModelChangedObserver> changeObservers = new ArrayList<>();

    private Collection<PoligonalModel> models;
    private Collection<Scene> scenes;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;

    public ModelStore(Collection<PoligonalModel> models, Collection<Scene> scenes, Collection<Flash> flashes, Collection<Camera> cameras) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public Collection<Scene> getScenes() {
        return scenes;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }



    // для чего мы это делаем?
    public static Scene getScene(int id){
        return new Scene();
    }

    @Override
    public void RegisterModelChanger(ModelChangedObserver o) {

    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver o) {

    }

    @Override
    public void NotifyChange() {
        for (ModelChangedObserver o: changeObservers) {
            o.ApplyUpdateModel();
        }
    }
}
