package com.pmh.androidgame;

public class BackgoundImage {

    private  int backgroundImageX, backgroundImageY, getBackgroundVelocity;

    public BackgoundImage(){
        backgroundImageX = 0;
        backgroundImageY = 0;
        getBackgroundVelocity = 3;
    }

    public int getX(){
        return backgroundImageX;
    }

    public int getY(){
        return  backgroundImageY;
    }

    public void setX (int backgroundImageX){
        this.backgroundImageX = backgroundImageX;
    }

    public  void setY (int backgroundImageY){
        this.backgroundImageY = backgroundImageY;
    }

    public int getVelocity(){
        return getBackgroundVelocity;
    }
}