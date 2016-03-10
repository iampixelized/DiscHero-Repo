package com.thedebelopers.discheroes;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Shop extends AppCompatActivity /*implements OnClickListener*/ {
    
    TextView b1, b2, b3, b4, b5, b6, b7;
    public int [] shop_nov = new int []{1,4,7,10,13,16,19};
    public int [] shop_int = new int []{2,5,8,11,14,17,20};
    public int [] shop_adv = new int []{3,6,9,12,15,18,21};
    final Random random1 = new Random();
    int pera = 100000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        MediaPlayer bgm = MediaPlayer.create(getApplicationContext(),R.raw.mus_temshop);
        bgm.setLooping(true);
        bgm.setVolume(0.75f, 0.75f);
        bgm.start();

        b1= (TextView) findViewById(R.id.credits);
        b2= (TextView) findViewById(R.id.tip);
        b3= (TextView) findViewById(R.id.price1);
        b4= (TextView) findViewById(R.id.price2);
        b5= (TextView) findViewById(R.id.price3);
        b6= (TextView) findViewById(R.id.inventory);
        b7= (TextView) findViewById(R.id.back);
        Typeface ampersand = Typeface.createFromAsset(getAssets(), "fonts/ampersand.ttf");
        b1.setTypeface(ampersand);
        b2.setTypeface(ampersand);
        b3.setTypeface(ampersand);
        b4.setTypeface(ampersand);
        b5.setTypeface(ampersand);
        b6.setTypeface(ampersand);
        b7.setTypeface(ampersand);

        //---------------

        

//        novice.setOnClickListener(this);
//        inter.setOnClickListener(this);
//        advance.setOnClickListener(this);

    }

    public void onBackPressed(){

        if (MainActivity.bgm.isPlaying()) {
            MainActivity.bgm.stop();
        }

        View novice = findViewById(R.id.shop_nov);
        View inter = findViewById(R.id.shop_int);
        View advance =  findViewById(R.id.shop_adv);
        novice.setBackgroundResource(R.drawable.shop_nov);
        inter.setBackgroundResource(R.drawable.shop_int);
        advance.setBackgroundResource(R.drawable.shop_adv);

        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.setLooping(true);
        mp.start();

        Intent test = new Intent(this, ExtrasMenu.class);
        startActivity(test);

    }
    
    public void back (View view) {
        if (MainActivity.bgm.isPlaying()) {
            MainActivity.bgm.stop();
        }

        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        Intent test = new Intent(this, ExtrasMenu.class);
        startActivity(test);
    }

    public void baku (View view){

        View novice = findViewById(R.id.shop_nov);
        View inter = findViewById(R.id.shop_int);
        View advance =  findViewById(R.id.shop_adv);
        novice.setBackgroundResource(R.drawable.shop_nov);
        inter.setBackgroundResource(R.drawable.shop_int);
        advance.setBackgroundResource(R.drawable.shop_adv);


        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();
    }

    public void no (View view) {

        View novice = findViewById(R.id.shop_nov);
        View inter = findViewById(R.id.shop_int);
        View advance =  findViewById(R.id.shop_adv);
        inter.setBackgroundResource(R.drawable.shop_int);
        advance.setBackgroundResource(R.drawable.shop_adv);

        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        for (int i = 0; i < 7; i++) {

            int r = i + (int) (random1.nextDouble() * (7 - i));
            int t = shop_nov[r];
            shop_nov[r] = shop_nov[i];
            shop_nov[i] = t;

        }


        if(pera > 1000){
            switch (shop_nov[1]) {
                case 1:
                    novice.setBackgroundResource(R.drawable.pogs001);
                    break;

                case 4:
                    novice.setBackgroundResource(R.drawable.pogs004);
                    break;

                case 7:
                    novice.setBackgroundResource(R.drawable.pogs007);
                    break;

                case 10:
                    novice.setBackgroundResource(R.drawable.pogs010);
                    break;

                case 13:
                    novice.setBackgroundResource(R.drawable.pogs013);
                    break;

                case 16:
                    novice.setBackgroundResource(R.drawable.pogs016);
                    break;

                case 19:
                    novice.setBackgroundResource(R.drawable.pogs019);
                    break;

            }

            pera = pera - 1000;
            b1.setText("Credits: "+pera);
        } else {
            novice.setBackgroundResource(R.drawable.shop_nov);
            b1.setText("Need more cash");
        }
    }

    public void in (View view) {

        View novice = findViewById(R.id.shop_nov);
        View inter = findViewById(R.id.shop_int);
        View advance =  findViewById(R.id.shop_adv);
        novice.setBackgroundResource(R.drawable.shop_nov);
        advance.setBackgroundResource(R.drawable.shop_adv);

        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        for (int i = 0; i < 7; i++) {

            int r = i + (int) (random1.nextDouble() * (7 - i));
            int t = shop_int[r];
            shop_int[r] = shop_int[i];
            shop_int[i] = t;

        }


        if(pera > 3000){
            switch (shop_int[1]) {
                case 2:
                    inter.setBackgroundResource(R.drawable.pogs002);
                    break;

                case 5:
                    inter.setBackgroundResource(R.drawable.pogs005);
                    break;

                case 8:
                    inter.setBackgroundResource(R.drawable.pogs008);
                    break;

                case 11:
                    inter.setBackgroundResource(R.drawable.pogs011);
                    break;

                case 14:
                    inter.setBackgroundResource(R.drawable.pogs014);
                    break;

                case 17:
                    inter.setBackgroundResource(R.drawable.pogs017);
                    break;

                case 20:
                    inter.setBackgroundResource(R.drawable.pogs020);
                    break;

            }

            pera = pera - 3000;
            b1.setText("Credits: "+pera);
        } else {
            inter.setBackgroundResource(R.drawable.shop_int);
            b1.setText("Need more cash");
        }

    }



    public void ad (View view) {

        View novice = findViewById(R.id.shop_nov);
        View inter = findViewById(R.id.shop_int);
        View advance =  findViewById(R.id.shop_adv);
        novice.setBackgroundResource(R.drawable.shop_nov);
        inter.setBackgroundResource(R.drawable.shop_int);

        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        for (int i = 0; i < 7; i++) {

            int r = i + (int) (random1.nextDouble() * (7 - i));
            int t = shop_adv[r];
            shop_adv[r] = shop_adv[i];
            shop_adv[i] = t;

        }

        if(pera > 7500){
            switch (shop_adv[1]) {
                case 3:
                    advance.setBackgroundResource(R.drawable.pogs003);
                    break;

                case 6:
                    advance.setBackgroundResource(R.drawable.pogs006);
                    break;

                case 9:
                    advance.setBackgroundResource(R.drawable.pogs009);
                    break;

                case 12:
                    advance.setBackgroundResource(R.drawable.pogs012);
                    break;

                case 15:
                    advance.setBackgroundResource(R.drawable.pogs015);
                    break;

                case 18:
                    advance.setBackgroundResource(R.drawable.pogs018);
                    break;

                case 21:
                    advance.setBackgroundResource(R.drawable.pogs021);
                    break;

            }

            pera = pera - 7500;
            b1.setText("Credits: "+pera);
        } else {
            advance.setBackgroundResource(R.drawable.shop_adv);
            b1.setText("Need more cash");
        }

    }

/*
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.shop_nov:
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
                mp.start();
                for (int i = 0; i < 7; i++) {
                    int r = i + (int) (random1.nextDouble() * (7 - i));
                    int t = shop_nov[r];
                    shop_nov[r] = shop_nov[i];
                    shop_nov[i] = t;
                }
                switch (shop_nov[0]) {
                    case 1:
                        novice.setBackgroundResource(R.drawable.pogs001);
                        break;
                    case 4:
                        novice.setBackgroundResource(R.drawable.pogs004);
                        break;
                    case 7:
                        novice.setBackgroundResource(R.drawable.pogs007);
                        break;
                    case 10:
                        novice.setBackgroundResource(R.drawable.pogs010);
                        break;
                    case 13:
                        novice.setBackgroundResource(R.drawable.pogs013);
                        break;
                    case 16:
                        novice.setBackgroundResource(R.drawable.pogs016);
                        break;
                    case 19:
                        novice.setBackgroundResource(R.drawable.pogs019);
                        break;

                }
                if(pera < 1000){
                    pera = pera - 1000;
                    b1.setText("Credits: "+pera);
                } else {
                    b1.setText("Need more cash");
                }
                break;
            case R.id.shop_int:
                break;
            case R.id.shop_adv:
                break;
        }

    }*/
}
