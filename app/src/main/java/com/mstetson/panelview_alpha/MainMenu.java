package com.mstetson.panelview_alpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        makeFullscreen();
    }

    public void gotoMainMenu(View view) {

            Toast.makeText(getApplicationContext(),
                    "Button is clicked", Toast.LENGTH_LONG).show();
    }

    //Hides nav and notification bar
    public void makeFullscreen() {
            View decorView = getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
            decorView.setSystemUiVisibility(uiOptions);
    }

}
