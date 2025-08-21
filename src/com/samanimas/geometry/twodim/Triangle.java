package com.samanimas.geometry.twodim;

import com.samanimas.geometry.common.Shape;
import com.samanimas.geometry.common.TwoDimShape;

public class Triangle extends Shape implements TwoDimShape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;


    public Triangle (double base, double height){
        this.base = base;
        this.height = height;

    }

    public Triangle (double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }


    @Override
    public double calculateArea() {

        return (height * base) / 2;
    }
    
    @Override
    public double calculatePerimeter() {

        return side1 + side2 + side3;
    }



}
