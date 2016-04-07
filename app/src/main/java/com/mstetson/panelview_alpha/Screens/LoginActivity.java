package com.mstetson.panelview_alpha.Screens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.mstetson.panelview_alpha.MainMenu;
import com.mstetson.panelview_alpha.R;

public class LoginActivity extends Activity {

    TextView currentScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        currentScreen = (TextView) findViewById(R.id.current_screen);
        currentScreen.setText("LOGIN");

        makeFullscreen();
    }

    //Hides nav and notification bar
    public void makeFullscreen() {
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);
    }


    public void gotoMenu(View view) {
        startActivity(new Intent(getApplicationContext(), MainMenu.class));
        // finish();
    }

    public void gotoError(View view) {
        Toast.makeText(getApplicationContext(),
                "Button is clicked", Toast.LENGTH_SHORT).show();
    }
    public void gotoEstop(View view) {
        startActivity(new Intent(getApplicationContext(), EStopStatus.class));
    }

}
