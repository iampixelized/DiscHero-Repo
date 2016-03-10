package com.thedebelopers.discheroes;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.thedebelopers.discheroes.Storage;


public class CollectPhase extends AppCompatActivity {
    int choice = Storage.nosepick;

    private SeekBar seekBar = null;
    boolean NotTouched = true;
    int i1 = 0;
    private View pogstack;
    int []teamleft;
    int []teamright;
    int []stackofpogs = new int [20];

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

        View left = findViewById(R.id.pog1);
        View right = findViewById(R.id.pog2);

        aa = (TextView) findViewById(R.id.team1);
        ab = (TextView) findViewById(R.id.team2);
        TextView ac = (TextView) findViewById(R.id.counter);
        Typeface ampersand = Typeface.createFromAsset(getAssets(), "fonts/ampersand.ttf");
        aa.setTypeface(ampersand);
        ab.setTypeface(ampersand);
        ac.setTypeface(ampersand);

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


        switch (Storage.nosepick){
            case 1:
                aa.setText("Team Flameling");
                ab.setText("Team Dummie");
                left.setBackgroundResource(R.drawable.pogs001);
                right.setBackgroundResource(R.drawable.pogs000);
                teamleft = new int[]{1};
                teamright = new int[]{22};

                break;

            case 2:
                aa.setText("Team Flameling");
                ab.setText("Team Mushbro");
                left.setBackgroundResource(R.drawable.pogs001);
                right.setBackgroundResource(R.drawable.pogs004);
                teamleft = new int[]{1};
                teamright = new int[]{4};

                break;

            case 3:
                aa.setText("Team Leafle");
                ab.setText("Team Mushbrad");
                left.setBackgroundResource(R.drawable.pogs010);
                right.setBackgroundResource(R.drawable.pogs005);
                teamleft = new int[]{4,1,1};
                teamright = new int[]{4,4,4};

                break;

            case 4:
                aa.setText("Team Seedshell");
                ab.setText("Team Mushboss");
                left.setBackgroundResource(R.drawable.pogs011);
                right.setBackgroundResource(R.drawable.pogs006);
                teamleft = new int[]{10,4,1,1};
                teamright = new int[]{5,4,4,4};

                break;

            case 5:
                aa.setText("Team Seedwing");
                ab.setText("Team Hampere");
                left.setBackgroundResource(R.drawable.pogs012);
                right.setBackgroundResource(R.drawable.pogs009);
                teamleft = new int[]{11,10,4,1,1};
                teamright = new int[]{5,5,4,4,4};

                break;

            case 6:
                aa.setText("Team Driplet");
                ab.setText("Team Sparkie");
                left.setBackgroundResource(R.drawable.pogs013);
                right.setBackgroundResource(R.drawable.pogs007);
                teamleft = new int[]{12,11,10,4,1,1};
                teamright = new int[]{7,7,7,7,7,7};

                break;

            case 7:
                aa.setText("Team Angii");
                ab.setText("Team Sparkie");
                left.setBackgroundResource(R.drawable.pogs014);
                right.setBackgroundResource(R.drawable.pogs008);
                teamleft = new int[]{13,12,11,10,4,1,1};
                teamright = new int[]{8,8,8,8,8,8,8};

                break;

            case 8:
                aa.setText("Team Guitai");
                ab.setText("Team Hampere");
                left.setBackgroundResource(R.drawable.pogs015);
                right.setBackgroundResource(R.drawable.pogs009);
                teamleft = new int[]{14,13,12,11,10,4,1,1};
                teamright = new int[]{8,8,8,8,7,7,7,7};

                break;

            case 9:
                aa.setText("Team Blazelet");
                ab.setText("Team Toursle");
                left.setBackgroundResource(R.drawable.pogs002);
                right.setBackgroundResource(R.drawable.pogs017);
                teamleft = new int[]{15,14,13,12,11,10,4,1,1};
                teamright = new int[]{17,17,17,17,16,16,16,16,16};

                break;

            case 10:
                aa.setText("Team Blazekrieg");
                ab.setText("Team Klatzinoir");
                left.setBackgroundResource(R.drawable.pogs003);
                right.setBackgroundResource(R.drawable.pogs021);
                teamleft = new int[]{2,15,14,13,12,11,10,4,1,1};
                teamright = new int[]{20,14,11,5,19,16,13,10,4,1};

                break;
        }

        int pogscounter=0;

        for(int i= 0; i <teamleft.length; i++){
            stackofpogs[i] = teamleft[i];
            pogscounter++;
        }

        for(int i = 0; i < teamright.length; i++ ){
            stackofpogs[teamleft.length] = teamright[i];
            pogscounter++;
        }

        ac.setText(pogscounter+" POG(s) left");

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


                        if (seekBar.getProgress() > 1 && seekBar.getProgress() < 42) {

                        }


                        if (seekBar.getProgress() > 41 && seekBar.getProgress() < 86) {

                        }


                        if (seekBar.getProgress() > 85 && seekBar.getProgress() < 2) {

                        }

                        seekBarThread.sleep(1000);
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