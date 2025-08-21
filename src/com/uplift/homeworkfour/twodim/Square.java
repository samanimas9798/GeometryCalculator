package com.uplift.homeworkfour.twodim;

import com.uplift.homeworkfour.common.Shape;
import com.uplift.homeworkfour.common.TwoDimShape;

public class Square extends Shape implements TwoDimShape {
    private double side;

    public Square (double side) {
        setSide(side);
    }

    public double getSide () {

        return side;
    }

    public void setSide (double side) {

        this.side = side;
    }

    @Override
    public double calculateArea() {

        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
