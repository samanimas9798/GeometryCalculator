package com.uplift.homeworkfour.threedim;

import com.uplift.homeworkfour.common.ThreeDimShape;
import com.uplift.homeworkfour.twodim.Circle;

public class Sphere extends Circle implements ThreeDimShape {

    public Sphere(double radius) {

        super(radius);
    }

    @Override
    public double calculateArea() {
        double radius = getRadius();
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateVolume() {
        double radius = getRadius();
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }
}
