package com.company.Primitives;

public class Coordinate {
    protected double _coordinate;

    //constructors
    public Coordinate(double _coordinate) {
        this._coordinate = _coordinate;
    }

    public Coordinate() {
        this._coordinate = 0.0;
    }

    //getters
    public double get_coordinate() {
        return _coordinate;
    }

    //setters
    public void set_coordinate(double _coordinate) {
        this._coordinate = _coordinate;
    }


    //ToString
    @Override
    public String toString() {
        return super.toString();
    }
}
