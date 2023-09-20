package Homework1.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonModel {
    public List<Texture> Textures;
    public List<Poligon> Poligons;

    public PoligonModel(List<Texture> Textures){
        this.Poligons = new ArrayList<>();
        this.Textures = Textures;
    }
}
