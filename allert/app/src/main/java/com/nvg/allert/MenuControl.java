package com.nvg.allert;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuControl extends Activity {

    ImageView imgAlert;
    TextView tvAlerts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        init();
    }
    void init(){
        this.imgAlert = (ImageView)this.findViewById(R.id.imageView);           // подключаем картинку
        imgAlert.setImageResource(R.drawable.imgbin_warning_sign_scalable_graphics_alert_s_000a22vvemw5d3pxss8cuzq8y_300x212);  // находим её по имени в draweble
        tvAlerts = findViewById(R.id.txtViewInfoAlerts);
        tvAlerts.setText("This Braun watch is a reissue of the original 1970's design from renowned design team Dietrich Lubs and Dieter " +
                "Rams, both of whom have work featured in the Museum’s collection. " +
                "The large "+ getNumAlertsFromAI() +" alerts features a numbered face, and the smaller watch has only index lines.");
    }

    public void onClickSelectMap(View view)     //переходим на новую активити
    {
        Intent i = new Intent(MenuControl.this, MapsActivity.class);
        startActivity(i);
    }
    public void onClickSelectChoseRegion(View view)     //переходим на новую активити
    {
        Intent in = new Intent(MenuControl.this, ChoseRegion.class);
        startActivity(in);
    }

    public int getNumAlertsFromAI(){
        //получаем количетсво алертов на сегодняшний или завтрашний день
        return 0;
    }
}
