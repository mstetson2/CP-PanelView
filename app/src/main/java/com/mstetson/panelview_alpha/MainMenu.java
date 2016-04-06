package com.mstetson.panelview_alpha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.mstetson.panelview_alpha.Screens.EStopStatus;
import com.mstetson.panelview_alpha.Screens.LoginActivity;
import com.mstetson.panelview_alpha.Screens.ScreenSelect;

public class MainMenu extends AppCompatActivity {

    TextView currentScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        currentScreen = (TextView) findViewById(R.id.current_screen);
        currentScreen.setText("Main Menu");

        makeFullscreen();
    }

    //Hides nav and notification bar
    public void makeFullscreen() {
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);
    }
    public void gotoScreenSelect(View view) {
        startActivity(new Intent(getApplicationContext(), ScreenSelect.class));
        // finish();
    }
    public void gotoLogin(View view) {
        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
    }
    public void gotoLogout(View view) {

        Toast.makeText(getApplicationContext(),
                "Button is clicked", Toast.LENGTH_LONG).show();
    }
    public void gotoError(View view) {
        Toast.makeText(getApplicationContext(),
                "Button is clicked", Toast.LENGTH_LONG).show();
    }
    public void gotoEstop(View view) {
        startActivity(new Intent(getApplicationContext(), EStopStatus.class));
    }
}
