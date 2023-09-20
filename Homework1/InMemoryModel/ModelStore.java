package Homework1.InMemoryModel;

import Homework1.ModelElements.Camera;
import Homework1.ModelElements.Flash;
import Homework1.ModelElements.PoligonModel;
import Homework1.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangerObserver> ChangeObservers;

    /**
     * Конструктор
     * 
     * @param changerObservers
     * @throws Exception
     */
    public ModelStore(List<IModelChangerObserver> changerObservers) throws Exception{
        this.ChangeObservers = changerObservers;

        this.Models = new ArrayList<>();
        this.Cameras = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Scenes = new ArrayList<>();

        Models.add(new PoligonModel(null));
        Flashes.add(new Flash());
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
        Cameras.add(new Camera());
    }

    /**
     * Возвращает scene по ID
     * 
     * @param ID
     * @return
     */
    public Scene GetScene(int ID){
        for (int i = 0; i < Scenes.size(); i++){
            if (Scenes.get(i).ID == ID){
                return Scenes.get(i);
            }
        }
        return null;
    }

    /**
     * Регистрация изменений
     * @param sender
     */
    @Override
    public void NotifyChange(IModelChanger sender){

    }
}
