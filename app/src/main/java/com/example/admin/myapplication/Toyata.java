package com.example.admin.myapplication;

import android.content.Context;

/**
 * Created by Admin on 2015/3/12.
 */
public class Toyata extends  Car{

    Context context;

    public Toyata(int key) {
        super(key);
    }

    @Override
    public void setCarName(String carName) {
        this.carName=carName;
    }

    @Override
    public double getSpeed() {
        return this.speed;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed=0.77*speed;
    }

    @Override
    public String getDirection() {
        return this.direction;
    }

    @Override
    public void setDirection(String direction) {
        this.direction=direction;
    }
}
