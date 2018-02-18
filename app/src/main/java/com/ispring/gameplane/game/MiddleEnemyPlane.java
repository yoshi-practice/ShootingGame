package com.ispring.gameplane.game;

import android.graphics.Bitmap;

public class MiddleEnemyPlane extends EnemyPlane {

    public MiddleEnemyPlane(Bitmap bitmap){
        super(bitmap);
        setPower(4);
        setValue(6000);
    }

}