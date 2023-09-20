package Homework1.ModelElements;

import Homework1.Stuff.Type;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int ID;
    public List<PoligonModel> Models;
    public List<Flash> Flashes;
    public List<Camera> cameras = new ArrayList<Camera>();

    public Scene(int id, List<PoligonModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception{
        this.ID = id;
        if (models.size() > 0){
            this.Models = models;
        } else {
            throw new Exception("Должна быть одна модель");
        }
        this.Flashes = flashes;
        if (cameras.size() > 0){
            this.cameras = cameras;
        } else {
            throw new Exception("Должна быть одна модель");
        }
    }

    public <T> T method1(T flash){
        return flash;
    }

    public <T, E> T method2(T Model, E Flash){
        return Model;
    }

    // /**
    // * Заглушка
    // */
    // public Type1 method1(Type1 t){
    // return t;   
    // }

    // /** 
    // *Заглушка
    // */
    // public Type1 method1(Type1 t1, Type2 t2){
    // return t1;
    // }
}
