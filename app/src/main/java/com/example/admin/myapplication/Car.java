package com.example.admin.myapplication;

import android.app.Activity;
import android.content.Context;

/**
 * Created by Admin on 2015/3/12.
 */
public abstract class Car {

    Context context;
    String direction;
    double speed;
    String  carName;
    int key;
   //不寫時默認為 friendly

    //建構子
    public Car(int key){
        this.key=key;
    }

    //方法
    public abstract void setCarName(String carName);


    public abstract double getSpeed();

    public abstract void setSpeed(double speed);

    public abstract String getDirection();

    public abstract void setDirection(String direction);

}
