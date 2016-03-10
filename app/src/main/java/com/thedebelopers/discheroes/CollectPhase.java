package com.thedebelopers.discheroes;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.thedebelopers.discheroes.Storage;


public class CollectPhase extends AppCompatActivity {
    int choice = Storage.nosepick;

    private SeekBar seekBar = null;
    boolean NotTouched = true;
    int i1 = 0;
    private View pogstack;

    private Thread seekBarThread = new Thread() {
        @Override
        public void run() {
            while (NotTouched) {
                try {
                    i1 += 1;
                    if (seekBar.getProgress() == seekBar.getMax()) {
                        seekBar.setProgress(0);
                        i1 = 0;
                    } else seekBar.setProgress(i1);
                    Thread.sleep(2);
                } catch (Exception ex) {
                }
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView aa, ab, ad, ae, af, ag; // ah;

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.phase_collect);

        aa = (TextView) findViewById(R.id.team1);
        ab = (TextView) findViewById(R.id.team2);
        final TextView ac = (TextView) findViewById(R.id.counter);
        ad = (TextView) findViewById(R.id.saved1);
        ae = (TextView) findViewById(R.id.saved2);
        af = (TextView) findViewById(R.id.capt1);
        ag = (TextView) findViewById(R.id.capt2);

        Typeface ampersand = Typeface.createFromAsset(getAssets(), "fonts/ampersand.ttf");
        aa.setTypeface(ampersand);
        ab.setTypeface(ampersand);
        ac.setTypeface(ampersand);
        ad.setTypeface(ampersand);
        ae.setTypeface(ampersand);
        af.setTypeface(ampersand);
        ag.setTypeface(ampersand);

        MediaPlayer bgm = MediaPlayer.create(getApplicationContext(), R.raw.mus_battle2);
        bgm.setVolume(0.75f, 0.75f);
        bgm.setLooping(true);
        bgm.start();

        seekBar = (SeekBar) findViewById(R.id.gauge);
        seekBar.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
        try {
            seekBarThread.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        pogstack = findViewById(R.id.stack);

        pogstack.setOnTouchListener(new View.OnTouchListener() {
            //@TargetApi(Build.VERSION_CODES.KITKAT)
            public boolean onTouch(View v, MotionEvent evt) {
                if ((evt.getAction() == MotionEvent.ACTION_DOWN)) {
                    try {
                        View taphere = findViewById(R.id.taphere);
                        taphere.setVisibility(View.INVISIBLE);


                        //setProgress 0 to 39 red
                        //setProgress 40 to 83 yellow
                        //setProgress 84 to 100 green

                        int duration = 0;
                        Toast toast1, toast2;

                        if (seekBar.getProgress() >= 0 && seekBar.getProgress() <= 39) {
                            toast1 = Toast.makeText(getApplicationContext(), "MISSED!", Toast.LENGTH_SHORT);
                            toast1.show();
                            duration = toast1.getDuration();
                            toast2 = Toast.makeText(getApplicationContext(), "Enemy's Turn!", Toast.LENGTH_SHORT);
                            toast2.show();
                            duration = duration + toast2.getDuration();
                        }

                        if (seekBar.getProgress() >= 40 && seekBar.getProgress() <= 83) {
                            toast1 = Toast.makeText(getApplicationContext(), "HIT! You got a POG", Toast.LENGTH_SHORT);
                            toast1.show();
                            duration = toast1.getDuration();
                            toast2 = Toast.makeText(getApplicationContext(), "Enemy's Turn", Toast.LENGTH_SHORT);
                            toast2.show();
                            duration = duration + toast2.getDuration();
                        }

                        if (seekBar.getProgress() >= 84 && seekBar.getProgress() <= 100) {
                            toast1 = Toast.makeText(getApplicationContext(), "SLAM! You got a POG", Toast.LENGTH_SHORT);
                            toast1.show();
                            duration = toast1.getDuration();
                            toast2 = Toast.makeText(getApplicationContext(), "You take another turn!", Toast.LENGTH_SHORT);
                            toast2.show();
                            duration = duration + toast2.getDuration();
                        }

                        seekBarThread.sleep(1000 + duration);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return true;
            }
        });
    }

    public void onBackPressed() {
        if (MainActivity.bgm.isPlaying()) {
            MainActivity.bgm.stop();
        }
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.book_flip);
        mp.start();

        Intent test = new Intent(this, StoryMenu.class);
        startActivity(test);

    }

}