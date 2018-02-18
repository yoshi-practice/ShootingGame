package com.ispring.gameplane;

import android.app.Activity;
import android.os.Bundle;

import com.ispring.gameplane.game.GameView;


public class GameActivity extends Activity {

    private GameView gameView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        gameView = findViewById(R.id.gameView);

        int[] bitmapIds = {
                R.drawable.baison,//動かすもの
                R.drawable.explosion,//爆発アニメーション。　変更しない
                R.drawable.blue_bullet,//発射1
                R.drawable.yellow_bullet,//発射2
                R.drawable.shika,//敵
                R.drawable.risu,//敵
                R.drawable.kuma,//敵
                R.drawable.uno,//GETするもの
                R.drawable.neko,//急降下
                R.drawable.pause1,//停止1コマ目
                R.drawable.pause2,//停止2コマ目
                R.drawable.unokao//GETしたポイント用
                //GETしたもの。
        };
        gameView.start(bitmapIds);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(gameView != null){
            gameView.pause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(gameView != null){
            gameView.destroy();
        }
        gameView = null;
    }
}