package com.thedebelopers.discheroes;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.thedebelopers.discheroes.Storage;

public class StoryMenu extends AppCompatActivity {

    

    TextView des, ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8, ch9, ch10, pl, mm;

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.menu_story);

        des= (TextView) findViewById(R.id.desc);
        ch1= (TextView) findViewById(R.id.c1);
        ch2= (TextView) findViewById(R.id.c2);
        ch3= (TextView) findViewById(R.id.c3);
        ch4= (TextView) findViewById(R.id.c4);
        ch5= (TextView) findViewById(R.id.c5);
        ch6= (TextView) findViewById(R.id.c6);
        ch7= (TextView) findViewById(R.id.c7);
        ch8= (TextView) findViewById(R.id.c8);
        ch9= (TextView) findViewById(R.id.c9);
        ch10= (TextView) findViewById(R.id.c10);
        pl= (TextView) findViewById(R.id.p);
        mm= (TextView) findViewById(R.id.m);

        Typeface ampersand = Typeface.createFromAsset(getAssets(), "fonts/ampersand.ttf");

        des.setTypeface(ampersand);
        ch1.setTypeface(ampersand);
        ch2.setTypeface(ampersand);
        ch3.setTypeface(ampersand);
        ch4.setTypeface(ampersand);
        ch5.setTypeface(ampersand);
        ch6.setTypeface(ampersand);
        ch7.setTypeface(ampersand);
        ch8.setTypeface(ampersand);
        ch9.setTypeface(ampersand);
        ch10.setTypeface(ampersand);
        pl.setTypeface(ampersand);
        mm.setTypeface(ampersand);

        View chapter2 = findViewById(R.id.c2);
        View chapter3 = findViewById(R.id.c3);
        View chapter4 = findViewById(R.id.c4);
        View chapter5 = findViewById(R.id.c5);
        View chapter6 = findViewById(R.id.c6);
        View chapter7 = findViewById(R.id.c7);
        View chapter8 = findViewById(R.id.c8);
        View chapter9 = findViewById(R.id.c9);
        View chapter10 = findViewById(R.id.c10);

        if (MainActivity.bgm.isPlaying()) {
            MainActivity.bgm.pause();
            MainActivity.pos = MainActivity.bgm.getCurrentPosition();
            MainActivity.bgm.stop();
        }
        if (MainActivity.bgm.isPlaying()==false){
            MainActivity.bgm = MediaPlayer.create(getApplicationContext(), R.raw.mus_menu6);
            MainActivity.bgm.setLooping(true);
            MainActivity.bgm.seekTo(MainActivity.pos);
            MainActivity.bgm.start();
        }

        switch(Storage.chapter_finished){
            case 0:
                ch2.setText("locked");
                ch3.setText("locked");
                ch4.setText("locked");
                ch5.setText("locked");
                ch6.setText("locked");
                ch7.setText("locked");
                ch8.setText("locked");
                ch9.setText("locked");
                ch10.setText("locked");
                chapter2.setAlpha(.75f);
                chapter3.setAlpha(.75f);
                chapter4.setAlpha(.75f);
                chapter5.setAlpha(.75f);
                chapter6.setAlpha(.75f);
                chapter7.setAlpha(.75f);
                chapter8.setAlpha(.75f);
                chapter9.setAlpha(.75f);
                chapter10.setAlpha(.75f);
                chapter2.setClickable(false);
                chapter3.setClickable(false);
                chapter4.setClickable(false);
                chapter5.setClickable(false);
                chapter6.setClickable(false);
                chapter7.setClickable(false);
                chapter8.setClickable(false);
                chapter9.setClickable(false);
                chapter10.setClickable(false);

                Storage.chapter_finished = 1;

                break;

            case 1:
                ch2.setText("chapter 2");
                ch3.setText("locked");
                ch4.setText("locked");
                ch5.setText("locked");
                ch6.setText("locked");
                ch7.setText("locked");
                ch8.setText("locked");
                ch9.setText("locked");
                ch10.setText("locked");
                chapter2.setAlpha(1f);
                chapter3.setAlpha(.75f);
                chapter4.setAlpha(.75f);
                chapter5.setAlpha(.75f);
                chapter6.setAlpha(.75f);
                chapter7.setAlpha(.75f);
                chapter8.setAlpha(.75f);
                chapter9.setAlpha(.75f);
                chapter10.setAlpha(.75f);
                chapter2.setClickable(true);
                chapter3.setClickable(false);
                chapter4.setClickable(false);
                chapter5.setClickable(false);
                chapter6.setClickable(false);
                chapter7.setClickable(false);
                chapter8.setClickable(false);
                chapter9.setClickable(false);
                chapter10.setClickable(false);

                Storage.chapter_finished = 2;

                break;

            case 2:
                ch2.setText("chapter 2");
                ch3.setText("chapter 3");
                ch4.setText("locked");
                ch5.setText("locked");
                ch6.setText("locked");
                ch7.setText("locked");
                ch8.setText("locked");
                ch9.setText("locked");
                ch10.setText("locked");
                chapter2.setAlpha(1f);
                chapter3.setAlpha(1f);
                chapter4.setAlpha(.75f);
                chapter5.setAlpha(.75f);
                chapter6.setAlpha(.75f);
                chapter7.setAlpha(.75f);
                chapter8.setAlpha(.75f);
                chapter9.setAlpha(.75f);
                chapter10.setAlpha(.75f);
                chapter2.setClickable(true);
                chapter3.setClickable(true);
                chapter4.setClickable(false);
                chapter5.setClickable(false);
                chapter6.setClickable(false);
                chapter7.setClickable(false);
                chapter8.setClickable(false);
                chapter9.setClickable(false);
                chapter10.setClickable(false);

                Storage.chapter_finished = 3;

                break;

            case 3:
                ch2.setText("chapter 2");
                ch3.setText("chapter 3");
                ch4.setText("chapter 4");
                ch5.setText("locked");
                ch6.setText("locked");
                ch7.setText("locked");
                ch8.setText("locked");
                ch9.setText("locked");
                ch10.setText("locked");
                chapter2.setAlpha(1f);
                chapter3.setAlpha(1f);
                chapter4.setAlpha(1f);
                chapter5.setAlpha(.75f);
                chapter6.setAlpha(.75f);
                chapter7.setAlpha(.75f);
                chapter8.setAlpha(.75f);
                chapter9.setAlpha(.75f);
                chapter10.setAlpha(.75f);
                chapter2.setClickable(true);
                chapter3.setClickable(true);
                chapter4.setClickable(true);
                chapter5.setClickable(false);
                chapter6.setClickable(false);
                chapter7.setClickable(false);
                chapter8.setClickable(false);
                chapter9.setClickable(false);
                chapter10.setClickable(false);

                break;

            case 4:
                ch2.setText("chapter 2");
                ch3.setText("chapter 3");
                ch4.setText("chapter 4");
                ch5.setText("chapter 5");
                ch6.setText("locked");
                ch7.setText("locked");
                ch8.setText("locked");
                ch9.setText("locked");
                ch10.setText("locked");
                chapter2.setAlpha(1f);
                chapter3.setAlpha(1f);
                chapter4.setAlpha(1f);
                chapter5.setAlpha(1f);
                chapter6.setAlpha(.75f);
                chapter7.setAlpha(.75f);
                chapter8.setAlpha(.75f);
                chapter9.setAlpha(.75f);
                chapter10.setAlpha(.75f);
                chapter2.setClickable(true);
                chapter3.setClickable(true);
                chapter4.setClickable(true);
                chapter5.setClickable(true);
                chapter6.setClickable(false);
                chapter7.setClickable(false);
                chapter8.setClickable(false);
                chapter9.setClickable(false);
                chapter10.setClickable(false);

                break;

            case 5:
                ch2.setText("chapter 2");
                ch3.setText("chapter 3");
                ch4.setText("chapter 4");
                ch5.setText("chapter 5");
                ch6.setText("chapter 6");
                ch7.setText("locked");
                ch8.setText("locked");
                ch9.setText("locked");
                ch10.setText("locked");
                chapter2.setAlpha(1f);
                chapter3.setAlpha(1f);
                chapter4.setAlpha(1f);
                chapter5.setAlpha(1f);
                chapter6.setAlpha(1f);
                chapter7.setAlpha(.75f);
                chapter8.setAlpha(.75f);
                chapter9.setAlpha(.75f);
                chapter10.setAlpha(.75f);
                chapter2.setClickable(true);
                chapter3.setClickable(true);
                chapter4.setClickable(true);
                chapter5.setClickable(true);
                chapter6.setClickable(true);
                chapter7.setClickable(false);
                chapter8.setClickable(false);
                chapter9.setClickable(false);
                chapter10.setClickable(false);

                break;

            case 6:
                ch2.setText("chapter 2");
                ch3.setText("chapter 3");
                ch4.setText("chapter 4");
                ch5.setText("chapter 5");
                ch6.setText("chapter 6");
                ch7.setText("chapter 7");
                ch8.setText("locked");
                ch9.setText("locked");
                ch10.setText("locked");
                chapter2.setAlpha(1f);
                chapter3.setAlpha(1f);
                chapter4.setAlpha(1f);
                chapter5.setAlpha(1f);
                chapter6.setAlpha(1f);
                chapter7.setAlpha(1f);
                chapter8.setAlpha(.75f);
                chapter9.setAlpha(.75f);
                chapter10.setAlpha(.75f);
                chapter2.setClickable(true);
                chapter3.setClickable(true);
                chapter4.setClickable(true);
                chapter5.setClickable(true);
                chapter6.setClickable(true);
                chapter7.setClickable(true);
                chapter8.setClickable(false);
                chapter9.setClickable(false);
                chapter10.setClickable(false);

                break;

            case 7:
                ch2.setText("chapter 2");
                ch3.setText("chapter 3");
                ch4.setText("chapter 4");
                ch5.setText("chapter 5");
                ch6.setText("chapter 6");
                ch7.setText("chapter 7");
                ch8.setText("chapter 8");
                ch9.setText("locked");
                ch10.setText("locked");
                chapter2.setAlpha(1f);
                chapter3.setAlpha(1f);
                chapter4.setAlpha(1f);
                chapter5.setAlpha(1f);
                chapter6.setAlpha(1f);
                chapter7.setAlpha(1f);
                chapter8.setAlpha(1f);
                chapter9.setAlpha(.75f);
                chapter10.setAlpha(.75f);
                chapter2.setClickable(true);
                chapter3.setClickable(true);
                chapter4.setClickable(true);
                chapter5.setClickable(true);
                chapter6.setClickable(true);
                chapter7.setClickable(true);
                chapter8.setClickable(true);
                chapter9.setClickable(false);
                chapter10.setClickable(false);

                break;

            case 8:
                ch2.setText("chapter 2");
                ch3.setText("chapter 3");
                ch4.setText("chapter 4");
                ch5.setText("chapter 5");
                ch6.setText("chapter 6");
                ch7.setText("chapter 7");
                ch8.setText("chapter 8");
                ch9.setText("chapter 9");
                ch10.setText("locked");
                chapter2.setAlpha(1f);
                chapter3.setAlpha(1f);
                chapter4.setAlpha(1f);
                chapter5.setAlpha(1f);
                chapter6.setAlpha(1f);
                chapter7.setAlpha(1f);
                chapter8.setAlpha(1f);
                chapter9.setAlpha(1f);
                chapter10.setAlpha(.75f);
                chapter2.setClickable(true);
                chapter3.setClickable(true);
                chapter4.setClickable(true);
                chapter5.setClickable(true);
                chapter6.setClickable(true);
                chapter7.setClickable(true);
                chapter8.setClickable(true);
                chapter9.setClickable(true);
                chapter10.setClickable(false);

                break;

            case 9:
                ch2.setText("chapter 2");
                ch3.setText("chapter 3");
                ch4.setText("chapter 4");
                ch5.setText("chapter 5");
                ch6.setText("chapter 6");
                ch7.setText("chapter 7");
                ch8.setText("chapter 8");
                ch9.setText("chapter 9");
                ch10.setText("chapter 10");
                chapter2.setAlpha(1f);
                chapter3.setAlpha(1f);
                chapter4.setAlpha(1f);
                chapter5.setAlpha(1f);
                chapter6.setAlpha(1f);
                chapter7.setAlpha(1f);
                chapter8.setAlpha(1f);
                chapter9.setAlpha(1f);
                chapter10.setAlpha(1f);
                chapter2.setClickable(true);
                chapter3.setClickable(true);
                chapter4.setClickable(true);
                chapter5.setClickable(true);
                chapter6.setClickable(true);
                chapter7.setClickable(true);
                chapter8.setClickable(true);
                chapter9.setClickable(true);
                chapter10.setClickable(true);

                break;
        }

    }



    public void mm (View view) {
        if (MainActivity.bgm.isPlaying()) {
            MainActivity.bgm.pause();
            MainActivity.pos = MainActivity.bgm.getCurrentPosition();
            MainActivity.bgm.stop();
        }

        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        Intent test = new Intent(this, MainMenu.class);
        startActivity(test);
    }

    public void play (View view) {
        if (MainActivity.bgm.isPlaying()) {
            MainActivity.bgm.pause();
            MainActivity.pos = MainActivity.bgm.getCurrentPosition();
            MainActivity.bgm.stop();
        }

        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        Intent test = new Intent(this, CollectPhase.class);
        startActivity(test);
    }

    public void likod (View view){
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        TextView test = (TextView)findViewById(R.id.desc);
        test.setText("Choose a Chapter");

        View b = findViewById(R.id.p);
        b.setVisibility(View.INVISIBLE);
        b.setClickable(false);

        View e =findViewById(R.id.likod);
        e.setClickable(false);

        ImageView dib =(ImageView) findViewById(R.id.diba);
        dib.setVisibility(View.INVISIBLE);

    }



    public void c1 (View view){
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        TextView test = (TextView)findViewById(R.id.desc);
        test.setText("Chapter 1\n\nWelcome player to Discrea, we have a tournament that is going to be held soon, and you are invited. Here are twin flamelings for you to use and here are some dummies for target practice.");

        View b = findViewById(R.id.p);
        b.setVisibility(View.VISIBLE);
        b.setClickable(true);

        View e =findViewById(R.id.likod);
        e.setClickable(true);

        ImageView dib =(ImageView) findViewById(R.id.diba);
        dib.setVisibility(View.VISIBLE);
        dib.setImageResource(R.drawable.ch1);

        Storage.nosepick = 1;
    }

    public void c2 (View view){
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        TextView test = (TextView)findViewById(R.id.desc);
        test.setText("Chapter 2\n\nNow you know how to play you can now recruit more heroes. We found mushbros nearby, try to defeat them and they might join your team.");

        View b = findViewById(R.id.p);
        b.setVisibility(View.VISIBLE);
        b.setClickable(true);

        View e =findViewById(R.id.likod);
        e.setClickable(true);

        ImageView dib =(ImageView) findViewById(R.id.diba);
        dib.setVisibility(View.VISIBLE);
        dib.setImageResource(R.drawable.ch2);

        Storage.nosepick = 2;
    }

    public void c3 (View view){
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        TextView test = (TextView)findViewById(R.id.desc);
        test.setText("Chapter 3\n\nYour team is now growing, a mushbro joined your team. Here is a leafle as an achievement gift. We'll switch your team leader to leafle and battle this team of mushbrad.");

        View b = findViewById(R.id.p);
        b.setVisibility(View.VISIBLE);
        b.setClickable(true);

        View e =findViewById(R.id.likod);
        e.setClickable(true);

        ImageView dib =(ImageView) findViewById(R.id.diba);
        dib.setVisibility(View.VISIBLE);
        dib.setImageResource(R.drawable.ch3);

        Storage.nosepick = 3;
    }

    public void c4 (View view){
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        TextView test = (TextView)findViewById(R.id.desc);
        test.setText("Chapter 4\n\nYou defeated mushbrad an intermediate hero, too bad it did not join your team. The mushbrad wants a rematch and he brought one more teammate. We'll switch your team leader to seedshell.");

        View b = findViewById(R.id.p);
        b.setVisibility(View.VISIBLE);
        b.setClickable(true);

        View e =findViewById(R.id.likod);
        e.setClickable(true);

        ImageView dib =(ImageView) findViewById(R.id.diba);
        dib.setVisibility(View.VISIBLE);
        dib.setImageResource(R.drawable.ch4);

        Storage.nosepick = 4;
    }

    public void c5 (View view){
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        TextView test = (TextView)findViewById(R.id.desc);
        test.setText("Chapter 5\n\n2nd win against mushbrad and still didn't want to join you. You're good at this, here's an advanced hero as gift. Mushbrad brought an advanced hero and wants another rematch, we'll switch your leader to seedwing so that you can take him down again.");

        View b = findViewById(R.id.p);
        b.setVisibility(View.VISIBLE);
        b.setClickable(true);

        View e =findViewById(R.id.likod);
        e.setClickable(true);

        ImageView dib =(ImageView) findViewById(R.id.diba);
        dib.setVisibility(View.VISIBLE);
        dib.setImageResource(R.drawable.ch5);

        Storage.nosepick = 5;
    }

    public void c6 (View view){
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        TextView test = (TextView)findViewById(R.id.desc);
        test.setText("Chapter 6\n\nAfter watching your matches driplet wants you to help it defeat sparkies. If it defeated them it will make its former teammates join you, so yeah, we have to change your team leader to driplet. Sparkies are novice heroes so you can take them down easily.");

        View b = findViewById(R.id.p);
        b.setVisibility(View.VISIBLE);
        b.setClickable(true);

        View e =findViewById(R.id.likod);
        e.setClickable(true);

        ImageView dib =(ImageView) findViewById(R.id.diba);
        dib.setVisibility(View.VISIBLE);
        dib.setImageResource(R.drawable.ch6);

        Storage.nosepick = 6;
    }

    public void c7 (View view){
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        TextView test = (TextView)findViewById(R.id.desc);
        test.setText("Chapter 7\n\nAs a promise, angii wants to join you, an intermediate hero. Seems that the sparkies are not alone, sparkchops surrounded your team. Well be changing your teamleader to angii now.");

        View b = findViewById(R.id.p);
        b.setVisibility(View.VISIBLE);
        b.setClickable(true);

        View e =findViewById(R.id.likod);
        e.setClickable(true);

        ImageView dib =(ImageView) findViewById(R.id.diba);
        dib.setVisibility(View.VISIBLE);
        dib.setImageResource(R.drawable.ch7);

        Storage.nosepick = 7;
    }

    public void c8 (View view){
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        TextView test = (TextView)findViewById(R.id.desc);
        test.setText("Chapter 8\n\nGuitai joined your team, an advanced hero from diplet's former team. We spotted a rampaging hampere comming towards your team, it's an advanced hero so we'll be changing your team leader to guitai, so prepair yourself.");

        View b = findViewById(R.id.p);
        b.setVisibility(View.VISIBLE);
        b.setClickable(true);

        View e =findViewById(R.id.likod);
        e.setClickable(true);

        ImageView dib =(ImageView) findViewById(R.id.diba);
        dib.setVisibility(View.VISIBLE);
        dib.setImageResource(R.drawable.ch8);

        Storage.nosepick = 8;
    }

    public void c9 (View view){
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        TextView test = (TextView)findViewById(R.id.desc);
        test.setText("Chapter 9\n\nToursle, an itermediate hero wants to battle you, it brought it's teammates along. Blazelet was amazed by your skills in managing your team and now it wants to help you out, it is also an itermediate hero, let's switch your leader to blazelet then.");

        View b = findViewById(R.id.p);
        b.setVisibility(View.VISIBLE);
        b.setClickable(true);

        View e =findViewById(R.id.likod);
        e.setClickable(true);

        ImageView dib =(ImageView) findViewById(R.id.diba);
        dib.setVisibility(View.VISIBLE);
        dib.setImageResource(R.drawable.ch9);

        Storage.nosepick = 9;
    }

    public void c10 (View view){
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        TextView test = (TextView)findViewById(R.id.desc);
        test.setText("Chapter 10\n\nThe tournament is one fight away. You have to defeat klatzinoir's team to be registered in the tournament. We have our last gift for you, it's an advanced hero, we'll be switching your hero to it, do your best and goodluck.");

        View b = findViewById(R.id.p);
        b.setVisibility(View.VISIBLE);
        b.setClickable(true);

        View e =findViewById(R.id.likod);
        e.setClickable(true);

        ImageView dib =(ImageView) findViewById(R.id.diba);
        dib.setVisibility(View.VISIBLE);
        dib.setImageResource(R.drawable.ch10);

        Storage.nosepick = 10;
    }

    public void onBackPressed(){
        if (MainActivity.bgm.isPlaying()) {
            MainActivity.bgm.pause();
            MainActivity.pos = MainActivity.bgm.getCurrentPosition();
            MainActivity.bgm.stop();
        }

        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        Intent test = new Intent(this, QuitGame.class);
        startActivity(test);

    }

}
