package com.pmh.androidgame;

import android.graphics.Canvas;

public class GameEngine {
    BackgoundImage backgoundImage;
    public GameEngine(){
        backgoundImage = new BackgoundImage();
    }
    public void updateAndDrawableBackgroundImage(Canvas canvas){
        backgoundImage.setX(backgoundImage.getX() - backgoundImage.getVelocity());
        if (backgoundImage.getX() <- AppConstants.getBitmapBank().getBackgroundWidth()){
            backgoundImage.setX(0);
        }
        canvas.drawBitmap(AppConstants.getBitmapBank().getBackground_game(), backgoundImage.getX(), backgoundImage.getY(),null);

        if (backgoundImage.getX() <- (AppConstants.getBitmapBank().getBackgroundWidth()-AppConstants.SCREEN_WIDTH)){
            canvas.drawBitmap(AppConstants.getBitmapBank().getBackground_game(), backgoundImage.getX()+AppConstants.getBitmapBank().getBackgroundWidth(),backgoundImage.getY(),null);
        }
    }
}
