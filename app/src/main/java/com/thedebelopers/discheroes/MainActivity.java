package com.thedebelopers.discheroes;


import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static MediaPlayer bgm;
    public static int pos = 0;
    TextView b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        MediaPlayer bgm = MediaPlayer.create(getApplicationContext(),R.raw.book_close);
        bgm.seekTo(pos);

        b1 = (TextView) findViewById(R.id.play);
        b2= (TextView) findViewById(R.id.extras);
        b3= (TextView) findViewById(R.id.quit);
        Typeface ampersand = Typeface.createFromAsset(getAssets(), "fonts/ampersand.ttf");
        b1.setTypeface(ampersand);
        b2.setTypeface(ampersand);
        b3.setTypeface(ampersand);


    }

    public void play (View view) {


        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        Intent test = new Intent(this, StoryMenu.class);
        startActivity(test);
    }

    public void extras (View view) {


        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        Intent test = new Intent(this, ExtrasMenu.class);
        startActivity(test);
    }

    public void quit (View view) {


        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        Intent test = new Intent(this, QuitGame.class);
        startActivity(test);
    }

    public void onBackPressed(){

        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        Intent test = new Intent(this, QuitGame.class);
        startActivity(test);
    }
}