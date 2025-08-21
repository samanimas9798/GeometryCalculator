package com.uplift.homeworkfour.twodim;

import com.uplift.homeworkfour.common.Shape;
import com.uplift.homeworkfour.common.TwoDimShape;

public class Circle extends Shape implements TwoDimShape {

    private double radius;

    public Circle (double radius) {
        setRadius(radius);
    }

    public double getRadius() {
      return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }



    @Override
    public double calculateArea () {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

}
