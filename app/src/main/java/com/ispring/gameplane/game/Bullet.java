package com.ispring.gameplane.game;

import android.graphics.Bitmap;

public class Bullet extends AutoSprite {

    public Bullet(Bitmap bitmap){
        super(bitmap);
        setSpeed(-11);
        //-10
    }

}