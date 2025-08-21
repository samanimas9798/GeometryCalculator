package com.samanimas.geometry.threedim;

import com.samanimas.geometry.common.ThreeDimShape;
import com.samanimas.geometry.twodim.Circle;

public class Cylinder extends Circle implements ThreeDimShape {
private double height;

public Cylinder(double radius, double height) {
    super(radius);
    this.height = height;
}
    @Override
    public double calculateArea() {
        double radius = getRadius();
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double calculateVolume() {

        double radius = getRadius();
        return Math.PI * Math.pow(radius, 2) * height;
    }

}

