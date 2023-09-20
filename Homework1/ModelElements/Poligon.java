package Homework1.ModelElements;

import Homework1.Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    public List<Point3D> points = new ArrayList<Point3D>();
    /**
     * Конструктор
     * 
     * @param point
     */
    public Poligon(Point3D point){
        points.add(point);
    }
}
