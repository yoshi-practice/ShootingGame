package com.ispring.gameplane.game;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;


public class AutoSprite extends Sprite {
    private float speed = 2;

    public AutoSprite(Bitmap bitmap){
        super(bitmap);
    }

    public void setSpeed(float speed){
        this.speed = speed;
    }

    public float getSpeed(){
        return speed;
    }

    @Override
    protected void beforeDraw(Canvas canvas, Paint paint, GameView gameView) {
        if(!isDestroyed()){
            move(0, speed * gameView.getDensity());
            //X:0
        }
    }

    protected void afterDraw(Canvas canvas, Paint paint, GameView gameView){
        if(!isDestroyed()){
            RectF canvasRecF = new RectF(0, 0, canvas.getWidth(), canvas.getHeight());
            //0,0
            RectF spriteRecF = getRectF();
            if(!RectF.intersects(canvasRecF, spriteRecF)){
                destroy();
            }
        }
    }
}