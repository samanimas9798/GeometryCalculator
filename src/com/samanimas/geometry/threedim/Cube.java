package com.samanimas.geometry.threedim;

import com.samanimas.geometry.common.ThreeDimShape;
import com.samanimas.geometry.twodim.Square;

public class Cube extends Square implements ThreeDimShape {
    public Cube (double side) {

        super(side);
    }

    @Override
    public double calculateArea() {
        double side = getSide ();
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double calculateVolume() {
        double side = getSide ();
        return Math.pow(side, 3);
    }
}
