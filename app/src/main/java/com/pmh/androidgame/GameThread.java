package com.pmh.androidgame;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;

import java.io.InterruptedIOException;

public class GameThread extends Thread{
    SurfaceHolder surfaceHolder;//Tham chieu doi tuong Surfaceholder
    boolean isRunning;// phat hien xem thread co chay hay khong
    long startTime, loopTime; // Thoi gian bat dau vong lap va thoi luong vong lap
    long DELAY = 33; // do tre tinh bang mili giay giua cac lan lam moi man hinh
    public  GameThread(SurfaceHolder surfaceHolder){
        this.surfaceHolder= surfaceHolder;
        isRunning = true;
    }

    @Override
    public void run() {
        //chay cho toi khi nao boolean sai
        while(isRunning){
            startTime = SystemClock.uptimeMillis();
            //khoa canvas
            Canvas canvas = surfaceHolder.lockCanvas(null);
            if (canvas != null){
                synchronized (surfaceHolder){
                    AppConstants.getGameEngine().updateAndDrawableBackgroundImage(canvas);
                    //mo khoa canvas
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
            //vong lap thoi gian
            loopTime = SystemClock.uptimeMillis() - startTime;
            if (loopTime < DELAY){
                try{
                    Thread.sleep(DELAY- loopTime);
                }catch (InterruptedException e){
                    Log.e("Interrumped", "Interrumped while sleeping");
                }
            }
        }
    }
    public  boolean isRunning(){
        return isRunning;
    }

    public void setRunning(boolean state){
        isRunning = state;
    }
}
