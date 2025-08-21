package com.uplift.homeworkfour.threedim;

import com.uplift.homeworkfour.common.ThreeDimShape;
import com.uplift.homeworkfour.twodim.Triangle;


public class Cone extends Triangle implements ThreeDimShape {

    private double radius;
    private double height;

    public Cone(double radius, double height) {
        super(Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)), radius);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double slantheight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantheight);
    }

    @Override
    public double calculateVolume() {

        return (Math.PI * Math.pow(radius, 2) * ( height / 3));
    }
}