package com.thedebelopers.discheroes;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Gallery extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper image_flipper, textname_flipper, textattrib_flipper, textinfo_flipper;
    ImageView flameling, blazelet, blazekrieg, mushbro, mushbrad, mushboss, sparkie, sparkchop, hampere, leafle, seedshell, seedwing, driplet, angii, guitai, footle, toursle, manangle, shidden, nyadow, klatzinoir, dummie;
    TextView name_flameling, attrib_flameling, info_flameling;
    TextView name_blazelet, attrib_blazelet, info_blazelet;
    TextView name_blazekrieg, attrib_blazekrieg, info_blazekrieg;
    TextView name_mushbro, attrib_mushbro, info_mushbro;
    TextView name_mushbrad, attrib_mushbrad, info_mushbrad;
    TextView name_mushboss, attrib_mushboss, info_mushboss;
    TextView name_sparkie, attrib_sparkie, info_sparkie;
    TextView name_sparkchop, attrib_sparkchop, info_sparkchop;
    TextView name_hampere, attrib_hampere, info_hampere;
    TextView name_leafle, attrib_leafle, info_leafle;
    TextView name_seedshell, attrib_seedshell, info_seedshell;
    TextView name_seedwing, attrib_seedwing, info_seedwing;
    TextView name_driplet, attrib_driplet, info_driplet;
    TextView name_angii, attrib_angii, info_angii;
    TextView name_guitai, attrib_guitai, info_guitai;
    TextView name_footle, attrib_footle, info_footle;
    TextView name_toursle, attrib_toursle, info_toursle;
    TextView name_manangle, attrib_manangle, info_manangle;
    TextView name_shidden, attrib_shidden, info_shidden;
    TextView name_nyadow, attrib_nyadow, info_nyadow;
    TextView name_klatzinoir, attrib_klatzinoir, info_klatzinoir;
    TextView name_dummie, attrib_dummie, info_dummie;


    Button previous, next, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        MediaPlayer bgm = MediaPlayer.create(getApplicationContext(), R.raw.mus_temvillage);
        bgm.setLooping(true);
        bgm.start();

        image_flipper = (ViewFlipper) findViewById(R.id.image_flipper);
        textname_flipper = (ViewFlipper) findViewById(R.id.textname_flipper);
        textattrib_flipper = (ViewFlipper) findViewById(R.id.textattrib_flipper);
        textinfo_flipper = (ViewFlipper) findViewById(R.id.textinfo_flipper);

        flameling = (ImageView) findViewById(R.id.flameling);
        flameling.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable) flameling.getBackground()).start();
            }
        });

        blazelet = (ImageView) findViewById(R.id.blazelet);
        blazekrieg = (ImageView) findViewById(R.id.blazekrieg);
        mushbro = (ImageView) findViewById(R.id.mushbro);
        mushbrad = (ImageView) findViewById(R.id.mushbrad);
        mushboss = (ImageView) findViewById(R.id.mushboss);
        sparkie = (ImageView) findViewById(R.id.sparkie);
        sparkchop = (ImageView) findViewById(R.id.sparkchop);
        hampere = (ImageView) findViewById(R.id.hampere);
        leafle = (ImageView) findViewById(R.id.leafle);
        seedshell = (ImageView) findViewById(R.id.seedshell);
        seedwing = (ImageView) findViewById(R.id.seedwing);
        driplet = (ImageView) findViewById(R.id.driplet);
        angii = (ImageView) findViewById(R.id.angii);
        guitai = (ImageView) findViewById(R.id.guitai);
        footle = (ImageView) findViewById(R.id.footle);
        toursle = (ImageView) findViewById(R.id.toursle);
        manangle = (ImageView) findViewById(R.id.manangle);
        shidden = (ImageView) findViewById(R.id.shidden);
        nyadow = (ImageView) findViewById(R.id.nyadow);
        klatzinoir = (ImageView) findViewById(R.id.klatzinoir);
        dummie = (ImageView) findViewById(R.id.dummie);


        name_flameling = (TextView) findViewById(R.id.name_flameling);
        name_blazelet = (TextView) findViewById(R.id.name_blazelet);
        name_blazekrieg = (TextView) findViewById(R.id.name_blazekrieg);
        name_mushbro = (TextView) findViewById(R.id.name_mushbro);
        name_mushbrad = (TextView) findViewById(R.id.name_mushbrad);
        name_mushboss = (TextView) findViewById(R.id.name_mushboss);
        name_sparkie = (TextView) findViewById(R.id.name_sparkie);
        name_sparkchop = (TextView) findViewById(R.id.name_sparkchop);
        name_hampere = (TextView) findViewById(R.id.name_hampere);
        name_leafle = (TextView) findViewById(R.id.name_leafle);
        name_seedshell = (TextView) findViewById(R.id.name_seedshell);
        name_seedwing = (TextView) findViewById(R.id.name_seedwing);
        name_driplet = (TextView) findViewById(R.id.name_driplet);
        name_angii = (TextView) findViewById(R.id.name_angii);
        name_guitai = (TextView) findViewById(R.id.name_guitai);
        name_footle = (TextView) findViewById(R.id.name_footle);
        name_toursle = (TextView) findViewById(R.id.name_toursle);
        name_manangle = (TextView) findViewById(R.id.name_manangle);
        name_shidden = (TextView) findViewById(R.id.name_shidden);
        name_nyadow = (TextView) findViewById(R.id.name_nyadow);
        name_klatzinoir = (TextView) findViewById(R.id.name_klatzinoir);
        name_dummie = (TextView) findViewById(R.id.name_dummie);


        attrib_flameling = (TextView) findViewById(R.id.attrib_flameling);
        attrib_blazelet = (TextView) findViewById(R.id.attrib_blazelet);
        attrib_blazekrieg = (TextView) findViewById(R.id.attrib_blazekrieg);
        attrib_mushbro = (TextView) findViewById(R.id.attrib_mushbro);
        attrib_mushbrad = (TextView) findViewById(R.id.attrib_mushbrad);
        attrib_mushboss = (TextView) findViewById(R.id.attrib_mushboss);
        attrib_sparkie = (TextView) findViewById(R.id.attrib_sparkie);
        attrib_sparkchop = (TextView) findViewById(R.id.attrib_sparkchop);
        attrib_hampere = (TextView) findViewById(R.id.attrib_hampere);
        attrib_leafle = (TextView) findViewById(R.id.attrib_leafle);
        attrib_seedshell = (TextView) findViewById(R.id.attrib_seedshell);
        attrib_seedwing = (TextView) findViewById(R.id.attrib_seedwing);
        attrib_driplet = (TextView) findViewById(R.id.attrib_driplet);
        attrib_angii = (TextView) findViewById(R.id.attrib_angii);
        attrib_guitai = (TextView) findViewById(R.id.attrib_guitai);
        attrib_footle = (TextView) findViewById(R.id.attrib_footle);
        attrib_toursle = (TextView) findViewById(R.id.attrib_toursle);
        attrib_manangle = (TextView) findViewById(R.id.attrib_manangle);
        attrib_shidden = (TextView) findViewById(R.id.attrib_shidden);
        attrib_nyadow = (TextView) findViewById(R.id.attrib_nyadow);
        attrib_klatzinoir = (TextView) findViewById(R.id.attrib_klatzinoir);
        attrib_dummie = (TextView) findViewById(R.id.attrib_dummie);

        info_flameling = (TextView) findViewById(R.id.info_flameling);
        info_blazekrieg = (TextView) findViewById(R.id.info_blazekrieg);
        info_blazelet = (TextView) findViewById(R.id.info_blazelet);
        info_mushbro = (TextView) findViewById(R.id.info_mushbro);
        info_mushbrad = (TextView) findViewById(R.id.info_mushbrad);
        info_mushboss = (TextView) findViewById(R.id.info_mushboss);
        info_sparkie = (TextView) findViewById(R.id.info_sparkie);
        info_sparkchop = (TextView) findViewById(R.id.info_sparkchop);
        info_hampere = (TextView) findViewById(R.id.info_hampere);
        info_leafle = (TextView) findViewById(R.id.info_leafle);
        info_seedshell = (TextView) findViewById(R.id.info_seedshell);
        info_seedwing = (TextView) findViewById(R.id.info_seedwing);
        info_driplet = (TextView) findViewById(R.id.info_driplet);
        info_angii = (TextView) findViewById(R.id.info_angii);
        info_guitai = (TextView) findViewById(R.id.info_guitai);
        info_footle = (TextView) findViewById(R.id.info_footle);
        info_toursle = (TextView) findViewById(R.id.info_toursle);
        info_manangle = (TextView) findViewById(R.id.info_manangle);
        info_shidden = (TextView) findViewById(R.id.info_shidden);
        info_nyadow = (TextView) findViewById(R.id.info_nyadow);
        info_klatzinoir = (TextView) findViewById(R.id.info_klatzinoir);
        info_dummie = (TextView) findViewById(R.id.info_dummie);

        next = (Button) findViewById(R.id.next);
        previous = (Button) findViewById(R.id.previous);
        back = (Button) findViewById(R.id.back);

        next.setOnClickListener(this);
        previous.setOnClickListener(this);
        back.setOnClickListener(this);

    }

    public void running(int child) {
        switch(child) {
            case 0:
                flameling.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) flameling.getBackground()).start();
                    }
                });
                break;
            case 1:
                blazelet.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) blazelet.getBackground()).start();
                    }
                });
                break;
            case 2:
                blazekrieg.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) blazekrieg.getBackground()).start();
                    }
                });
                break;
            case 3:
                mushbro.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) mushbro.getBackground()).start();
                    }
                });
                break;
            case 4:
                mushbrad.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) mushbrad.getBackground()).start();
                    }
                });
                break;
            case 5:
                mushboss.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) mushboss.getBackground()).start();
                    }
                });
                break;
            case 6:
                sparkie.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) sparkie.getBackground()).start();
                    }
                });
                break;
            case 7:
                sparkchop.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) sparkchop.getBackground()).start();
                    }
                });
                break;
            case 8:
                hampere.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) hampere.getBackground()).start();
                    }
                });
                break;
            case 9:
                leafle.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) leafle.getBackground()).start();
                    }
                });
                break;
            case 10:
                seedshell.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) seedshell.getBackground()).start();
                    }
                });
                break;
            case 11:
                seedwing.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) seedwing.getBackground()).start();
                    }
                });
                break;
            case 12:
                driplet.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) driplet.getBackground()).start();
                    }
                });
                break;
            case 13:
                angii.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) angii.getBackground()).start();
                    }
                });
                break;
            case 14:
                guitai.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) guitai.getBackground()).start();
                    }
                });
                break;
            case 15:
                footle.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) footle.getBackground()).start();
                    }
                });
                break;
            case 16:
                toursle.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) toursle.getBackground()).start();
                    }
                });
                break;
            case 17:
                manangle.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) manangle.getBackground()).start();
                    }
                });
                break;
            case 18:
                shidden.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) shidden.getBackground()).start();
                    }
                });
                break;
            case 19:
                nyadow.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) nyadow.getBackground()).start();
                    }
                });
                break;
            case 20:
                klatzinoir.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) klatzinoir.getBackground()).start();
                    }
                });
                break;
            case 21:
                dummie.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) dummie.getBackground()).start();
                    }
                });
                break;
        }
    }

    @Override
    public void onClick(View v) {
        int child;
        switch (v.getId()) {
            case R.id.next:
                image_flipper.showNext();
                child = image_flipper.getDisplayedChild();
                running(child);
                textname_flipper.showNext();
                textattrib_flipper.showNext();
                textinfo_flipper.showNext();
                break;
            case R.id.previous:
                image_flipper.showPrevious();
                child = image_flipper.getDisplayedChild();
                running(child);
                textname_flipper.showPrevious();
                textattrib_flipper.showPrevious();
                textinfo_flipper.showPrevious();
                break;
            case R.id.back:
                if (MainActivity.bgm.isPlaying()) {
                    MainActivity.bgm.pause();
                    MainActivity.pos = MainActivity.bgm.getCurrentPosition();
                    MainActivity.bgm.stop();
                }
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
                mp.start();

                Intent test = new Intent(this, ExtrasMenu.class);
                startActivity(test);
                break;
    }


    }

    public void onBackPressed(){
        if (MainActivity.bgm.isPlaying()) {
            MainActivity.bgm.stop();
        }
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.book_flip);
        mp.start();

        Intent test = new Intent(this, QuitGame.class);
        startActivity(test);

    }


}
